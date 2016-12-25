package com.somnus.mybatis.dao2;

import com.somnus.mybatis.domain2.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer USER_ID);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer USER_ID);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}