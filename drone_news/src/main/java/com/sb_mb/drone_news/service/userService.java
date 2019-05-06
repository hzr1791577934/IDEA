package com.sb_mb.drone_news.service;

//面向用户的接口

import com.sb_mb.drone_news.entity.news;
import com.sb_mb.drone_news.entity.video;

import java.util.List;
import java.util.Map;

public interface userService {
	List<news> findAllNews();
	List<video> findAllVideo();
	news selectNews(int newsid);
	int deleteNews(int newsid);
	int addNews(news news);
	int addVideo(video video);


}
