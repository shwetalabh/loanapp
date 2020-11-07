package com.iiht.evaluation.eloan.dto;

import java.util.Date;

public class LoanDto {
	private String loanName;
	private String applicationNumber;
	private double amtRequested;
	private double emi;
	private Date loanAppDate;
	private String busStruct;
	private boolean isTaxPayer;
	private boolean isSalaried;
	private String email;
	private String mobile;
	private String address;
	private String userId;

	public LoanDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getLoanName() {
		return loanName;
	}

	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}

	public String getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public double getAmtRequested() {
		return amtRequested;
	}

	public void setAmtRequested(double amtRequested) {
		this.amtRequested = amtRequested;
	}

	public double getEmi() {
		return emi;
	}

	public void setEmi(double emi) {
		this.emi = emi;
	}

	public Date getLoanAppDate() {
		return loanAppDate;
	}

	public void setLoanAppDate(Date loanAppDate) {
		this.loanAppDate = loanAppDate;
	}

	public String getBusStruct() {
		return busStruct;
	}

	public void setBusStruct(String busStruct) {
		this.busStruct = busStruct;
	}

	public boolean isTaxPayer() {
		return isTaxPayer;
	}

	public void setTaxPayer(boolean isTaxPayer) {
		this.isTaxPayer = isTaxPayer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isSalaried() {
		return isSalaried;
	}

	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
