package com.sb_mb.drone_news.entity;

public class video {

	private Integer VideoID;
	private String VideoLink;
	private String VideoTitle;
	private String VideoAuthorName;
	private String VideoAuthorImage;
	private Integer ViewCount;
	private Integer VideoLike;
	private Integer VideoComments;
    private String  VideoType;
	public video() {
	}

	public Integer getVideoID() {
		return VideoID;
	}

	public void setVideoID(Integer videoID) {
		VideoID = videoID;
	}

	public String getVideoLink() {
		return VideoLink;
	}

	public void setVideoLink(String videoLink) {
		VideoLink = videoLink;
	}

	public String getVideoTitle() {
		return VideoTitle;
	}

	public void setVideoTitle(String videoTitle) {
		VideoTitle = videoTitle;
	}

	public String getVideoAuthorName() {
		return VideoAuthorName;
	}

	public void setVideoAuthorName(String videoAuthorName) {
		VideoAuthorName = videoAuthorName;
	}

	public String getVideoAuthorImage() {
		return VideoAuthorImage;
	}

	public void setVideoAuthorImage(String videoAuthorImage) {
		VideoAuthorImage = videoAuthorImage;
	}

	public int getViewCount() {
		return ViewCount;
	}

	public void setViewCount(Integer viewCount) {
		ViewCount = viewCount;
	}

	public int getVideoLike() {
		return VideoLike;
	}

	public void setVideoLike(Integer videoLike) {
		VideoLike = videoLike;
	}

	public int getVideoComments() {
		return VideoComments;
	}

	public void setVideoComments(Integer videoComments) {
		VideoComments = videoComments;
	}

	public String getVideoType() {
		return VideoType;
	}

	public void setVideoType(String videoType) {
		VideoType = videoType;
	}
}
