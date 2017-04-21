package com.ss.app.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

@Component
public class ApiAccessDeniedHandler implements AccessDeniedHandler{
	private Logger logger = LoggerFactory.getLogger(ApiAccessDeniedHandler.class);
	@Override
	public void handle(HttpServletRequest req, HttpServletResponse res, AccessDeniedException accessDeniedException)
			throws IOException, ServletException {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		logger.debug("User = " +user);
		
		logger.debug("accessDeniedException = " + accessDeniedException);
		res.sendError(HttpServletResponse.SC_FORBIDDEN, "Access Denied");
		
	}

}
