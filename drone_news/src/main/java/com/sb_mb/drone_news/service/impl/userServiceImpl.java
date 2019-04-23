package com.sb_mb.drone_news.service.impl;

import com.sb_mb.drone_news.dao.newsMapper;
import com.sb_mb.drone_news.entity.news;
import com.sb_mb.drone_news.entity.video;
import com.sb_mb.drone_news.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
}
