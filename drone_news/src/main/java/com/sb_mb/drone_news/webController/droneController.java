package com.sb_mb.drone_news.webController;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb_mb.drone_news.entity.comments;
import com.sb_mb.drone_news.entity.news;
import com.sb_mb.drone_news.entity.user;
import com.sb_mb.drone_news.entity.video;
import com.sb_mb.drone_news.service.userService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins ="*" )
@RestController
@RequestMapping("/superadmin")
public class droneController {

	@Autowired
	private userService userservice;
	//小程序获得所有新闻接口
	@RequestMapping(value = "/newslist",method = RequestMethod.GET)
	private Map<String, Object> newslist() {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<news> newslist = userservice.findAllNews();
		modelMap.put("newslist", newslist);
		return modelMap;
	}
	//网站获得新闻接口
	@RequestMapping(value = "/getAllNews",method = RequestMethod.POST)
	public Map<String,Object> getAllNews( @RequestParam("currentPage")int currentPage){
		Map<String,Object> map=new HashMap<>();
		PageHelper.startPage(currentPage,10);
		List<news> list=userservice.findAllNews();
		PageInfo<news> pageInfo=new PageInfo<>(list);
		map.put("pageInfo",pageInfo);
		map.put("news",list);
		return map;
	}
	//网站获得视频接口
	@RequestMapping(value = "/getAllVideo",method = RequestMethod.POST)
	public Map<String,Object> getAllvideo( @RequestParam("currentPage")int currentPage){
		Map<String,Object> map=new HashMap<>();
		PageHelper.startPage(currentPage,10);
		List<video> list=userservice.findAllVideo();
		PageInfo<video> pageInfo=new PageInfo<>(list);
		map.put("pageInfo",pageInfo);
		map.put("video",list);
		return map;
	}
	//小程序获得视频接口
	@RequestMapping(value = "/videolist",method = RequestMethod.GET)
	private Map<String, Object> videolist() {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<video> videolist = userservice.findAllVideo();
		modelMap.put("videolist", videolist);
		return modelMap;
	}
	//小程序根据id获得特定新闻接口
	@RequestMapping(value = "/getnews",method = RequestMethod.GET)
	private Map<String, Object> getnews(Integer newid) {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<comments> comments=userservice.selectComments(newid);
		//comments comments = userservice.selectComments(newid);
		news news = userservice.selectNews(newid);
		modelMap.put("comments", comments);
		modelMap.put("news", news);
		return modelMap;
	}

	//网站添加评论
	@RequestMapping(value = "/addcomments",method = RequestMethod.POST)
	public Map<String,Object> addnews(@RequestParam("commentsID")Integer commentsid,@RequestParam("newsID")Integer id,
									  @RequestParam("content")String content)
	{
		Map<String,Object> map=new HashMap<>();
		userservice.addComments(new comments(commentsid,id,content));
		map.put("status","ok");
		return map;
	}

	//网站添加新闻
	@RequestMapping(value = "/addnews",method = RequestMethod.POST)
	public Map<String,Object> addnews(@RequestParam("newsID")Integer id,@RequestParam("newsImage")String image,
									   @RequestParam("newsTitle")String title,@RequestParam("newsContent")String content,
									   @RequestParam("readCount")Integer count,@RequestParam("newsAuthorName")String authorname,
									   @RequestParam("newsAuthorImage")String authorimage)
	{
		Map<String,Object> map=new HashMap<>();
		userservice.addNews(new news(id,image,title,content,count,authorname,authorimage));
		map.put("status","ok");
		return map;
	}

	//网站添加视频
	@RequestMapping(value = "/addvideo",method = RequestMethod.POST)
	public Map<String,Object> addvideo(@RequestParam("videoID")Integer id,@RequestParam("videoLink")String link,
									   @RequestParam("videoTitle")String title,@RequestParam("videoAuthorName")String name,
									   @RequestParam("videoType")String type,@RequestParam("viewCount")Integer count,
									   @RequestParam("videoLike")Integer like,@RequestParam("videoComments")Integer comments,
									   @RequestParam("videoAuthorImage")String image)
	{
		Map<String,Object> map=new HashMap<>();
		video video0 = new video(id,link,title,name,type,count,like,comments,image);
		userservice.addVideo(video0);
		map.put("status","ok");
		return map;
	}
	//网站删除新闻
	@RequestMapping(value = "/deletenews",method = RequestMethod.POST)
	public Map<String,Object> deletenews(@RequestParam("newsID")Integer id)
	{
		Map<String,Object> map=new HashMap<>();
		userservice.deleteNews(id);
		map.put("status","ok");
		return map;
	}
	//网站删除视频
	@RequestMapping(value = "/deletevideo",method = RequestMethod.POST)
	public Map<String,Object> deletevideo(@RequestParam("videoID")Integer id)
	{
		Map<String,Object> map=new HashMap<>();
		userservice.deleteVideo(id);
		map.put("status","ok");
		return map;
	}
	//更新新闻
	@RequestMapping(value = "/updatenews",method = RequestMethod.POST)
	public Map<String,Object> updateNews(@RequestParam("newsID")Integer id, @RequestParam("newsTitle")String title,
									  @RequestParam("readCount")Integer count,@RequestParam("newsAuthorName")String authorname)
	{
		Map<String,Object> map=new HashMap<>();
		news new0 = userservice.selectNews(id);
		System.out.println(new0.getNewsAuthorName());
		new0.setNewsTitle(title);
		new0.setReadCount(count);
		new0.setNewsAuthorName(authorname);
		userservice.updateNews(new0);
		map.put("status","ok");
		return map;
	}
	//更新视频
	@RequestMapping(value = "/updatevideo",method = RequestMethod.POST)
	public Map<String,Object> updatevideo(@RequestParam("videoID")Integer id, @RequestParam("videoTitle")String title,
										 @RequestParam("videoType")String type,@RequestParam("videoAuthorName")String authorname)
	{
		Map<String,Object> map=new HashMap<>();
		video video0 = userservice.selectVideo(id);
		video0.setVideoTitle(title);
		video0.setVideoAuthorName(authorname);
		video0.setVideoType(type);
		userservice.updateVideo(video0);
		map.put("status","ok");
		return map;
	}
	//更新视频
	@RequestMapping(value = "/updateVideoLike",method = RequestMethod.GET)
	public Map<String,Object> updatevideoLike(Integer VideoID)
	{
		Map<String,Object> map=new HashMap<>();
//		video video0 = userservice.selectVideo(id);
		userservice.updateVideolike(VideoID);
		map.put("status","ok");
		return map;
	}
	//更新视频
	@RequestMapping(value = "/updateViewCount",method = RequestMethod.GET)
	public Map<String,Object> updateViewCount(Integer VideoID)
	{
		Map<String,Object> map=new HashMap<>();
//		video video0 = userservice.selectVideo(id);
		userservice.updateViewCount(VideoID);
		map.put("status","ok");
		return map;
	}
	//登录
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public Map<String,Object> login(@RequestParam("account")Integer id,@RequestParam("password")String password){
		Map<String,Object> map=new HashMap<>();
		user reader=userservice.selectUser(id);
		if(reader!=null){
			if(reader.getPassword().equals(password)){
				map.put("result","yes");
				map.put("loginUser",reader);
				map.put("condi",1);
				return map;
			}
		}
		map.put("result","no");
		return map;
	}

}
