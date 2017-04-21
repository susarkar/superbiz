package com.ss.app.model;

import org.dozer.Mapping;

public class ChallengeAppModel {
	@Mapping("id")
	private String id;
	@Mapping("appName")
	private String appName;
	@Mapping("packageName")
	private String packageName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	@Override
	public String toString() {
		return "ChallengeAppModel [id=" + id + ", appName=" + appName + ", packageName=" + packageName + "]";
	}
	
	
}
