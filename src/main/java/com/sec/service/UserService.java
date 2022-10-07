package com.sec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec.model.User;
import com.sec.repository.UserRepository;

@Service
public class UserService {

@Autowired
private UserRepository userrep;



public User getUserByEmailAndPassword(String email, String pwd) {
	
	return userrep.findUserByEmailAndPassword(email, pwd);
}

public User saveUser (User user) {
	return userrep.save(user);
}

public User getUserById(Long id) {
	return userrep.findById(id).get();
}

public void deleteById(Long id) {
	userrep.deleteById(id);
	
}
 

public List<User> getAll(){
	 return userrep.findAll();
	 
 }

}
