package com.ss.api.document;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ss.api.model.UserDetailsModel;

@Document
public class UserDetails {
	@Id
	private String id;
	@Indexed(unique=true)
	private long userId;
	@Indexed(unique=true)
	private String mobileNumber;
	private String name;
	@Indexed(unique=true)
	private String email;
	private String password;
	private Date dob;
	private boolean agreedTC;
	private long sponsorId;
	private String authToken;
	private String deviceRegId;
	private String role;
	
	
	public UserDetails(long userId, String mobileNumber, String name, String email, String password, Date dob,
			boolean agreedTC, long sponsorId, String authToken, String deviceRegId, String role) {
		super();
		this.userId = userId;
		this.mobileNumber = mobileNumber;
		this.name = name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.agreedTC = agreedTC;
		this.sponsorId = sponsorId;
		this.authToken = authToken;
		this.deviceRegId = deviceRegId;
		this.role = role;
	}
	public UserDetails() {
		super();
	}
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
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

	
	
}
