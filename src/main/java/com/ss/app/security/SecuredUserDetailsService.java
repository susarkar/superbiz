package com.ss.app.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ss.app.controller.SecuredController;
import com.ss.app.repository.UserRepository;

@Service
public class SecuredUserDetailsService implements UserDetailsService {
	private Logger logger = LoggerFactory.getLogger(SecuredUserDetailsService.class);
	@Autowired
	UserRepository userRepo;
	private com.ss.app.document.User securedUser;
	@Override
	public UserDetails loadUserByUsername(String mobileNumber) throws UsernameNotFoundException {
		securedUser = userRepo.findByMobileNumber(mobileNumber);
		logger.debug("SecuredUserDetailsService.loadUserByUsername() user =  " + securedUser);
		if (securedUser == null) throw new UsernameNotFoundException("Name not found!");
		return new User(securedUser.getMobileNumber(), securedUser.getPassword(), true, true, true, true,
				AuthorityUtils.createAuthorityList(securedUser.getRole()));
	}
	public com.ss.app.document.User getSecuredUser() {
		return securedUser;
	}
	
}
