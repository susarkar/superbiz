package com.ss.app.model;

import org.dozer.Mapping;

public class UserModel {
	@Mapping("id")
	private String id;
	@Mapping("userId")
	private long userId;
	@Mapping("mobileNumber")
	private String mobileNumber;
	@Mapping("name")
	private String name;
	@Mapping("email")
	private String email;
	@Mapping("password")
	private String password;
	@Mapping("dob")
	private String dob;
	@Mapping("agreedTC")
	private boolean agreedTC;
	@Mapping("sponsorId")
	private long sponsorId;
	@Mapping("authToken")
	private String authToken;
	@Mapping("deviceRegId")
	private String deviceRegId;
	@Mapping("role")
	private String role;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public boolean isAgreedTC() {
		return agreedTC;
	}
	public void setAgreedTC(boolean agreedTC) {
		this.agreedTC = agreedTC;
	}
	public long getSponsorId() {
		return sponsorId;
	}
	public void setSponsorId(long sponsorId) {
		this.sponsorId = sponsorId;
	}
	public String getAuthToken() {
		return authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public String getDeviceRegId() {
		return deviceRegId;
	}
	public void setDeviceRegId(String deviceRegId) {
		this.deviceRegId = deviceRegId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", userId=" + userId + ", mobileNumber=" + mobileNumber + ", name=" + name
				+ ", email=" + email + ", password=" + password + ", dob=" + dob + ", agreedTC=" + agreedTC
				+ ", sponsorId=" + sponsorId + ", authToken=" + authToken + ", deviceRegId=" + deviceRegId + ", role="
				+ role + "]";
	}
	
	
	
}
