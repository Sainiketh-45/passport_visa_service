package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Model.User;
import com.project.Repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo repo;

	public User userRegistration (User ur1) {
		return repo.save(ur1);
	}
	

}
