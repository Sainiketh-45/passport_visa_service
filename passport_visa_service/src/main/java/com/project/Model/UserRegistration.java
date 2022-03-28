package com.project.Model;

import java.math.BigInteger;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="USER_REGISTRATION")
public  class UserRegistration {
	
	
	@Id
	private String USER_ID;
	private String NAME;
	private String PASSWORD;
	private String QUALIFICATION;
	private String EMAILID;
	private BigInteger CONTACT;
	@DateTimeFormat(pattern="DD-MM-YYYY")
	private Date DATE_OF_BIRTH;
	private String APPLY_TYPE;
	private String CITIZENSHIP;
	private String GENDER;
	private String Hint_Question;
	private String Hint_Answer;
	
	@OneToOne(mappedBy = "USER_REGISTRATION")
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	public String getQUALIFICATION() {
		return QUALIFICATION;
	}
	public void setQUALIFICATION(String qUALIFICATION) {
		QUALIFICATION = qUALIFICATION;
	}
	public String getEMAILID() {
		return EMAILID;
	}
	public void setEMAILID(String eMAILID) {
		EMAILID = eMAILID;
	}
	public BigInteger getCONTACT() {
		return CONTACT;
	}
	public void setCONTACT(BigInteger cONTACT) {
		CONTACT = cONTACT;
	}
	public Date getDATE_OF_BIRTH() {
		return DATE_OF_BIRTH;
	}
	public void setDATE_OF_BIRTH(Date dATE_OF_BIRTH) {
		DATE_OF_BIRTH = dATE_OF_BIRTH;
	}
	public String getAPPLY_TYPE() {
		return APPLY_TYPE;
	}
	public void setAPPLY_TYPE(String aPPLY_TYPE) {
		APPLY_TYPE = aPPLY_TYPE;
	}
	public String getCITIZENSHIP() {
		return CITIZENSHIP;
	}
	public void setCITIZENSHIP(String cITIZENSHIP) {
		CITIZENSHIP = cITIZENSHIP;
	}
	public String getGENDER() {
		return GENDER;
	}
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}
	public String getHint_Question() {
		return Hint_Question;
	}
	public void setHint_Question(String hint_Question) {
		Hint_Question = hint_Question;
	}
	public String getHint_Answer() {
		return Hint_Answer;
	}
	public void setHint_Answer(String hint_Answer) {
		Hint_Answer = hint_Answer;
	}
	@Override
	public String toString() {
		return "UserRegistration [USER_ID=" + USER_ID + ", NAME=" + NAME + ", PASSWORD=" + PASSWORD + ", QUALIFICATION="
				+ QUALIFICATION + ", EMAILID=" + EMAILID + ", CONTACT=" + CONTACT + ", DATE_OF_BIRTH=" + DATE_OF_BIRTH
				+ ", APPLY_TYPE=" + APPLY_TYPE + ", CITIZENSHIP=" + CITIZENSHIP + ", GENDER=" + GENDER
				+ ", Hint_Question=" + Hint_Question + ", Hint_Answer=" + Hint_Answer + "]";
	}
	
}
