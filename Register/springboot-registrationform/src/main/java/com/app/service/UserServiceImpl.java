package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.User;
import com.app.repo.userrepo;
@Service
public  class UserServiceImpl implements UserService
{

	@Autowired
	private userrepo repo;
	
	public void registerUser(User user) {
		
		repo.save(user);
	}

}
