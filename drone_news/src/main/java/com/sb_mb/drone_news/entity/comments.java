package com.sb_mb.drone_news.entity;

public class comments {
	private int CommentsID;
	private int NewID;
	private String Content;
	private String AuthorName;
	private String AuthorImage;
	public comments(int commentsid,int newid,String content){
		CommentsID = (int)(Math.random()*10000);
		NewID = newid;
		Content = content;
		AuthorName = "环球网";
		AuthorImage = "http://pqaq7wrwt.bkt.clouddn.com/huanqiu.jfif";
	}
	public comments(){

	}

	public int getNewID() {
		return NewID;
	}

	public void setNewID(int newID) {
		NewID = newID;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getAuthorName() {
		return AuthorName;
	}

	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}

	public String getAuthorImage() {
		return AuthorImage;
	}

	public void setAuthorImage(String authorImage) {
		AuthorImage = authorImage;
	}

	public int getCommentsID() {
		return CommentsID;
	}

	public void setCommentsID(int commentsID) {
		CommentsID = commentsID;
	}
}
