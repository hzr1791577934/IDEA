package com.wxmini.gdmap.entity;

import java.util.Date;

public class footprint {

	private Integer id;
	private Integer userAccount;
	private String ttime;
	private double longitude;
	private double latitude;
	private String place;
	private String descr;
	private String tttime;

	public footprint(Integer id,Integer userAccount,
					 String ttime,double longitude,
					 double latitude,String place,String descr,String tttime){
		this.id = id;
		this.userAccount = userAccount;
		this.ttime = ttime;
		this.longitude = longitude;
		this.latitude = latitude;
		this.place = place;
		this.descr = descr;
		this.tttime = tttime;
	}
	public footprint(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(Integer userAccount) {
		this.userAccount = userAccount;
	}

	public String getTtime() {
		return ttime;
	}

	public void setTtime(String ttime) {
		this.ttime = ttime;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getTttime() {
		return tttime;
	}

	public void setTttime(String tttime) {
		this.tttime = tttime;
	}
}
