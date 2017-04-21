package com.ss.app;

import org.dozer.DozerBeanMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SuperbizApplication {
	public static void main(String[] args) {
		SpringApplication.run(SuperbizApplication.class, args);
	}
	@Bean
	public DozerBeanMapper getMapper() {
		return new DozerBeanMapper();
	}
}
