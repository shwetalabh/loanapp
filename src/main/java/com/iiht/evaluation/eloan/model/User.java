package com.iiht.evaluation.eloan.model;

public class User {

	private String username;
	private String password;
	private String email;
	private String userType;
	private String panNumber;
	private String adhaarNumber;
	private String userId;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getAdhaarNumber() {
		return adhaarNumber;
	}

	public void setAdhaarNumber(String adhaarNumber) {
		this.adhaarNumber = adhaarNumber;
	}

	public User(String username, String password, String email, String userType, String panNumber,
			String adhaarNumber) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.userType = userType;
		this.panNumber = panNumber;
		this.adhaarNumber = adhaarNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((adhaarNumber == null) ? 0 : adhaarNumber.hashCode());
		result = prime * result + ((panNumber == null) ? 0 : panNumber.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", Email=" + email + ", userType=" + userType
				+ ", panNumber=" + panNumber + ", adhaarNumber=" + adhaarNumber + "]";
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
