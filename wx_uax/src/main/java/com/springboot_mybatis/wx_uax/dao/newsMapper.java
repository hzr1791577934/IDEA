package com.springboot_mybatis.wx_uax.dao;

import com.springboot_mybatis.wx_uax.entity.news;

public interface newsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer newsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated
     */
    int insert(news record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated
     */
    int insertSelective(news record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated
     */
    news selectByPrimaryKey(Integer newsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(news record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(news record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(news record);
}