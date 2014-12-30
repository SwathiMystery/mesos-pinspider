package com.geekz.anon.mesos.framework;

import com.geekz.anon.model.ImageInfo;
import com.geekz.anon.model.UserBoardInfo;
import org.apache.log4j.Logger;
import org.apache.mesos.Executor;
import org.apache.mesos.ExecutorDriver;
import org.apache.mesos.MesosExecutorDriver;
import org.apache.mesos.Protos;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author swathi on 12/30/14.
 */
public class PinUserBoardExecutor implements Executor {

	private final static Logger LOGGER = Logger.getLogger(PinUserBoardExecutor.class);

	/**
	 * Invoked once the executor driver has been able to successfully
	 * connect with Mesos. In particular, a scheduler can pass some
	 * data to it's executors through the {@link org.apache.mesos.Protos.ExecutorInfo#getData()}
	 * field.
	 *
	 * @param driver        The executor driver that was registered and connected
	 *                      to the Mesos cluster.
	 * @param executorInfo  Describes information about the executor that was
	 *                      registered.
	 * @param frameworkInfo Describes the framework that was registered.
	 * @param slaveInfo     Describes the slave that will be used to launch
	 *                      the tasks for this executor.
	 * @see org.apache.mesos.ExecutorDriver
	 * @see org.apache.mesos.MesosSchedulerDriver
	 */
	@Override public void registered(ExecutorDriver driver, Protos.ExecutorInfo executorInfo,
			Protos.FrameworkInfo frameworkInfo, Protos.SlaveInfo slaveInfo) {
		LOGGER.info("Registered PinUserBoardExecutor on " + slaveInfo.getHostname());
	}

	/**
	 * Invoked when the executor re-registers with a restarted slave.
	 *
	 * @param driver    The executor driver that was re-registered with the
	 *                  Mesos master.
	 * @param slaveInfo Describes the slave that will be used to launch
	 *                  the tasks for this executor.
	 * @see org.apache.mesos.ExecutorDriver
	 */
	@Override public void reregistered(ExecutorDriver driver, Protos.SlaveInfo slaveInfo) {

	}

	/**
	 * Invoked when the executor becomes "disconnected" from the slave
	 * (e.g., the slave is being restarted due to an upgrade).
	 *
	 * @param driver The executor driver that was disconnected.
	 */
	@Override public void disconnected(ExecutorDriver driver) {

	}

	/**
	 * Invoked when a task has been launched on this executor (initiated
	 * via {@link org.apache.mesos.SchedulerDriver#launchTasks}. Note that this task can be
	 * realized with a thread, a process, or some simple computation,
	 * however, no other callbacks will be invoked on this executor
	 * until this callback has returned.
	 *
	 * @param driver The executor driver that launched the task.
	 * @param task   Describes the task that was launched.
	 * @see org.apache.mesos.ExecutorDriver
	 * @see org.apache.mesos.Protos.TaskInfo
	 */
	@Override public void launchTask(ExecutorDriver driver, Protos.TaskInfo task) {
		LOGGER.info("Launching task in PinUserBoardExecutor...");
		Protos.TaskStatus taskStatus = Protos.TaskStatus.newBuilder().setTaskId(task.getTaskId())
														.setState(Protos.TaskState.TASK_RUNNING).build();
		driver.sendStatusUpdate(taskStatus);
		String url = task.getData().toStringUtf8();

		byte[] message = new byte[0];

		try {
			message = ("userboard :" + getUserBoardInfo(url)).getBytes();
		} catch (IOException e) {
			LOGGER.error("Error parsing the Pinterest URL :" + e.getMessage());
		}
		LOGGER.info("Sending framework message and marking task finished." + getClass().getName());
		driver.sendFrameworkMessage(message);

		taskStatus = Protos.TaskStatus.newBuilder().setTaskId(task.getTaskId()).setState(Protos.TaskState.TASK_FINISHED)
									  .build();
		driver.sendStatusUpdate(taskStatus);
	}

	private String getUserBoardInfo(String url) throws IOException {
		Document document;
		List<UserBoardInfo> userBoardInfoList = new ArrayList<UserBoardInfo>();
		try {
			document = Jsoup.connect(url).get();
			Elements elements = getElementsByClass("Board", document);
			for (int i = 0; i < elements.size(); i++) {
				Element boardElement = elements.get(i);
				UserBoardInfo boardInfo = new UserBoardInfo();
				Element boardInfoElement = getFirstOfElementsByClass("boardName", boardElement);
				if (boardInfoElement != null) {

					// Get the title of the board
					Element titleElement = getFirstOfElementsByClass("title", boardInfoElement);
					if (titleElement != null) {
						boardInfo.setTitle(titleElement.text().trim());
					} else {
						boardInfo.setTitle("");
					}

					// Get the board by full name.
					Element boardByFullNameElement = getFirstOfElementsByClass("fullName", boardInfoElement);
					if (boardByFullNameElement != null) {
						boardInfo.setBoardByFullName(boardByFullNameElement.text().trim());
					} else {
						boardInfo.setBoardByFullName("");
					}

					// Get the board URL.
					Element boardHrefElement = boardElement.getElementsByTag("a").get(0);
					if (boardHrefElement != null) {
						boardInfo.setHref(boardHrefElement.attr("href"));
					} else {
						boardInfo.setHref("");
					}

					// Get the board Pins Count.
					Element boardPinsCountElement = getFirstOfElementsByClass("PinCount", boardElement);
					if (boardPinsCountElement != null) {
						boardInfo.setPinCount(boardPinsCountElement.text().trim().split(" ")[0]);
					} else {
						boardInfo.setPinCount("");
					}

					// Get the board Cover image
					Element boardImgCoverElement = getFirstOfElementsByClass("boardCover", boardElement);
					ImageInfo imageInfo = new ImageInfo();
					if (boardImgCoverElement != null) {
						imageInfo.setAlt(boardImgCoverElement.attr("alt"));
						imageInfo.setSrc(boardImgCoverElement.attr("src"));
						boardInfo.setBoardCover(imageInfo);
					} else {
						imageInfo.setAlt("");
						imageInfo.setSrc("");
						boardInfo.setBoardCover(imageInfo);
					}

					// Get the board Thumbs.
					Elements boardThumbsElements = getElementsByClass("boardThumbs", boardElement);
					List<ImageInfo> boardThumbs = new ArrayList<ImageInfo>();
					if (boardThumbsElements != null && !boardThumbsElements.isEmpty()) {
						for (Element boardThumbsElement : boardThumbsElements) {
							ImageInfo imageThumbInfo = new ImageInfo();
							Elements boardThumbsImgElements = boardThumbsElement.getElementsByTag("img");
							for (Element boardThumbsImgElement : boardThumbsImgElements) {
								imageThumbInfo.setAlt(boardThumbsImgElement.attr("alt"));
								imageThumbInfo.setSrc(boardThumbsImgElement.attr("src"));
								boardThumbs.add(imageThumbInfo);
								boardInfo.setBoardThumbs(boardThumbs);

							}
						}
					} else {
						ImageInfo imageThumbInfo = new ImageInfo();
						imageThumbInfo.setAlt("");
						imageThumbInfo.setSrc("");
						boardThumbs.add(imageThumbInfo);
						boardInfo.setBoardThumbs(boardThumbs);
					}

					userBoardInfoList.add(boardInfo);
				}
			}
		} catch (Exception e) {
			LOGGER.error("Error while parsing user board information :" + e.getMessage());
		}
		return userBoardInfoList.toString();
	}

	/**
	 * Invoked when a task running within this executor has been killed
	 * (via {@link org.apache.mesos.SchedulerDriver#killTask}). Note that no
	 * status update will be sent on behalf of the executor, the executor is
	 * responsible for creating a new TaskStatus (i.e., with TASK_KILLED)
	 * and invoking {@link org.apache.mesos.ExecutorDriver#sendStatusUpdate}.
	 *
	 * @param driver The executor driver that owned the task that was killed.
	 * @param taskId The ID of the task that was killed.
	 * @see org.apache.mesos.ExecutorDriver
	 * @see org.apache.mesos.Protos.TaskID
	 */
	@Override public void killTask(ExecutorDriver driver, Protos.TaskID taskId) {

	}

	/**
	 * Invoked when a framework message has arrived for this
	 * executor. These messages are best effort; do not expect a
	 * framework message to be retransmitted in any reliable fashion.
	 *
	 * @param driver The executor driver that received the message.
	 * @param data   The message payload.
	 * @see org.apache.mesos.ExecutorDriver
	 */
	@Override public void frameworkMessage(ExecutorDriver driver, byte[] data) {

	}

	/**
	 * Invoked when the executor should terminate all of it's currently
	 * running tasks. Note that after Mesos has determined that an
	 * executor has terminated any tasks that the executor did not send
	 * terminal status updates for (e.g. TASK_KILLED, TASK_FINISHED,
	 * TASK_FAILED, etc) a TASK_LOST status update will be created.
	 *
	 * @param driver The executor driver that should terminate.
	 * @see org.apache.mesos.ExecutorDriver
	 */
	@Override public void shutdown(ExecutorDriver driver) {

	}

	/**
	 * Invoked when a fatal error has occurred with the executor and/or
	 * executor driver. The driver will be aborted BEFORE invoking this
	 * callback.
	 *
	 * @param driver  The executor driver that was aborted due this error.
	 * @param message The error message.
	 * @see org.apache.mesos.ExecutorDriver
	 */
	@Override public void error(ExecutorDriver driver, String message) {

	}

	/**
	 * @param className
	 * @param boardElement
	 * @return
	 */
	public static Elements getElementsByClass(String className, Element boardElement) {
		Elements elements = boardElement.getElementsByClass(className);
		if (elements != null && !elements.isEmpty()) {
			return elements;
		}
		return null;
	}

	/**
	 * Get first of the elements.
	 *
	 * @param className
	 * @param rootHeader
	 * @return
	 */
	public static Element getFirstOfElementsByClass(String className, Element rootHeader) {
		Elements elements = rootHeader.getElementsByClass(className);
		if (elements != null && !elements.isEmpty()) {
			Element element = rootHeader.getElementsByClass(className).get(0);
			return element;
		}
		return null;
	}

	public static void main(String[] args) {
		MesosExecutorDriver mesosExecutorDriver = new MesosExecutorDriver(new PinUserBoardExecutor());
		System.exit(mesosExecutorDriver.run() == Protos.Status.DRIVER_STOPPED ? 0 : 1);
	}
}

