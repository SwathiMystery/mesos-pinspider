package com.geekz.anon;

/**
 * Pinterest basic user profile information.
 * @author swathi on 12/29/14.
 */
public class UserProfileInfo {
	/**
	 * Bio of the user. *
	 */
	private String bio;
	/**
	 * Website URL of the person. *
	 */
	private String website;
	/**
	 * Count of the no. of boards. *
	 */
	private String boardsCount;
	/**
	 * URL Facebook. *
	 */
	private String facebook;
	/**
	 * URL of Twitter. *
	 */
	private String twitter;
	/**
	 * Count of the no. of followers. *
	 */
	private String followersCount;
	/**
	 * Count of the no. of following. *
	 */
	private String followingCount;
	/**
	 * Count of the no. of likes. *
	 */
	private String noOfLikes;
	/**
	 * Location details ie. latitude and longitude. *
	 */
	private String location;
	/**
	 * Name of the user. *
	 */
	private String name;
	/**
	 * Count of the no. of pins. *
	 */
	private String pinsCount;

	public UserProfileInfo() {

	}

	public UserProfileInfo(String bio, String website, String boardsCount, String facebook, String twitter,
			String followersCount, String followingCount, String noOfLikes, String location, String name,
			String pinsCount) {
		this.bio = bio;
		this.website = website;
		this.boardsCount = boardsCount;
		this.facebook = facebook;
		this.twitter = twitter;
		this.followersCount = followersCount;
		this.followingCount = followingCount;
		this.noOfLikes = noOfLikes;
		this.location = location;
		this.name = name;
		this.pinsCount = pinsCount;
	}


	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getBoardsCount() {
		return boardsCount;
	}

	public void setBoardsCount(String boardsCount) {
		this.boardsCount = boardsCount;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getFollowersCount() {
		return followersCount;
	}

	public void setFollowersCount(String followersCount) {
		this.followersCount = followersCount;
	}

	public String getFollowingCount() {
		return followingCount;
	}

	public void setFollowingCount(String followingCount) {
		this.followingCount = followingCount;
	}

	public String getNoOfLikes() {
		return noOfLikes;
	}

	public void setNoOfLikes(String noOfLikes) {
		this.noOfLikes = noOfLikes;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPinsCount() {
		return pinsCount;
	}

	public void setPinsCount(String pinsCount) {
		this.pinsCount = pinsCount;
	}

	/**
	 * Returns a JSON string corresponding to object state
	 *
	 * @return JSON representation
	 */
	public String toJSON() {
		return JsonFormatter.toJSON(this);
	}

	@Override
	public String toString() {
		return toJSON();
	}
}

