package com.tx.service;

import com.tx.entity.User;

public interface UserService {
	
	public User getUserById(Integer id) throws Exception;
}
