package com.ss.api.document;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ss.api.repo.WelcomeAppRepository;

@RunWith(SpringRunner.class)
@SpringBootTest( classes=AppConfig.class ) 
public class WelcomeAppTest {
    @Autowired
    private WelcomeAppRepository repo;
    
	@Autowired
	private DozerBeanMapper mapper;
	
    @Before
    public void setup(){
    	//repo.deleteAll();
    	List<WelcomeApp> list = new ArrayList<WelcomeApp>();
		list.add(new WelcomeApp("Amazon Kindle","com.amazon.kindle"));
		list.add(new WelcomeApp("CESCAPPS","cesc.co.in"));
		list.add(new WelcomeApp("Flipkart","com.flipkart.android"));
		list.add(new WelcomeApp("HDFC Bank","com.snapwork.hdfc"));
		list.add(new WelcomeApp("Skype","com.skype.raider"));
		list.add(new WelcomeApp("Upwork","com.upwork.android"));
		list.add(new WelcomeApp("Twitter","com.twitter.android"));
		list.add(new WelcomeApp("WhatsApp","com.whatsapp"));
		list.add(new WelcomeApp("My Talking Tom","com.outfit7.mytalkingtomfree"));
		list.add(new WelcomeApp("Hill Climb Racing 2","com.fingersoft.hcr2"));
		repo.save(list);
    }
    
	@Test
	public void testWelcomeAppCount(){
		assertEquals(10, repo.count());
	}
	
	//@After
	public void tearDown(){
		//repo.deleteAll();
	}
}
