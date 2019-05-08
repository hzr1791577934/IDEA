package com.sb_mb.drone_news.service.impl;

import com.sb_mb.drone_news.dao.newsMapper;
import com.sb_mb.drone_news.entity.comments;
import com.sb_mb.drone_news.entity.news;
import com.sb_mb.drone_news.entity.user;
import com.sb_mb.drone_news.entity.video;
import com.sb_mb.drone_news.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class userServiceImpl implements userService {
	@Autowired
	private newsMapper newsmapper;
	@Override
	public List<news> findAllNews() {
		return newsmapper.selectAllNews();
	}

	@Override
	public List<video> findAllVideo() {
		return newsmapper.selectAllVideo();
	}

	@Override
	public news selectNews(int newsid){
		return newsmapper.selectNews(newsid);
	}

	@Override
	public video selectVideo(int videoid) {
		return newsmapper.selectVideo(videoid);
	}

	@Override
	public user selectUser(int id) {
		return newsmapper.selectUser(id);
	}

	@Override
	public List<comments> selectComments(int newid) {
		return newsmapper.selectComments(newid);
	}

	@Override
	public int deleteNews(int newsid) {
		return newsmapper.deletenews(newsid);
	}

	@Override
	public int deleteVideo(int videoid) {
		return newsmapper.deletevideo(videoid);
	}

	@Override
	public int addNews(news news) {
		return newsmapper.addnews(news);
	}

	@Override
	public int addVideo(video video0) {
		return newsmapper.addvideo(video0);
	}

	@Override
	public int addComments(comments comments) {
		return newsmapper.addcomments(comments);
	}

	@Override
	public int updateNews(news news) {
		return newsmapper.updatenews(news);
	}

	@Override
	public int updateVideo(video video) {
		return newsmapper.updatevideo(video);
	}

	@Override
	public int updateVideolike(int videoid) {
		return newsmapper.updateVideolike(videoid);
	}
	@Override
	public int updateViewCount(int videoid) {
		return newsmapper.updateViewCount(videoid);
	}

}
