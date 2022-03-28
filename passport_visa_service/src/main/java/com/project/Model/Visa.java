package com.project.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "VISA_REGISTRATION")
public class Visa {

	@Id
    private String VISA_NO;
	
	@NotNull(message = "errorCode 621")
	@NotEmpty(message = "errorCode 621")
	private String PASSPORT_NO;

	public String getPASSPORT_NO() {
		return PASSPORT_NO;
	}

	public void setPASSPORT_NO(String pASSPORT_NO) {
		PASSPORT_NO = pASSPORT_NO;
	}

	private String DESTINATION;
	private String OCCUPATION;
	@DateTimeFormat(pattern = "dd-mm-yyyy")
	private Date DATE_OF_APPLY;
	@DateTimeFormat(pattern = "dd-mm-yyyy")
	private Date DATE_OF_ISSUE;
	@DateTimeFormat(pattern = "dd-mm-yyyy")
	private Date DATE_OF_EXPIRY;

	private int REGISTRATION_COST;

	@OneToOne
	@JoinColumn(name = "USER_ID")
	private User USER_REGISTRATION;

	public User getUSER_REGISTRATION() {
		return USER_REGISTRATION;
	}

	public void setUSER_REGISTRATION(User uSER_REGISTRATION) {
		USER_REGISTRATION = uSER_REGISTRATION;
	}

	public String getVISA_NO() {
		return VISA_NO;
	}

	public void setVISA_NO(String vISA_NO) {
		VISA_NO = vISA_NO;
	}

	public String getDESTINATION() {
		return DESTINATION;
	}

	public void setDESTINATION(String dESTINATION) {
		DESTINATION = dESTINATION;
	}

	public String getOCCUPATION() {
		return OCCUPATION;
	}

	public void setOCCUPATION(String oCCUPATION) {
		OCCUPATION = oCCUPATION;
	}

	public Date getDATE_OF_APPLY() {
		return DATE_OF_APPLY;
	}

	public void setDATE_OF_APPLY(Date dATE_OF_APPLY) {
		DATE_OF_APPLY = dATE_OF_APPLY;
	}

	public Date getDATE_OF_ISSUE() {
		return DATE_OF_ISSUE;
	}

	public void setDATE_OF_ISSUE(Date dATE_OF_ISSUE) {
		DATE_OF_ISSUE = dATE_OF_ISSUE;
	}

	public Date getDATE_OF_EXPIRY() {
		return DATE_OF_EXPIRY;
	}

	public void setDATE_OF_EXPIRY(Date dATE_OF_EXPIRY) {
		DATE_OF_EXPIRY = dATE_OF_EXPIRY;
	}

	public Visa(String pASSPORT_NO) {
		super();
		PASSPORT_NO = pASSPORT_NO;
	}

	public int getREGISTRATION_COST() {
		return REGISTRATION_COST;
	}

	public void setREGISTRATION_COST(int rEGISTRATION_COST) {
		REGISTRATION_COST = rEGISTRATION_COST;
	}

	public Visa(String vISA_NO, String pASSPORT_NO, String dESTINATION, String oCCUPATION,
			Date dATE_OF_APPLY, Date dATE_OF_ISSUE, Date dATE_OF_EXPIRY, int rEGISTRATION_COST,
			User uSER_REGISTRATION) {
		super();
		VISA_NO = vISA_NO;
		PASSPORT_NO = pASSPORT_NO;
		DESTINATION = dESTINATION;
		OCCUPATION = oCCUPATION;
		DATE_OF_APPLY = dATE_OF_APPLY;
		DATE_OF_ISSUE = dATE_OF_ISSUE;
		DATE_OF_EXPIRY = dATE_OF_EXPIRY;
		REGISTRATION_COST = rEGISTRATION_COST;
		USER_REGISTRATION = uSER_REGISTRATION;
	}

	public Visa() {
		super();
	}

	public Visa(String string, String string2, String string3, int i, String string4, String string5,
			String string6, String string7, String string8) {
		// TODO Auto-generated constructor stub
	}

}
