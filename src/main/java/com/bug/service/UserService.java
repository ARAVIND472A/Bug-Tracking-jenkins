package com.bug.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bug.bean.User;
import com.bug.dao.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo dao;

	public String registerUser(User user) {
		dao.save(user);
		return "inserted";

	}

}
