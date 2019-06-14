package com.wxmini.gdmap.service.impl;

import java.util.List;
import com.wxmini.gdmap.dao.mapMapper;
import com.wxmini.gdmap.entity.footprint;
import com.wxmini.gdmap.entity.mycollection;
import com.wxmini.gdmap.entity.user;
import com.wxmini.gdmap.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {

	@Autowired
	private mapMapper mapmapper;
	@Override
	public List<footprint> selectfootprint(int userAccount) {
		return mapmapper.selectfootprint(userAccount);
	}

	@Override
	public List<footprint> selectAllFootprint() {
		return mapmapper.selectAllFootprint();
	}

	@Override
	public List<mycollection> selectAllCollection() {
		return mapmapper.selectAllCollection();
	}

	@Override
	public footprint selectonefootprint(int id) {
		return mapmapper.selectonefootprint(id);
	}

	@Override
	public mycollection selectonecollection(int id) {
		return mapmapper.selectonecollection(id);
	}

	@Override
	public int deleteFootprint(int id) {
		return mapmapper.deleteFootprint(id);
	}

	@Override
	public int deleteCollection(int id) {
		return mapmapper.deleteCollection(id);
	}

	@Override
	public int addFootprint(footprint footprint) {
		return mapmapper.addFootprint(footprint);
	}

	@Override
	public int addCollection(mycollection mycollection) {
		return mapmapper.addCollection(mycollection);
	}

	@Override
	public int updateFootprint(footprint footprint) {
		return mapmapper.updateFootprint(footprint);
	}

	@Override
	public int updateCollection(mycollection mycollection) {
		return mapmapper.updateCollection(mycollection);
	}

	@Override
	public int selectAllFootprintcount() {
		return mapmapper.selectAllFootprintcount();
	}

	@Override
	public int selectAllCollectioncount() {
		return mapmapper.selectAllCollectioncount();
	}

	@Override
	public user selectUser(int account) {
		return mapmapper.selectUser(account);
	}
}
