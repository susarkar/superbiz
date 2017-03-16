package com.ss.api.model;

import org.dozer.Mapping;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

public class WelcomeAppModel {
	
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

	
	

}
