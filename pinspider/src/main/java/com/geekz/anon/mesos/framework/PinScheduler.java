package com.geekz.anon.mesos.framework;

import com.google.protobuf.ByteString;
import org.apache.log4j.Logger;
import org.apache.mesos.Protos;
import org.apache.mesos.Scheduler;
import org.apache.mesos.SchedulerDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author swathi on 12/24/14.
 */
public class PinScheduler implements Scheduler {

	private final static Logger LOGGER = Logger.getLogger(PinScheduler.class);

	private final Protos.ExecutorInfo pinUserProfileExecutor, pinUserBoardExecutor;
	private final int totalTasks;
	private List<String> crawlQueue;
	private int launchedTasks = 0;
	private int finishedTasks = 0;

	public PinScheduler(Protos.ExecutorInfo pinUserProfileExecutor , Protos.ExecutorInfo pinUserBoardExecutor ) {
		this(pinUserProfileExecutor,pinUserBoardExecutor, 5, "http://www.pinterest.com/techcrunch");

	}

	public PinScheduler(Protos.ExecutorInfo pinUserProfileExecutor,Protos.ExecutorInfo pinUserBoardExecutor,  int totalTasks, String url) {
		this.pinUserProfileExecutor = pinUserProfileExecutor;
		this.pinUserBoardExecutor = pinUserBoardExecutor;
		this.totalTasks = totalTasks;
		this.crawlQueue = Collections.synchronizedList(new ArrayList<String>());
		this.crawlQueue.add(url);
	}

	@Override public void registered(SchedulerDriver schedulerDriver, Protos.FrameworkID frameworkID,
			Protos.MasterInfo masterInfo) {
		LOGGER.info("Registered! ID = " + frameworkID.getValue());
	}

	@Override public void reregistered(SchedulerDriver schedulerDriver, Protos.MasterInfo masterInfo) {

	}

	@Override public void resourceOffers(SchedulerDriver schedulerDriver, List<Protos.Offer> list) {
		double CPUS_PER_TASK = 1;
		double MEM_PER_TASK = 128;

		for (Protos.Offer offer : list) {
			List<Protos.TaskInfo> taskInfoList = new ArrayList<Protos.TaskInfo>();
			double offerCpus = 0;
			double offerMem = 0;
			for (Protos.Resource resource : offer.getResourcesList()) {
				if (resource.getName().equals("cpus")) {
					offerCpus += resource.getScalar().getValue();
				} else if (resource.getName().equals("mem")) {
					offerMem += resource.getScalar().getValue();
				}
			}
			LOGGER.info("Received Offer : " + offer.getId().getValue() + " with cpus = " + offerCpus + " and mem ="
					+ offerMem);

			double remainingCpus = offerCpus;
			double remainingMem = offerMem;

			if (launchedTasks < totalTasks && remainingCpus >= CPUS_PER_TASK && remainingMem >= MEM_PER_TASK) {
				Protos.TaskID taskID = Protos.TaskID.newBuilder().setValue(Integer.toString(launchedTasks++)).build();
				LOGGER.info("Launching task :" + taskID.getValue() + " using the offer : " + offer.getId().getValue());

				String url = crawlQueue.get(0);
				LOGGER.info("URL Obtained :" + url);

				Protos.TaskInfo pinUserProfileTaskInfo = Protos.TaskInfo.newBuilder().setName("task " + taskID.getValue())
														  .setTaskId(taskID).setSlaveId(offer.getSlaveId())
														  .addResources(Protos.Resource.newBuilder().setName("cpus")
																					   .setType(
																							   Protos.Value.Type.SCALAR)
																					   .setScalar(Protos.Value.Scalar
																							   .newBuilder().setValue(
																									   CPUS_PER_TASK)))
														  .addResources(Protos.Resource.newBuilder().setName("mem")
																					   .setType(
																							   Protos.Value.Type.SCALAR)
																					   .setScalar(Protos.Value.Scalar
																							   .newBuilder()
																							   .setValue(MEM_PER_TASK)))
														  .setData(ByteString.copyFromUtf8(crawlQueue.get(0)))
														  .setExecutor(Protos.ExecutorInfo.newBuilder(
																  pinUserProfileExecutor))
														  .build();

				taskID = Protos.TaskID.newBuilder().setValue(Integer.toString(launchedTasks++)).build();
				LOGGER.info("Launching task :" + taskID.getValue() + " using the offer : " + offer.getId().getValue());

				Protos.TaskInfo pinUserBoardTaskInfo = Protos.TaskInfo.newBuilder().setName("task " + taskID.getValue())
														  .setTaskId(taskID).setSlaveId(offer.getSlaveId())
														  .addResources(Protos.Resource.newBuilder().setName("cpus")
																					   .setType(
																							   Protos.Value.Type.SCALAR)
																					   .setScalar(Protos.Value.Scalar
																							   .newBuilder().setValue(
																									   CPUS_PER_TASK)))
														  .addResources(Protos.Resource.newBuilder().setName("mem")
																					   .setType(
																							   Protos.Value.Type.SCALAR)
																					   .setScalar(Protos.Value.Scalar
																							   .newBuilder()
																							   .setValue(MEM_PER_TASK)))
														  .setData(ByteString.copyFromUtf8(crawlQueue.get(0)))
														  .setExecutor(Protos.ExecutorInfo.newBuilder(
																  pinUserBoardExecutor))
														  .build();

				taskInfoList.add(pinUserProfileTaskInfo);
				taskInfoList.add(pinUserBoardTaskInfo);

			}
			schedulerDriver.launchTasks(offer.getId(), taskInfoList);
		}
	}

	@Override public void offerRescinded(SchedulerDriver schedulerDriver, Protos.OfferID offerID) {

	}

	@Override public void statusUpdate(SchedulerDriver schedulerDriver, Protos.TaskStatus taskStatus) {
		LOGGER.info(
				"Status update : Task ID " + taskStatus.getTaskId().getValue() + "in state : " + taskStatus.getState()
																										   .getValueDescriptor()
																										   .getName());
		if (taskStatus.getState() == Protos.TaskState.TASK_FINISHED) {
			finishedTasks++;
			LOGGER.info("Finished tasks : " + finishedTasks);
			if (finishedTasks == totalTasks) {
				schedulerDriver.stop();
			}
		}

		if (taskStatus.getState() == Protos.TaskState.TASK_FAILED
				|| taskStatus.getState() == Protos.TaskState.TASK_KILLED
				|| taskStatus.getState() == Protos.TaskState.TASK_LOST) {
			LOGGER.error("Aborting because the task " + taskStatus.getTaskId().getValue() + " is in unexpected state : "
					+ taskStatus.getState().getValueDescriptor().getName() + "with reason : " + taskStatus.getReason()
																										  .getValueDescriptor()
																										  .getName()
					+ " from source : " + taskStatus.getSource().getValueDescriptor().getName() + " with message : "
					+ taskStatus.getMessage());
			schedulerDriver.abort();
		}

	}

	@Override public void frameworkMessage(SchedulerDriver schedulerDriver, Protos.ExecutorID executorID,
			Protos.SlaveID slaveID, byte[] bytes) {
		String data = new String(bytes);
		System.out.println(data);
		LOGGER.info("User Profile Information : " + data);
	}

	@Override public void disconnected(SchedulerDriver schedulerDriver) {

	}

	@Override public void slaveLost(SchedulerDriver schedulerDriver, Protos.SlaveID slaveID) {

	}

	@Override public void executorLost(SchedulerDriver schedulerDriver, Protos.ExecutorID executorID,
			Protos.SlaveID slaveID, int i) {

	}

	@Override public void error(SchedulerDriver schedulerDriver, String s) {
		LOGGER.error("Error : " + s);
	}
}
