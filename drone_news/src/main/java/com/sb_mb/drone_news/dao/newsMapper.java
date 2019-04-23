package com.sb_mb.drone_news.dao;

import com.sb_mb.drone_news.entity.news;
import com.sb_mb.drone_news.entity.video;

import java.util.List;

public interface newsMapper {

    //查询所有新闻内容
    List<news> selectAllNews();
    //查询所有视频
    List<video> selectAllVideo();
    //查询特定新闻
    news selectNews(int newsid);
}