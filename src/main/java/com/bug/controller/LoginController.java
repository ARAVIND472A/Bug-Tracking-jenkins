package com.bug.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bug.bean.Response;
import com.bug.bean.User;
import com.bug.service.LoginService;

@RestController
@CrossOrigin("http://localhost:54534/")
public class LoginController {

	@Autowired
	LoginService loginService;

	@PostMapping("/login")

	public ResponseEntity<Response> performResgister(@RequestBody User user) {

		Response res = loginService.verifyUser(user);
		return ResponseEntity.ok(res);

	}

}
