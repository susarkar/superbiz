package com.ss.api.document;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.ss.api"})
public class AppConfig {
	@Bean
	public DozerBeanMapper getMapper() {
		return new DozerBeanMapper();
	}

}
