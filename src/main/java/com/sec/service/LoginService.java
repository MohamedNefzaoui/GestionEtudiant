package com.sec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec.model.User;
import com.sec.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginrep;
	
	public User getUser(String email, String pwd) {
		return loginrep.findUserByEmailAndPassword(email, pwd);
	}

}
