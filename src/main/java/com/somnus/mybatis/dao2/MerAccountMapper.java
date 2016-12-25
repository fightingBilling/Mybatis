package com.somnus.mybatis.dao2;

import com.somnus.mybatis.domain2.MerAccount;

public interface MerAccountMapper {
    int deleteByPrimaryKey(Integer ACCT_ID);

    int insert(MerAccount record);

    int insertSelective(MerAccount record);

    MerAccount selectByPrimaryKey(Integer ACCT_ID);

    int updateByPrimaryKeySelective(MerAccount record);

    int updateByPrimaryKey(MerAccount record);
}