package com.ss.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ss.api.document.Sequence;
import com.ss.api.document.UserDetails;
import com.ss.api.repo.SequenceRepository;
import com.ss.api.repo.UserDetailsRepository;

@RestController
public class ServerController {

	@Autowired
	SequenceRepository seqRepo;
	
	private Logger logger = LoggerFactory.getLogger(ServerController.class);
	@RequestMapping(value="/serverStatus",method=RequestMethod.GET)
	public @ResponseBody String serverStatus(){
		logger.debug("Hello testing Log to the console");
/*		StringBuilder sb = new StringBuilder();
		sb.append("{");
		sb.append("\"isAlive\"");
		sb.append(":");
		sb.append("true");		
		sb.append("}");
		return sb.toString();*/
		
		long seqId = seqRepo.getNextSequenceId(UserDetails.class.getSimpleName());
		System.out.println(UserDetails.class.getSimpleName() + "Seq Id = " + seqId);
		return UserDetails.class.getSimpleName() + " next sequence no = "+seqId;
		
	} 
	@RequestMapping(value="/initSequence",method=RequestMethod.GET)
	public @ResponseBody String initSequence(){
		
	Sequence seq = new Sequence();
	seq.setId("UserDetails");
	seq.setSeq(0);
	Sequence s = seqRepo.save(seq);
	return "UserDetails Seq No = "+seq.getSeq();
		
	}
}
