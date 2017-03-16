package com.ss.api.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ss.api.document.UserDetails;

public interface UserDetailsRepository extends MongoRepository<UserDetails, String>{
	UserDetails findByMobileNumber(String mobileNumber);
	List<UserDetails> findByMobileNumberIn(List<String> mobileNumbers);
	UserDetails findByMobileNumberAndPassword(String mobileNumber, String password);
}
