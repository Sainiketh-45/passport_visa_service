package com.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.project.ExceptionHandling.PVSException;

import com.project.Model.VisaRegistration;

import com.project.Service.VisaRegistrationService;

@RestController
@RequestMapping("/VisaRegistration")

public class VisaController {

	@Autowired
	VisaRegistrationService service;

	// ADDING VISA DETAILS

	@PostMapping("/addVisaRegistration")
	public ResponseEntity<VisaRegistration> addVisaRegistration(@Validated @RequestBody VisaRegistration vs) {

		VisaRegistration obj = service.visaRegistration(vs);

		return new ResponseEntity<VisaRegistration>(obj, HttpStatus.OK);

	}

	// FETCHING PASSPORT_NO

	@GetMapping("/fetchVisaDetails/{PASSPORT_NO}")

	public ResponseEntity<List<VisaRegistration>> fetchByPassportNo(@PathVariable String PASSPORT_NO) {

		String status = null;
		List<VisaRegistration> obj = service.findVisaRegistrationByPassportNo(PASSPORT_NO);

		if (!obj.isEmpty()) {
			status = "Passport is available";
			System.out.println(status);
		} else {
			throw new PVSException("errorCode 601");

		}

		return new ResponseEntity<List<VisaRegistration>>(obj, HttpStatus.OK);
	}

}
