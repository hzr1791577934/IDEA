package com.sb_mb.drone_news.entity;

public class news {

	private Integer NewsID;
	private String NewsImage;
	private String NewsTitle;
	private String NewsContent;
	private Integer ReadCount;
	private String NewsAuthorName;
	private String NewsAuthorImage;



	public Integer getNewsID() {
		return NewsID;
	}

	public void setNewsID(Integer newsID) {
		NewsID = newsID;
	}

	public String getNewsImage() {
		return NewsImage;
	}

	public void setNewsImage(String newsImage) {
		NewsImage = newsImage;
	}

	public String getNewsTitle() {
		return NewsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		NewsTitle = newsTitle;
	}

	public String getNewsContent() {
		return NewsContent;
	}

	public void setNewsContent(String newsContent) {
		NewsContent = newsContent;
	}

	public Integer getReadCount() {
		return ReadCount;
	}

	public void setReadCount(Integer readCount) {
		ReadCount = readCount;
	}

	public String getNewsAuthorName() {
		return NewsAuthorName;
	}

	public void setNewsAuthorName(String newsAuthorName) {
		NewsAuthorName = newsAuthorName;
	}

	public String getNewsAuthorImage() {
		return NewsAuthorImage;
	}

	public void setNewsAuthorImage(String newsAuthorImage) {
		NewsAuthorImage = newsAuthorImage;
	}
}
