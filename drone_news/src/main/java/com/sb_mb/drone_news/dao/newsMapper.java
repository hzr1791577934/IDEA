package com.sb_mb.drone_news.dao;

import com.sb_mb.drone_news.entity.comments;
import com.sb_mb.drone_news.entity.news;
import com.sb_mb.drone_news.entity.user;
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
    //查询特定视频
    video selectVideo(int videoid);
    //查询特定用户
    user selectUser(int account);
    //查询特定评论
    List<comments> selectComments(int newid);
    //删除新闻
    int deletenews(int newsid);
    //插入新闻
    int addnews(news news);
    //插入视频
    int addvideo(video video);
    //插入评论
    int addcomments(comments comments);
    //删除视频
    int deletevideo(int videoid);
    //更新新闻
    int updatenews(news news);
    //更新视频
    int updatevideo(video video);
    //更细视频的喜欢数目
    int updateVideolike(int videoid);
    //更细视频的观看数目
    int updateViewCount(int videoid);
}