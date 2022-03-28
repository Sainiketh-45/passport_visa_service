package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Model.PassportFees;
import com.project.Repository.PassportFeesRepo;

@Service
public class PassportFeesService {
	
	@Autowired
	PassportFeesRepo repo;
	
	public PassportFees passportFees(PassportFees pf1) {
		return repo.save(pf1);
	}
	

}
