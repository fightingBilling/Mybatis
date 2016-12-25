package com.somnus.mybatis.domain2;

import java.util.Date;

public class User {
    private Integer USER_ID;

    private String STR_2_VARCHAR;

    private Date STR_2_DATE;

    private String DATE_2_VARCHAR;

    private Date DATE_2_DATE;

    private Date DATE_2_TIMESTAMP;

    public Integer getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(Integer USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getSTR_2_VARCHAR() {
        return STR_2_VARCHAR;
    }

    public void setSTR_2_VARCHAR(String STR_2_VARCHAR) {
        this.STR_2_VARCHAR = STR_2_VARCHAR;
    }

    public Date getSTR_2_DATE() {
        return STR_2_DATE;
    }

    public void setSTR_2_DATE(Date STR_2_DATE) {
        this.STR_2_DATE = STR_2_DATE;
    }

    public String getDATE_2_VARCHAR() {
        return DATE_2_VARCHAR;
    }

    public void setDATE_2_VARCHAR(String DATE_2_VARCHAR) {
        this.DATE_2_VARCHAR = DATE_2_VARCHAR;
    }

    public Date getDATE_2_DATE() {
        return DATE_2_DATE;
    }

    public void setDATE_2_DATE(Date DATE_2_DATE) {
        this.DATE_2_DATE = DATE_2_DATE;
    }

    public Date getDATE_2_TIMESTAMP() {
        return DATE_2_TIMESTAMP;
    }

    public void setDATE_2_TIMESTAMP(Date DATE_2_TIMESTAMP) {
        this.DATE_2_TIMESTAMP = DATE_2_TIMESTAMP;
    }
}