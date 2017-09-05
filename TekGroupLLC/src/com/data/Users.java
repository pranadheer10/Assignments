package com.data;

public class Users {
	private String userName;
	private String email;
	private String phoneNumber;
	private String password;
	private String originalUserName;
	
	
	public String getOriginalUserName() {
		return originalUserName;
	}
	public void setOriginalUserName(String originalUserName) {
		this.originalUserName = originalUserName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
