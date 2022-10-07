package com.sec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec.model.User;
import com.sec.repository.RegisterRepository;

@Service
public class RegisterService {
	
 @Autowired
 private RegisterRepository registerrep;
   
  public User saveUser(User user) {
	 return registerrep.save(user);
	 
 }
 
 public User getUserByEamil(String email) {
	 return registerrep.findUserByEmail(email);
 }
}
