package com.ss.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ss.app.document.ChallengeApp;

public interface ChallengeAppRepository extends MongoRepository<ChallengeApp, String> {
	ChallengeApp findByPackageName(String PackageName);
}
