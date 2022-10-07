package com.sec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sec.model.User;
import com.sec.repository.UserRepository;
import com.sec.service.RegisterService;

@RestController
@RequestMapping("/registerUser")
@CrossOrigin(origins ="http://localhost:4200")
public class RegisterController {
	
 @Autowired
 private UserRepository userRepository;
 private RegisterService registerservice;
 
 //API Register 
 @PostMapping("/register")
 public User registerUser(@RequestBody User user) throws Exception {
	
	 // verification email
	 String tempEmail =user.getEmail();
	 if(tempEmail!= null && !"".equals(tempEmail)) {
		User userObject = userRepository.findUserByEmail(tempEmail);
		if(userObject != null) {
			throw new Exception(" this email"+userObject.getEmail() +"is already exist");
		}
	 }
	
	return registerservice.saveUser(user);
	 
	 
	 
	 
	 
 }
	

}
