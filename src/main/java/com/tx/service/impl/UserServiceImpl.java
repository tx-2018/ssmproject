package com.tx.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tx.dao.UserDao;
import com.tx.entity.User;
import com.tx.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserDao userDao;

	@Override
	public User getUserById(Integer id) throws Exception {
		System.out.println("--------------------");
		return this.userDao.getUserById(id);
	}
	
	
}
