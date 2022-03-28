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

import com.project.Model.Visa;

import com.project.Service.VisaService;

@RestController
@RequestMapping("/VisaRegistration")

public class VisaController {

	@Autowired
	VisaService service;

	// ADDING VISA DETAILS

	@PostMapping("/addVisaRegistration")
	public ResponseEntity<Visa> addVisaRegistration(@Validated @RequestBody Visa vs) {

		Visa obj = service.visaRegistration(vs);

		return new ResponseEntity<Visa>(obj, HttpStatus.OK);

	}

	// FETCHING PASSPORT_NO

	@GetMapping("/fetchVisaDetails/{PASSPORT_NO}")

	public ResponseEntity<List<Visa>> fetchByPassportNo(@PathVariable String PASSPORT_NO) {

		String status = null;
		List<Visa> obj = service.findVisaRegistrationByPassportNo(PASSPORT_NO);

		if (!obj.isEmpty()) {
			status = "Passport is available";
			System.out.println(status);
		} else {
			throw new PVSException("errorCode 601");

		}

		return new ResponseEntity<List<Visa>>(obj, HttpStatus.OK);
	}

}
