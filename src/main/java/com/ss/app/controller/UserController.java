package com.ss.app.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ss.app.document.ChallengeApp;
import com.ss.app.document.User;
import com.ss.app.model.ChallengeAppModel;
import com.ss.app.model.LoginCredential;
import com.ss.app.model.UserModel;
import com.ss.app.repository.ChallengeAppRepository;
import com.ss.app.repository.SequenceRepository;
import com.ss.app.repository.UserRepository;

@RestController
public class UserController {
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	SequenceRepository seqRepo;
	
	@Autowired
	DozerBeanMapper mapper;

	@Autowired
	ChallengeAppRepository caRepo ;
	
	@RequestMapping(value="/signin", method=RequestMethod.POST)
	public @ResponseBody UserModel signin(@RequestBody LoginCredential loginCredential){
		logger.debug("called UserController.signin() param = " + loginCredential);
		User user = userRepo.findByMobileNumberAndPassword(loginCredential.getMobileNumber(), loginCredential.getPassword());
		return  mapper.map(user, UserModel.class);
	}
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public @ResponseBody UserModel signup(@RequestBody UserModel userModel){
		userModel.setUserId(seqRepo.getNextSequenceId("User"));
		logger.debug("called UserController.signup() param = " + userModel);
		User user = userRepo.save(mapper.map(userModel, User.class));
		return  mapper.map(user, UserModel.class);
	}
	
	@RequestMapping(value="/all_challenges", method=RequestMethod.GET)
	public @ResponseBody List<ChallengeAppModel> getAllChallengeApp(){
		logger.debug("Called ChallengeAppController.getAllChallengeApp()");
		List<ChallengeAppModel> list = new ArrayList<ChallengeAppModel>();
		for (ChallengeApp app : caRepo.findAll()){
			list.add(mapper.map(app, ChallengeAppModel.class));
		}
		
		return list;
	}
	
}
