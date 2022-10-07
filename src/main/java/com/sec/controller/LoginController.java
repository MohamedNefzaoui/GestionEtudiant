package com.sec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sec.model.User;
import com.sec.service.LoginService;

@RestController
@RequestMapping("/loginUser")
public class LoginController {
	
@Autowired	
private LoginService loginservice;

@PostMapping("/login")

public User loginUser(User user )  throws Exception{
	String tempEmail = user.getEmail();
	String tempPassword = user.getPassword();
	
	User userObject =null ;
	if(tempEmail != null && tempPassword != null) {
		userObject = loginservice.getUser(tempEmail, tempPassword);
	}
	if (userObject ==null) {
		throw new Exception("Bad credentials !");
	}
	return userObject;
}


}
