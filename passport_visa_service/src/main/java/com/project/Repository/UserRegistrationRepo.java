package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Model.UserRegistration;

@Repository
public interface UserRegistrationRepo extends JpaRepository<UserRegistration, String>{

}
