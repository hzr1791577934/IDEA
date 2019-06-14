package com.wxmini.gdmap.webController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wxmini.gdmap.entity.footprint;
import com.wxmini.gdmap.entity.mycollection;
import com.wxmini.gdmap.entity.user;
import com.wxmini.gdmap.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Service
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/superadmin")
public class gdmapController {
	@Autowired
	private userService userservice;
	//小程序根据id获得特定footprint接口
	@RequestMapping(value = "/getfootprint", method = RequestMethod.GET)
	private Map<String, Object> getfootprint(Integer userAccount) {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<footprint> comments = userservice.selectfootprint(userAccount);
		modelMap.put("myfootprints", comments);
		return modelMap;
	}
	//获得所有的footprint条目数
	@RequestMapping(value = "/getfootprintcount", method = RequestMethod.GET)
	private int getfootprintcount() {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		int comments = userservice.selectAllFootprintcount();
		return comments;
	}
	//获得所有的footprint条目数
	@RequestMapping(value = "/getcollectioncount", method = RequestMethod.GET)
	private int getcollectioncount() {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		int comments = userservice.selectAllCollectioncount();
		return comments;
	}
	//小程序获得所有轨迹接口
	@RequestMapping(value = "/getallfootprint", method = RequestMethod.GET)
	private Map<String, Object> getallfootprint() {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<footprint> comments = userservice.selectAllFootprint();
		modelMap.put("Allfootprints", comments);
		return modelMap;
	}
	@RequestMapping(value = "/getallcollection", method = RequestMethod.GET)
	private Map<String, Object> getallcollection() {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<mycollection> comments = userservice.selectAllCollection();
		modelMap.put("Allfootprints", comments);
		return modelMap;
	}
	//网站获得所有轨迹接口
	@RequestMapping(value = "/webgetallfootprint", method = RequestMethod.POST)
	public Map<String, Object> getAllNews(@RequestParam("currentPage") int currentPage) {
		Map<String, Object> map = new HashMap<>();
		PageHelper.startPage(currentPage, 10);
		List<footprint> list = userservice.selectAllFootprint();
		PageInfo<footprint> pageInfo = new PageInfo<>(list);
		map.put("pageInfo", pageInfo);
		map.put("news", list);
		return map;
	}
	//网站获得所有轨迹接口
	@RequestMapping(value = "/webgetallcollection", method = RequestMethod.POST)
	public Map<String, Object> getAllcollection(@RequestParam("currentPage") int currentPage) {
		Map<String, Object> map = new HashMap<>();
		PageHelper.startPage(currentPage, 10);
		List<mycollection> list = userservice.selectAllCollection();
		PageInfo<mycollection> pageInfo = new PageInfo<>(list);
		map.put("pageInfo", pageInfo);
		map.put("news", list);
		return map;
	}
	//小程序轨迹添加接口
	@RequestMapping(value = "/addfootprint", method = RequestMethod.GET)
	public Map<String, Object> addfootprint(Integer id,Integer account,double longitude,
											double latitude,String placename,String descr) {
		Map<String, Object> map = new HashMap<>();
		Date ttime = new Date();
		SimpleDateFormat formatter0 = new SimpleDateFormat("yyyy-MM-dd");
		String dateString0 = formatter0.format(ttime);
		SimpleDateFormat formatter1 = new SimpleDateFormat("HH:mm:ss");
		String dateString1 = formatter1.format(ttime);
//		System.out.println(ttime);
		userservice.addFootprint(new footprint(id,account,dateString0,longitude,latitude,placename,descr,dateString1));
		map.put("status", "ok");
		return map;
	}
//	小程序collection添加接口
	@RequestMapping(value = "/addCollection", method = RequestMethod.GET)
	public Map<String, Object> addcollection(double clan,double clat, String cplace,String cdescr) {
		Map<String, Object> map = new HashMap<>();
		int collectionnum = userservice.selectAllCollectioncount();
		userservice.addCollection(new mycollection(collectionnum+1,clan,clat,cplace,cdescr));
		map.put("status", "ok");
		return map;
	}
	//网站轨迹添加接口
	@RequestMapping(value = "/addfootprint", method = RequestMethod.POST)
	public Map<String, Object> addfootprint(@RequestParam("longitude") double longitude, @RequestParam("latitude") double latitude,
									   @RequestParam("place") String place, @RequestParam("descr") String descr) {
		Map<String, Object> map = new HashMap<>();
//		userservice.addFootprint(new footprint(6, 1,));
		int comments = userservice.selectAllFootprintcount();
		Date ttime = new Date();
		SimpleDateFormat formatter0 = new SimpleDateFormat("yyyy-MM-dd");
		String dateString0 = formatter0.format(ttime);
		SimpleDateFormat formatter1 = new SimpleDateFormat("HH:mm:ss");
		String dateString1 = formatter1.format(ttime);
//		System.out.println(ttime);
		userservice.addFootprint(new footprint(comments+1,1,dateString0,longitude,latitude,place,descr,dateString1));
		map.put("status", "ok");
		return map;
	}
	@RequestMapping(value = "/addcollection", method = RequestMethod.POST)
	public Map<String, Object> addnews(@RequestParam("clan") double clan, @RequestParam("clat") double clat,
									   @RequestParam("cplace") String cplace, @RequestParam("cdescr") String cdescr) {
		Map<String, Object> map = new HashMap<>();
//		userservice.addFootprint(new footprint(6, 1,));
		int comments = userservice.selectAllCollectioncount();
//		System.out.println(ttime);
		userservice.addCollection(new mycollection(comments+1,clan,clat,cplace,cdescr));
		map.put("status", "ok");
		return map;
	}
	//网站更新轨迹
	@RequestMapping(value = "/updatefootprint", method = RequestMethod.POST)
	public Map<String, Object> updateNews(@RequestParam("id") Integer id, @RequestParam("place") String place,
										  @RequestParam("descr") String descr) {
		Map<String, Object> map = new HashMap<>();
		footprint new0 = userservice.selectonefootprint(id);
		System.out.println(new0.getTtime());
		new0.setPlace(place);
		new0.setDescr(descr);
		userservice.updateFootprint(new0);
		map.put("status", "ok");
		return map;
	}
	//网站更新collection
	@RequestMapping(value = "/updatecollection", method = RequestMethod.POST)
	public Map<String, Object> updatecollection(@RequestParam("id") Integer id, @RequestParam("cplace") String cplace,
										  @RequestParam("cdescr") String cdescr) {
		Map<String, Object> map = new HashMap<>();
		mycollection new0 = userservice.selectonecollection(id);
		new0.setCplace(cplace);
		new0.setCdescr(cdescr);
		userservice.updateCollection(new0);
		map.put("status", "ok");
		return map;
	}
	//网站删除轨迹
	@RequestMapping(value = "/deletefootprint", method = RequestMethod.POST)
	public Map<String, Object> deletenews(@RequestParam("id") Integer id) {
		Map<String, Object> map = new HashMap<>();
		userservice.deleteFootprint(id);
		map.put("status", "ok");
		return map;
	}
	//小程序删除收藏
	@RequestMapping(value = "/deletemycollection", method = RequestMethod.GET)
	public Map<String, Object> deletemycollection(Integer id) {
		Map<String, Object> map = new HashMap<>();
		userservice.deleteCollection(id);
		map.put("status", "ok");
		return map;
	}
//	网站删除collection
	@RequestMapping(value = "/deletecollection", method = RequestMethod.POST)
	public Map<String, Object> deletecollection(@RequestParam("id") Integer id) {
		Map<String, Object> map = new HashMap<>();
		userservice.deleteCollection(id);
		map.put("status", "ok");
		return map;
	}
	//登录
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Map<String, Object> login(@RequestParam("account") Integer id, @RequestParam("password") String password) {
		Map<String, Object> map = new HashMap<>();
		user reader = userservice.selectUser(id);
		if (reader != null) {
			if (reader.getPassword().equals(password)) {
				map.put("result", "yes");
				map.put("loginUser", reader);
				map.put("condi", 1);
				return map;
			}
		}
		map.put("result", "no");
		return map;
	}

}

