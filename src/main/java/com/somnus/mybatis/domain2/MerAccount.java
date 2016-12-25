package com.somnus.mybatis.domain2;

import java.util.Date;

public class MerAccount {
    private Integer ACCT_ID;

    private String ACCT_CODE;

    private String MER_CODE;

    private String ACCT_NAME;

    private String CURRENCY;

    private String BANK_CODE;

    private String BANK_NAME;

    private String BANK_KEY;

    private String BRANCH_CODE;

    private String BRANCH_NAME;

    private String BANK_ACCT_NO;

    private String BANK_ACCT_NAME;

    private String STATUS;

    private String MODIFY_BY;

    private Date MODIFY_TIME;

    public Integer getACCT_ID() {
        return ACCT_ID;
    }

    public void setACCT_ID(Integer ACCT_ID) {
        this.ACCT_ID = ACCT_ID;
    }

    public String getACCT_CODE() {
        return ACCT_CODE;
    }

    public void setACCT_CODE(String ACCT_CODE) {
        this.ACCT_CODE = ACCT_CODE;
    }

    public String getMER_CODE() {
        return MER_CODE;
    }

    public void setMER_CODE(String MER_CODE) {
        this.MER_CODE = MER_CODE;
    }

    public String getACCT_NAME() {
        return ACCT_NAME;
    }

    public void setACCT_NAME(String ACCT_NAME) {
        this.ACCT_NAME = ACCT_NAME;
    }

    public String getCURRENCY() {
        return CURRENCY;
    }

    public void setCURRENCY(String CURRENCY) {
        this.CURRENCY = CURRENCY;
    }

    public String getBANK_CODE() {
        return BANK_CODE;
    }

    public void setBANK_CODE(String BANK_CODE) {
        this.BANK_CODE = BANK_CODE;
    }

    public String getBANK_NAME() {
        return BANK_NAME;
    }

    public void setBANK_NAME(String BANK_NAME) {
        this.BANK_NAME = BANK_NAME;
    }

    public String getBANK_KEY() {
        return BANK_KEY;
    }

    public void setBANK_KEY(String BANK_KEY) {
        this.BANK_KEY = BANK_KEY;
    }

    public String getBRANCH_CODE() {
        return BRANCH_CODE;
    }

    public void setBRANCH_CODE(String BRANCH_CODE) {
        this.BRANCH_CODE = BRANCH_CODE;
    }

    public String getBRANCH_NAME() {
        return BRANCH_NAME;
    }

    public void setBRANCH_NAME(String BRANCH_NAME) {
        this.BRANCH_NAME = BRANCH_NAME;
    }

    public String getBANK_ACCT_NO() {
        return BANK_ACCT_NO;
    }

    public void setBANK_ACCT_NO(String BANK_ACCT_NO) {
        this.BANK_ACCT_NO = BANK_ACCT_NO;
    }

    public String getBANK_ACCT_NAME() {
        return BANK_ACCT_NAME;
    }

    public void setBANK_ACCT_NAME(String BANK_ACCT_NAME) {
        this.BANK_ACCT_NAME = BANK_ACCT_NAME;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public String getMODIFY_BY() {
        return MODIFY_BY;
    }

    public void setMODIFY_BY(String MODIFY_BY) {
        this.MODIFY_BY = MODIFY_BY;
    }

    public Date getMODIFY_TIME() {
        return MODIFY_TIME;
    }

    public void setMODIFY_TIME(Date MODIFY_TIME) {
        this.MODIFY_TIME = MODIFY_TIME;
    }
}