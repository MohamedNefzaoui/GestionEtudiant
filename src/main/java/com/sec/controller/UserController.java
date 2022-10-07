package com.sec.controller;

import java.nio.file.Path;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sec.model.User;

import com.sec.service.UserService;

@RestController
@RequestMapping("/User/api")

public class UserController {

@Autowired
private UserService userservice;
 

//API Get User
@GetMapping("/getAllUsers")
public List<User> getAllUsers(){
	return userservice.getAll();
}


 //API Add User 
 @PostMapping("/saveUser")
 
  public User saveUser(@RequestBody  User user) {
	 return userservice.saveUser(user);
 }

//API Update User
 @PutMapping ("/updateUser/{id}")
 
public User updateUser(@PathVariable(value ="id") Long id, @RequestBody User user  ) {
	 User userObject = userservice.getUserById(id);
	 userObject.setEmail(user.getEmail());
	 userObject.setFonction(user.getFonction());
	 userObject.setNom(user.getNom());
	 
	 final User updatedUser = userservice.saveUser(userObject);
	 
	 return updatedUser;
	 // return userservice.saveUser(userObject);
 }
  
 // API Delete User
 @DeleteMapping("/deleteUserById/{id}")
  public String deleteUser(@PathVariable (value = "id") Long id) {
	 User userObject= userservice.getUserById(id);
	 if(userObject == null) {
		 return "user with this id doesn't exist !";
	 }
	 userservice.deleteById(id);
	 
	 return "user deleted";
 }
 
 
}
