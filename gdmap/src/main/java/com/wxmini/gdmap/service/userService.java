package com.wxmini.gdmap.service;

import java.util.List;

import com.wxmini.gdmap.entity.footprint;
import com.wxmini.gdmap.entity.mycollection;
import com.wxmini.gdmap.entity.user;

public interface userService {
	List<footprint> selectfootprint(int userAccount);
	//getall
	List<footprint> selectAllFootprint();
	List<mycollection> selectAllCollection();
	//select one entry
	footprint selectonefootprint(int id);
	mycollection selectonecollection(int id);
	//delete
	int deleteFootprint(int id);
	int deleteCollection(int id);
	//add
	int addFootprint(footprint footprint);
	int addCollection(mycollection mycollection);
	//update
	int updateFootprint(footprint footprint);
	int updateCollection(mycollection mycollection);
	//get num
	int selectAllFootprintcount();
	int selectAllCollectioncount();
	user selectUser(int account);


}
