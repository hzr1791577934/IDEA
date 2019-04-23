package com.sb_mb.drone_news.webController;

import com.sb_mb.drone_news.entity.news;
import com.sb_mb.drone_news.entity.video;
import com.sb_mb.drone_news.service.userService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class droneController {

	@Autowired
	private userService userservice;

	@RequestMapping(value = "/newslist",method = RequestMethod.GET)
	private Map<String, Object> listnews() {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<news> newslist = userservice.findAllNews();
		modelMap.put("newslist", newslist);
		return modelMap;
	}
	@RequestMapping(value = "/videolist",method = RequestMethod.GET)
	private Map<String, Object> listvideo() {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<video> videolist = userservice.findAllVideo();
		modelMap.put("videolist", videolist);
		return modelMap;
	}

	@RequestMapping(value = "/getnews",method = RequestMethod.GET)
	private Map<String, Object> getnews(Integer newid) {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		news news = userservice.selectNews(newid);
		modelMap.put("news", news);
		return modelMap;
	}

}
