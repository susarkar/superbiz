package com.ss.app.model;

public class LoginCredential {
	String mobileNumber;
	String password;
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginCredential [mobileNumber=" + mobileNumber + ", password=" + password + "]";
	}
	
	
}
