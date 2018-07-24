package com.tx.dao;

import com.tx.entity.User;

public interface UserDao {

	public User getUserById(Integer id) throws Exception;
	
}
