package com.geekz.anon.model;

import com.geekz.anon.util.JsonFormatter;

import java.util.List;

/**
 * @author swathi on 12/30/14.
 */
public class UserBoardInfo {
	/**
	 * Title of the tag. *
	 */
	private String title;
	/**
	 * Board by full name. *
	 */
	private String boardByFullName;
	/**
	 * Hyper link of the board. *
	 */
	private String href;
	/**
	 * {@link ImageInfo} of the board cover. *
	 */
	private ImageInfo boardCover;
	/**
	 * List of {@link ImageInfo} of board thumbnails. *
	 */
	private List<ImageInfo> boardThumbs;
	/**
	 * Pin detail of the thumbs. *
	 */
	private String pinDetailThumb;
	/**
	 * Total number of pin counts. *
	 */
	private String pinCount;

	public UserBoardInfo() {
	}

	public UserBoardInfo(String title, String boardByFullName, String href, ImageInfo boardCover,
			List<ImageInfo> boardThumbs, String pinDetailThumb, String pinCount) {
		this.title = title;
		this.boardByFullName = boardByFullName;
		this.href = href;
		this.boardCover = boardCover;
		this.boardThumbs = boardThumbs;
		this.pinDetailThumb = pinDetailThumb;
		this.pinCount = pinCount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBoardByFullName() {
		return boardByFullName;
	}

	public void setBoardByFullName(String boardByFullName) {
		this.boardByFullName = boardByFullName;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public ImageInfo getBoardCover() {
		return boardCover;
	}

	public void setBoardCover(ImageInfo boardCover) {
		this.boardCover = boardCover;
	}

	public List<ImageInfo> getBoardThumbs() {
		return boardThumbs;
	}

	public void setBoardThumbs(List<ImageInfo> boardThumbs) {
		this.boardThumbs = boardThumbs;
	}

	public String getPinDetailThumb() {
		return pinDetailThumb;
	}

	public void setPinDetailThumb(String pinDetailThumb) {
		this.pinDetailThumb = pinDetailThumb;
	}

	public String getPinCount() {
		return pinCount;
	}

	public void setPinCount(String pinCount) {
		this.pinCount = pinCount;
	}

	/**
	 * Returns a JSON string corresponding to object state
	 *
	 * @return JSON representation
	 */
	public String toJSON() {
		return JsonFormatter.toJSON(this);
	}

	@Override public String toString() {
		return toJSON();
	}
}
