package com.sec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sec.model.User;


@Repository
public interface LoginRepository extends JpaRepository<User, Long> {

	public User findUserByEmail(String email);
	
	public User findUserByEmailAndPassword(String email, String password);
	
	
}
