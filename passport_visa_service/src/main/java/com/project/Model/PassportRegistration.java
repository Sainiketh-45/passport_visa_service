package com.project.Model;


import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Passport_Registration")
public class PassportRegistration {
	
	@Id
	private String TEMPORARY_NO;
	private String COUNTRY;
	private String STATE;
	private String CITY;
	private String PIN;
	private String APPLICATION_TYPE;
	private String BOOKLET_TYPE;
	private Date DATE_OF_ISSUE; 
	private Date DATE_OF_EXPIRY;
	@OneToOne
	@JoinColumn(name="USER_ID")
	private UserRegistration USER_REGISTRATION;
	@OneToOne(mappedBy="Passport_Registration")
	
	public String getTEMPORARY_NO() {
		return TEMPORARY_NO;
	}
	public void setTEMPORARY_NO(String tEMPORARY_NO) {
		TEMPORARY_NO = tEMPORARY_NO;
	}
	
	public String getCOUNTRY() {
		return COUNTRY;
	}
	public void setCOUNTRY(String cOUNTRY) {
		COUNTRY = cOUNTRY;
	}
	public String getSTATE() {
		return STATE;
	}
	public void setSTATE(String sTATE) {
		STATE = sTATE;
	}
	public String getCITY() {
		return CITY;
	}
	public void setCITY(String cITY) {
		CITY = cITY;
	}
	public String getPIN() {
		return PIN;
	}
	public void setPIN(String pIN) {
		PIN = pIN;
	}
	public String getAPPLICATION_TYPE() {
		return APPLICATION_TYPE;
	}
	public void setAPPLICATION_TYPE(String aPPLICATION_TYPE) {
		APPLICATION_TYPE = aPPLICATION_TYPE;
	}
	public String getBOOKLET_TYPE() {
		return BOOKLET_TYPE;
	}
	public void setBOOKLET_TYPE(String bOOKLET_TYPE) {
		BOOKLET_TYPE = bOOKLET_TYPE;
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
	
	
	
	

}
