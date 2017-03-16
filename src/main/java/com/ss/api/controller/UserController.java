package com.ss.api.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.text.DateFormatter;

import org.apache.coyote.http11.Http11AprProtocol;
import org.dozer.DozerBeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ss.api.DateUtil;
import com.ss.api.document.UserDetails;
import com.ss.api.model.LoginCredential;
import com.ss.api.model.RegisterResponse;
import com.ss.api.model.RequestModel;
import com.ss.api.model.ResponseModel;
import com.ss.api.model.UserDetailsModel;
import com.ss.api.repo.SequenceRepository;
import com.ss.api.repo.UserDetailsRepository;
import com.ss.api.service.UserDetailsService;

@RestController
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class); 
	private static final Pattern PASSWORD_REGEX = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,}");
	private static final Pattern EMAIL_REGEX = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

/*	@Autowired
	UserDetailsService userDetailsService;*/
	
	@Autowired
	UserDetailsRepository repo;
	
	@Autowired
	DozerBeanMapper mapper;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public @ResponseBody UserDetailsModel login(@RequestBody LoginCredential loginCredential){
		logger.debug("called login () param = " + loginCredential);
		UserDetailsModel retModel = null;
		// validate the param
/*		UserDetails userDetails = userDetailsService.getUserDetails(loginCredential.getMobileNumber(),loginCredential.getPassword());
		UserDetailsModel model = mapper.map(userDetails, UserDetailsModel.class);*/
		if (valid(loginCredential)){
			UserDetails u= repo.findByMobileNumberAndPassword(loginCredential.getMobileNumber(),loginCredential.getPassword());
			if (u != null){
				retModel = mapper.map(u, UserDetailsModel.class);
			}
		}
		logger.debug("Retun Model = " + retModel);
		return retModel;
	}

	private boolean valid(LoginCredential loginCredential) {
		// TODO Auto-generated method stub
		return true;
	}

	@RequestMapping(value="/signup",method=RequestMethod.POST)
	public @ResponseBody UserDetailsModel signup(@RequestBody UserDetailsModel userDetailsModel){
		logger.debug("called signup () param = " + userDetailsModel);
		// validate the param
/*		UserDetails user = userDetailsService.create(mapper.map(userDetailsModel, UserDetails.class));
		return mapper.map(user, UserDetailsModel.class);*/
		UserDetailsModel retModel = null;
		if (valid(userDetailsModel)){
			UserDetails u = repo.save(mapper.map(userDetailsModel, UserDetails.class));
			retModel = mapper.map(u, UserDetailsModel.class);
		}
		
		return retModel;
	}

	private boolean valid(UserDetailsModel userDetailsModel) {
		// TODO Auto-generated method stub
		return true;
	}

}
