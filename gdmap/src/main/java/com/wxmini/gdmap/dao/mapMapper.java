package com.wxmini.gdmap.dao;

import java.util.List;

import com.wxmini.gdmap.entity.mycollection;
import com.wxmini.gdmap.entity.footprint;
import com.wxmini.gdmap.entity.user;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Repository
//@Autowired
@Mapper
public interface mapMapper {
	List<footprint> selectfootprint(int userAccount);
	List<footprint> selectAllFootprint();
	List<mycollection> selectAllCollection();
    //获取特定编号的footprint
	footprint selectonefootprint(int id);
	//获取特定编号的collection
	mycollection selectonecollection(int id);
	//网站删除轨迹
	int deleteFootprint(int id);
	//网站删除collection
	int deleteCollection(int id);
	//添加footprint
	int addFootprint(footprint footprint);
	//添加collection
	int addCollection(mycollection mycollection);
	//update
	int updateFootprint(footprint footprint);
	int updateCollection(mycollection mycollection);
	//get num
	int selectAllFootprintcount();
	int selectAllCollectioncount();

	//查询特定用户
	user selectUser(int account);

}
