package com.ss.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ss.app.document.User;

public interface UserRepository extends MongoRepository<User, String> {
	User findByMobileNumber(String mobileNumber);
	List<User> findByMobileNumberIn(List<String> mobileNumbers);
	User findByMobileNumberAndPassword(String mobileNumber, String password);
	User findByUserId(long userId);

}
