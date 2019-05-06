package com.sb_mb.drone_news.dao;

import com.sb_mb.drone_news.entity.news;
import com.sb_mb.drone_news.entity.video;

import java.util.List;
import java.util.Map;

public interface newsMapper {

    //查询所有新闻内容
    List<news> selectAllNews();
    //查询所有视频
    List<video> selectAllVideo();
    //查询特定新闻
    news selectNews(int newsid);
    //删除新闻
    int deleteNews(int newsid);
    //插入新闻
    int addnews(news news);
    //插入视频
    int addvideo(video video);
}