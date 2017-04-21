package com.ss.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	private Logger logger = LoggerFactory.getLogger(TestController.class);
	@RequestMapping(value="/server_info",method=RequestMethod.GET)
	public @ResponseBody String getServerInfo(){
		logger.debug("Calling TestController.getServerInfo()");
		String retString = "Testing Server Info";
		return retString;
	}
}
