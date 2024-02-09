package com.bug.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.bug.bean.User;

import com.bug.service.UserService;




@RestController
@CrossOrigin("http://localhost:54534/")
public class UserController {
	
	@Autowired
	UserService service;
	
	
	
	@PostMapping("/Register")
	public String performResgister(@RequestBody User user) {
		
		user.setUserType("User");
		service.registerUser(user);
		return"inserted";
		
	}

}
