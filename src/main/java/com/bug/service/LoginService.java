package com.bug.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bug.bean.Response;
import com.bug.bean.User;

import com.bug.dao.LoginRepo;

@Service
public class LoginService {

	@Autowired
	LoginRepo dao;

	public Response verifyUser(User use) {

		String userName = use.getUserName();
		String password = use.getPassword();

		User dbuser = dao.findByUserName(use.getUserName());

		if (dbuser != null) {
			if (dbuser.getUserName().equals(userName) && dbuser.getPassword().equals(password)
					&& dbuser.getUserType().equals("Admin")) {
				return new Response("Admin Success");
			} else if (dbuser.getUserName().equals(userName) && dbuser.getPassword().equals(password)
					&& dbuser.getUserType().equals("User")) {
				return new Response("User Success");
			} else {
				return new Response("Login Fail");

			}

		} else {
			return new Response("Login Fail");
		}

	}
}
