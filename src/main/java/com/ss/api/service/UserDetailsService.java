package com.ss.api.service;

import java.util.regex.Pattern;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ss.api.ValidationUtil;
import com.ss.api.document.UserDetails;
import com.ss.api.model.UserDetailsModel;
import com.ss.api.repo.UserDetailsRepository;

@Service
public class UserDetailsService {
	

	@Autowired
	private UserDetailsRepository repo;
	
	
	public UserDetails create(UserDetails userDetails){
		//  validate the model for all constraints 
		UserDetails user = repo.save(userDetails);
		return user;
	}
	// more findByMethods 

	
	public UserDetailsModel update(UserDetailsModel userDetailsModel){
		return null;
		
	}
	public long delete(UserDetailsModel userDetailsModel){
		return 0;
		
	}
	public long deleteAll(){
		return 0;
		
	}


	public UserDetails getUserDetails(String mobileNumber,String password) {
		UserDetails userDetails = repo.findByMobileNumberAndPassword(mobileNumber,password);
		return userDetails;
	}


}
