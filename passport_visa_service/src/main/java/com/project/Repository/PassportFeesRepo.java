package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Model.PassportFees;

@Repository
public interface PassportFeesRepo extends JpaRepository<PassportFees, String> {

}
