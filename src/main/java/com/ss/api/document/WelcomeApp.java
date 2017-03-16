package com.ss.api.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class WelcomeApp {
	@Id
	private String id;
	
	private String appName;
	@Indexed(unique=true)
	private String packageName;
	
	
	
	public WelcomeApp() {
		super();
	}


	public WelcomeApp(String appName, String packageName) {
		super();
		this.appName = appName;
		this.packageName = packageName;
	}
	
	
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
