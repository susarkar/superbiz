package com.ss.api.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;
@Component
public class ApiAccessDeniedHandler implements AccessDeniedHandler{

	@Override
	public void handle(HttpServletRequest req, HttpServletResponse res, AccessDeniedException accessDeniedExceptio)
			throws IOException, ServletException {
		res.sendError(HttpServletResponse.SC_FORBIDDEN, "Access Denied");
		
	}

}
