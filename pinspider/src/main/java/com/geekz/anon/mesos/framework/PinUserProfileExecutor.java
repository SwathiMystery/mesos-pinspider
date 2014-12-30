package com.geekz.anon.mesos.framework;

import com.geekz.anon.model.UserProfileInfo;
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

/**
 * @author swathi on 12/24/14.
 */
public class PinUserProfileExecutor implements Executor {

	private final static Logger LOGGER = Logger.getLogger(PinUserProfileExecutor.class);

	@Override public void registered(ExecutorDriver executorDriver, Protos.ExecutorInfo executorInfo,
			Protos.FrameworkInfo frameworkInfo, Protos.SlaveInfo slaveInfo) {
		LOGGER.info("Registered PinUserProfileExecutor on " + slaveInfo.getHostname());
	}

	@Override public void reregistered(ExecutorDriver executorDriver, Protos.SlaveInfo slaveInfo) {

	}

	@Override public void disconnected(ExecutorDriver executorDriver) {

	}

	@Override public void launchTask(final ExecutorDriver executorDriver, final Protos.TaskInfo taskInfo) {
		LOGGER.info("Launching task in PinUserProfileExecutor ...");
		Protos.TaskStatus taskStatus = Protos.TaskStatus.newBuilder().setTaskId(taskInfo.getTaskId())
														.setState(Protos.TaskState.TASK_RUNNING).build();
		executorDriver.sendStatusUpdate(taskStatus);
		String url = taskInfo.getData().toStringUtf8();
		byte[] message = new byte[0];

		try {
			message = ("userprofile :" + getUserProfileInfo(url)).getBytes();
		} catch (IOException e) {
			LOGGER.error("Error parsing the Pinterest URL :" + e.getMessage());
		}

		LOGGER.info("Sending framework message and marking task finished." + getClass().getName());
		executorDriver.sendFrameworkMessage(message);

		taskStatus = Protos.TaskStatus.newBuilder().setTaskId(taskInfo.getTaskId())
									  .setState(Protos.TaskState.TASK_FINISHED).build();
		executorDriver.sendStatusUpdate(taskStatus);
	}

	private String getUserProfileInfo(String url) throws IOException {
		Document document;
		UserProfileInfo userProfileInfo = new UserProfileInfo();
		try {
			document = Jsoup.connect(url).get();
			Element rootHeader = getFirstOfElementsByClass("UserProfileHeader", document);
			if (rootHeader != null) {

				// Get the user name.
				Element nameElement = getFirstOfElementsByClass("fixedHeaderName", document);
				if (nameElement != null) {
					userProfileInfo.setName(nameElement.text().trim());
				} else {
					userProfileInfo.setName("");
				}

				// Get the bio info of the user.
				Element bioElement = getFirstOfElementsByClass("aboutText", document);
				if (bioElement != null) {
					userProfileInfo.setBio(bioElement.text().trim());
				} else {
					userProfileInfo.setBio("");
				}

				// Get the location details of the user.
				Element locationElement = getFirstOfElementsByClass("locationWrapper", document);
				if (locationElement != null) {
					userProfileInfo.setLocation(locationElement.text().trim());
				} else {
					userProfileInfo.setLocation("");
				}

				// Get the website information.
				Element websiteElement = getFirstOfElementsByClass("website", document);
				if (websiteElement != null) {
					userProfileInfo.setWebsite(websiteElement.attr("href"));
				} else {
					userProfileInfo.setWebsite("");
				}

				// Get the Facebook information.
				Element facebookElement = getFirstOfElementsByClass("facebook", document);
				if (facebookElement != null) {
					userProfileInfo.setFacebook(facebookElement.attr("href"));
				} else {
					userProfileInfo.setFacebook("");
				}

				// Get the Twitter information.
				Element twitterElement = getFirstOfElementsByClass("twitter", document);
				if (twitterElement != null) {
					userProfileInfo.setTwitter(twitterElement.attr("href"));
				} else {
					userProfileInfo.setTwitter("");
				}

				// Get all the profile statistics.
				Element profileStatsElement = getFirstOfElementsByClass("UserInfoBar", document);
				if (profileStatsElement != null) {
					userProfileInfo.setBoardsCount(profileStatsElement.getElementsByTag("li").get(0).text().split(" ")[0]);
					userProfileInfo.setPinsCount(profileStatsElement.getElementsByTag("li").get(1).text().split(" ")[0]);
					userProfileInfo.setNoOfLikes(profileStatsElement.getElementsByTag("li").get(2).text().split(" ")[0]);
					userProfileInfo
							.setFollowersCount(profileStatsElement.getElementsByTag("li").get(3).text().split(" ")[0]);
					userProfileInfo
							.setFollowingCount(profileStatsElement.getElementsByTag("li").get(4).text().split(" ")[0]);
				} else {
					userProfileInfo.setBoardsCount("");
					userProfileInfo.setPinsCount("");
					userProfileInfo.setNoOfLikes("");
					userProfileInfo.setFollowersCount("");
					userProfileInfo.setFollowingCount("");
				}
			}

		} catch (Exception e) {
			LOGGER.error("Error while parsing User Profile Information." + e.getMessage());
		}

		return userProfileInfo.toJSON();
	}

	@Override public void killTask(ExecutorDriver executorDriver, Protos.TaskID taskID) {

	}

	@Override public void frameworkMessage(ExecutorDriver executorDriver, byte[] bytes) {

	}

	@Override public void shutdown(ExecutorDriver executorDriver) {

	}

	@Override public void error(ExecutorDriver executorDriver, String s) {

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
		MesosExecutorDriver mesosExecutorDriver = new MesosExecutorDriver(new PinUserProfileExecutor());
		System.exit(mesosExecutorDriver.run() == Protos.Status.DRIVER_STOPPED ? 0 : 1);
	}

}
