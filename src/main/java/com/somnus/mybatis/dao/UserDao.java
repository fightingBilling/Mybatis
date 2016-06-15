package com.somnus.mybatis.dao;

import com.somnus.mybatis.domain.User;

public interface UserDao {
	User selectByPrimaryKey(Integer userid);
}
