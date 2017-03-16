package com.ss.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ss.api.document.WelcomeApp;
import com.ss.api.model.WelcomeAppModel;
import com.ss.api.repo.WelcomeAppRepository;

@RestController

public class WelcomeAppController {
	private static final Logger logger = LoggerFactory.getLogger(WelcomeAppController.class); 

	@Autowired
	DozerBeanMapper mapper;
	@Autowired
	WelcomeAppRepository repo;
	
	@RequestMapping(value="/welcomeApp", method=RequestMethod.GET)
	public @ResponseBody List<WelcomeAppModel> getWelcomeApp(){
		logger.debug("Wlcome app list controller ");
		List<WelcomeAppModel> retList = new ArrayList<WelcomeAppModel>();
		List<WelcomeApp> list = repo.findAll();
		for(WelcomeApp app : list){
			retList.add(mapper.map(app,WelcomeAppModel.class));
		}
		return retList;
	
	}
}
