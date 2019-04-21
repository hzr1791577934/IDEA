package com.springboot_mybatis.wx_uax.dao;

import com.springboot_mybatis.wx_uax.entity.news;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class newsMapperTest {
	@Autowired
	private newsMapper newsDao1;
	@Test
	@Ignore
	public void deleteByPrimaryKey() {
	}

	@Test
	@Ignore
	public void insert() {
	}

	@Test
	@Ignore
	public void insertSelective() {
	}

	@Test

	public void selectByPrimaryKey() {
		news new1 = newsDao1.selectByPrimaryKey(1);
		System.out.println(new1.getNewstitle());
	}

	@Test
	@Ignore
	public void updateByPrimaryKeySelective() {
	}

	@Test
	@Ignore
	public void updateByPrimaryKeyWithBLOBs() {
	}

	@Test
	@Ignore
	public void updateByPrimaryKey() {
	}


}