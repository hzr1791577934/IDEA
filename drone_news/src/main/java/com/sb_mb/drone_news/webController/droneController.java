package com.sb_mb.drone_news.webController;

import com.sb_mb.drone_news.entity.news;
import com.sb_mb.drone_news.service.userService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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

	@RequestMapping(value = "/listarea",method = RequestMethod.GET)
	private Map<String, Object> listArea() {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<news> newslist = userservice.findAllNews();
		modelMap.put("areaList", newslist);
		return modelMap;
	}
	@RequestMapping(value="/drone",method = RequestMethod.GET)
	public String droneController(){

		return "drone!";

	}
}
