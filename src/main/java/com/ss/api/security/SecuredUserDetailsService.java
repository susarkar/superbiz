package com.ss.api.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ss.api.repo.UserDetailsRepository;

@Service
public class SecuredUserDetailsService implements UserDetailsService {

	@Autowired
	UserDetailsRepository userDetailsRepo;

	@Override
	public UserDetails loadUserByUsername(String mobileNumbers) throws UsernameNotFoundException {
		com.ss.api.document.UserDetails user = userDetailsRepo.findByMobileNumber(mobileNumbers);
		if (user == null)
			throw new UsernameNotFoundException("Name not found!");
		return new User(user.getMobileNumber(), user.getAuthToken(), true, true, true, true,
				AuthorityUtils.createAuthorityList(user.getRole()));
	}

}
