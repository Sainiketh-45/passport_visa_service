package com.project.Model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "PASSPORT_FEES")
public class PassportFees {

	@Id
	private String PASSPORT_NO;
	private String AMOUNT;
	private String TYPE_OF_SERVICE;

	@OneToOne
	@JoinColumn(name = "TEMPORARY_NO")
	private PassportRegister Passport_Registration;

	@JsonIgnore
	public String getTEMPORARY_NO() {
		return Passport_Registration.getTEMPORARY_NO();
	}

	@OneToOne(mappedBy = "Passport_Fees")

	public String getPASSPORT_NO() {
		return PASSPORT_NO;
	}

	public void setPASSPORT_NO(String pASSPORT_NO) {
		PASSPORT_NO = pASSPORT_NO;
	}

	public PassportRegister getPassport_Registration() {
		return Passport_Registration;
	}

	public void setPassport_Registration(PassportRegister passport_Registration) {
		Passport_Registration = passport_Registration;
	}

	public String getAMOUNT() {
		return AMOUNT;
	}

	public void setAMOUNT(String aMOUNT) {
		AMOUNT = aMOUNT;
	}

	public String getTYPE_OF_SERVICE() {
		return TYPE_OF_SERVICE;
	}

	public void setTYPE_OF_SERVICE(String tYPE_OF_SERVICE) {
		TYPE_OF_SERVICE = tYPE_OF_SERVICE;
	}

	@Override
	public String toString() {
		return "PassportFees [PASSPORT_NO=" + PASSPORT_NO + ", AMOUNT=" + AMOUNT + ", TYPE_OF_SERVICE="
				+ TYPE_OF_SERVICE + ", Passport_Registration=" + Passport_Registration + ", getTEMPORARY_NO()="
				+ getTEMPORARY_NO() + "]";
	}

}
