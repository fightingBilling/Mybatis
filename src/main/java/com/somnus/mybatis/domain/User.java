package com.somnus.mybatis.domain;

import java.util.Date;

public class User {
    private Integer userId;

    private String str2Varchar;

    private String str2Date;

    private String date2Varchar;

    private Date date2Date;

    private Date date2Timestamp;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStr2Varchar() {
        return str2Varchar;
    }

    public void setStr2Varchar(String str2Varchar) {
        this.str2Varchar = str2Varchar == null ? null : str2Varchar.trim();
    }

    public String getStr2Date() {
        return str2Date;
    }

    public void setStr2Date(String str2Date) {
        this.str2Date = str2Date;
    }

    public String getDate2Varchar() {
        return date2Varchar;
    }

    public void setDate2Varchar(String date2Varchar) {
        this.date2Varchar = date2Varchar == null ? null : date2Varchar.trim();
    }

    public Date getDate2Date() {
        return date2Date;
    }

    public void setDate2Date(Date date2Date) {
        this.date2Date = date2Date;
    }

    public Date getDate2Timestamp() {
        return date2Timestamp;
    }

    public void setDate2Timestamp(Date date2Timestamp) {
        this.date2Timestamp = date2Timestamp;
    }
}