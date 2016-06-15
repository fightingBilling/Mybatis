package com.somnus.mybatis.domain;

import java.util.Date;

public class User {
	private Integer userId;
	/** String——>varchar*/
	private String str2varchar;
	/** String——>date*/
	private String str2date;
	/** Date——>varchar*/
	private Date date2varchar;
	/** Date——>date*/
	private Date date2date;
	/** Date——>timestamp*/
	private Date date2timestamp;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getStr2varchar() {
		return str2varchar;
	}
	public void setStr2varchar(String str2varchar) {
		this.str2varchar = str2varchar;
	}
	public String getStr2date() {
		return str2date;
	}
	public void setStr2date(String str2date) {
		this.str2date = str2date;
	}
	public Date getDate2varchar() {
		return date2varchar;
	}
	public void setDate2varchar(Date date2varchar) {
		this.date2varchar = date2varchar;
	}
	public Date getDate2date() {
		return date2date;
	}
	public void setDate2date(Date date2date) {
		this.date2date = date2date;
	}
	public Date getDate2timestamp() {
		return date2timestamp;
	}
	public void setDate2timestamp(Date date2timestamp) {
		this.date2timestamp = date2timestamp;
	}
}
