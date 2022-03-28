package com.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.project.Model.VisaRegistration;
import com.project.Repository.VisaRegistrationRepo;
import com.project.Service.VisaRegistrationService;

@SpringBootTest
public class VisaTest {
	@MockBean
	private VisaRegistrationRepo repository;

	@Autowired
	private VisaRegistrationService service;

	// fetchVisaDetails

	@Test
	public void getVisaRegistrationAddTest() {
		String PASSPORT_NO = "PASS-1236";
		when(repository
				.findVisaRegistrationByPassportNo(PASSPORT_NO))
						.thenReturn(Stream
								.of(new VisaRegistration("RE-1234", "Retire Employee", "USA", 2500, "2024-05-20",
										"2024-05-30", "2034-03-20", "VISA-1235", "PASS-1236"))
								.collect(Collectors.toList()));
		assertEquals(1, service.findVisaRegistrationByPassportNo(PASSPORT_NO).size());
	}

}
