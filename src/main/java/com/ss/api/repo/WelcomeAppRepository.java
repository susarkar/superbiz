package com.ss.api.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ss.api.document.WelcomeApp;

public interface WelcomeAppRepository extends MongoRepository<WelcomeApp, String>{
	WelcomeApp findByPackageName(String PackageName);
	
}
