package com.ss.app.document;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
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
	private String dob;
	private boolean agreedTC;
	private long sponsorId;
	private String authToken;
	private String deviceRegId;
	private String role;
	private BigDecimal signupBonus;
	private BigDecimal earnMore;
	private BigDecimal iJunction;
	private BigDecimal shopping;
	private BigDecimal oIncome;
	
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
	
	
	
	public BigDecimal getSignupBonus() {
		return signupBonus;
	}
	public void setSignupBonus(BigDecimal signupBonus) {
		this.signupBonus = signupBonus;
	}
	public BigDecimal getEarnMore() {
		return earnMore;
	}
	public void setEarnMore(BigDecimal earnMore) {
		this.earnMore = earnMore;
	}
	public BigDecimal getiJunction() {
		return iJunction;
	}
	public void setiJunction(BigDecimal iJunction) {
		this.iJunction = iJunction;
	}
	public BigDecimal getShopping() {
		return shopping;
	}
	public void setShopping(BigDecimal shopping) {
		this.shopping = shopping;
	}
	public BigDecimal getoIncome() {
		return oIncome;
	}
	public void setoIncome(BigDecimal oIncome) {
		this.oIncome = oIncome;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", mobileNumber=" + mobileNumber + ", name=" + name
				+ ", email=" + email + ", password=" + password + ", dob=" + dob + ", agreedTC=" + agreedTC
				+ ", sponsorId=" + sponsorId + ", authToken=" + authToken + ", deviceRegId=" + deviceRegId + ", role="
				+ role + ", signupBonus=" + signupBonus + ", earnMore=" + earnMore + ", iJunction=" + iJunction
				+ ", shopping=" + shopping + ", oIncome=" + oIncome + "]";
	}
	
	
}
