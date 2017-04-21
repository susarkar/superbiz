package com.ss.app.controller;

import java.math.BigDecimal;
import java.security.Principal;

import org.dozer.DozerBeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ss.app.document.User;
import com.ss.app.model.UserModel;
import com.ss.app.repository.SequenceRepository;
import com.ss.app.repository.UserRepository;
import com.ss.app.security.SecuredUserDetailsService;

@RestController
@RequestMapping("/secured")
public class SecuredController {
	private Logger logger = LoggerFactory.getLogger(SecuredController.class);
	@Autowired
	UserRepository userRepo;

	@Autowired
	SecuredUserDetailsService securedUserService;
	
	@Autowired
	DozerBeanMapper mapper;

	@RequestMapping(value="/addSignupBonus", method=RequestMethod.GET)
	public @ResponseBody UserModel addSignupBonus(){
		User user = securedUserService.getSecuredUser();
		logger.debug("called SecuredController.addSigupBonus() param = " + securedUserService.getSecuredUser());
		//long userid = user.getUserId();
		for (int n =1;n<=7;n++){
			BigDecimal amt = new BigDecimal((double)1/n);
			logger.debug("amount = " + amt);
			user.setSignupBonus(user.getSignupBonus().add(amt).setScale(5,BigDecimal.ROUND_HALF_UP));
			userRepo.save(user);
			long sponsorId = user.getSponsorId();
			if (sponsorId ==0) break;
			user = userRepo.findByUserId(sponsorId);
		}
		
		return  new UserModel();
	}
	
	@RequestMapping(value="/addEarnMore", method=RequestMethod.GET)
	public @ResponseBody UserModel addEarnMore(){
		logger.debug("called SecuredController.addEarnMore() param = " );	
		return  new UserModel();
	}
}
