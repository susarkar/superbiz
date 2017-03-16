package com.ss.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ss.api.document.WelcomeApp;
import com.ss.api.repo.WelcomeAppRepository;

@Service
public class WelcomeAppService {
	@Autowired
	WelcomeAppRepository repo;
	
	public WelcomeApp create(WelcomeApp welcomeApp){
		repo.save(welcomeApp);
		return welcomeApp;
		
	}
	// more find by methods 
	public WelcomeApp findByPackageName(String  packageName){
		
		
		return repo.findByPackageName(packageName);
		
	}
	
	public WelcomeApp update(WelcomeApp welcomeApp){
		return welcomeApp;
		
	}
	public long delete(WelcomeApp welcomeApp){
		return 0;
		
	}
	public long deleteAll(){
		return 0;
		
	}
}
