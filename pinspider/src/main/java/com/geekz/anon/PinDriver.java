package com.geekz.anon;

import com.google.protobuf.ByteString;
import org.apache.log4j.Logger;
import org.apache.mesos.MesosSchedulerDriver;
import org.apache.mesos.Protos;
import org.apache.mesos.Scheduler;

/**
 * @author swathi on 12/24/14.
 */
public class PinDriver {

	private final static Logger LOGGER = Logger.getLogger(PinDriver.class);

	public static void main(String[] args) {
		if (args.length < 1 || args.length > 3) {
			usage();
			System.exit(1);
		}

		String path = System.getProperty("user.dir")+"/pinspider-1.0-SNAPSHOT-jar-with-dependencies.jar";
//		try {
//			path = new File("pinspider-1.0-SNAPSHOT-jar-with-dependencies.jar").getCanonicalPath();
//		} catch (IOException e) {
//
//			LOGGER.error("file jar not found" + e.getMessage());
//		}

		Protos.CommandInfo.URI uri = Protos.CommandInfo.URI.newBuilder().setValue(path).setExtract(false).build();
		String commandPinSpiderExecutor = "java -cp pinspider-1.0-SNAPSHOT-jar-with-dependencies.jar com.geekz.anon.PinExecutor";

		Protos.CommandInfo commandInfo = Protos.CommandInfo.newBuilder().setValue(commandPinSpiderExecutor).addUris(uri)
														   .build();

		Protos.ExecutorInfo executorInfo = Protos.ExecutorInfo.newBuilder().setExecutorId(
				Protos.ExecutorID.newBuilder().setValue("PinExecutor")).setCommand(commandInfo)
															  .setName("Pin Executor Java").setSource("java").build();

		Protos.FrameworkInfo.Builder frameworkBuilder = Protos.FrameworkInfo.newBuilder().setFailoverTimeout(120000)
																			.setUser("").setName("Pinspider Framework");

		if (System.getenv("MESOS_CHECKPOINT") != null) {
			System.out.println("Enabling checkpoint for the framework");
			frameworkBuilder.setCheckpoint(true);
		}

		Scheduler scheduler = args.length == 1 ?
				new PinScheduler(executorInfo) :
				new PinScheduler(executorInfo, Integer.parseInt(args[1]), args[2]);

		MesosSchedulerDriver schedulerDriver = null;

		if (System.getenv("MESOS_AUTHENTICATE") != null) {
			LOGGER.info("Enabling authentication for the framework");

			if (System.getenv("DEFAULT_PRINCIPAL") == null) {
				LOGGER.error("Expecting authentication principal");
				System.exit(1);
			}

			if (System.getenv("DEFAULT_SECRET") == null) {
				LOGGER.error("Expecting authentication secret");
				System.exit(1);
			}

			Protos.Credential credential = Protos.Credential.newBuilder()
															.setPrincipal(System.getenv("DEFAULT_PRINCIPAL")).setSecret(
							ByteString.copyFrom(System.getenv("DEFAULT_SECRET").getBytes())).build();

			frameworkBuilder.setPrincipal(System.getenv("DEFAULT_PRINCIPAL"));

			schedulerDriver = new MesosSchedulerDriver(scheduler, frameworkBuilder.build(), args[0], credential);
		} else {
			frameworkBuilder.setPrincipal("test-framework-java");
			schedulerDriver = new MesosSchedulerDriver(scheduler, frameworkBuilder.build(), args[0]);
		}

		int status = schedulerDriver.run() == Protos.Status.DRIVER_STOPPED ? 0 : 1;
		schedulerDriver.stop();
		System.exit(status);
	}

	private static void usage() {
		String name = PinScheduler.class.getName();
		System.err.println("Usage : " + name + "master <tasks> <pinterest_user_URL>");
		System.err.println("<pinterest_user_URL> example: http://www.pinterest.com/techcrunch");
	}

}
