package com.wxmini.gdmap.entity;

public class mycollection {
	private int id;
	private double clan;
	private double clat;
	private String cplace;
	private String cdescr;

	public mycollection(int id, double clan, double clat, String cplace, String cdescr){
		this.id = id;
		this.clan = clan;
		this.clat = clat;
		this.cplace = cplace;
		this.cdescr = cdescr;
	}
	public double getClan() {
		return clan;
	}

	public void setClan(double clan) {
		this.clan = clan;
	}

	public double getClat() {
		return clat;
	}

	public void setClat(double clat) {
		this.clat = clat;
	}

	public String getCplace() {
		return cplace;
	}

	public void setCplace(String cplace) {
		this.cplace = cplace;
	}

	public String getCdescr() {
		return cdescr;
	}

	public void setCdescr(String cdescr) {
		this.cdescr = cdescr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
