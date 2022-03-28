package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Model.UserRegistration;
import com.project.Repository.UserRegistrationRepo;

@Service
public class UserRegistrationService {
	
	@Autowired
	UserRegistrationRepo repo;

	public UserRegistration userRegistration (UserRegistration ur1) {
		return repo.save(ur1);
	}
	

}
