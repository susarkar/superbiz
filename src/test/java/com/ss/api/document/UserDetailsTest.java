package com.ss.api.document;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ss.api.repo.UserDetailsRepository;
import com.ss.api.service.UserDetailsService;

@RunWith(SpringRunner.class)
@SpringBootTest( classes=AppConfig.class ) 
public class UserDetailsTest {
	@Autowired
	UserDetailsRepository repo;
	String mobileNumber = "8017620823";
	String password = "Pass1234";
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		List<UserDetails> list = new ArrayList<UserDetails>();
		list.add(new UserDetails(10L,mobileNumber,"Susanta","susanta-sarakr@gmail",password,new Date(),true,9L,"","","USER"));
		repo.save(list);
	}
	@Test
	public void testUserDetailsLogin() {
		UserDetails u = repo.findByMobileNumberAndPassword(mobileNumber, password);
		assertEquals("Susanta", u.getName());
		assertEquals("susanta-sarakr@gmail", u.getEmail());
	}
	
	@After
	public void tearDown() throws Exception {
		repo.deleteAll();
	}

	
}
