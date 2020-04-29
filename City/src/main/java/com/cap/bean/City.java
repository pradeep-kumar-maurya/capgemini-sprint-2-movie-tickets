package com.cap.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City {
	@Id
	@Column(length = 2)
	private int sno;
	@Column(length = 2)
	private int cityid;
	@Column(length = 10)
	private String citynames;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public String getCitynames() {
		return citynames;
	}
	public void setCitynames(String citynames) {
		this.citynames = citynames;
	}
}
