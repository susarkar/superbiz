package com.ss.app.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
    SecuredUserDetailsService securedUserDetailsService ;

	@Autowired
	private ApiAccessDeniedHandler accessDeniedHandler;
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	http
        .authorizeRequests()
        .antMatchers("/server_info").permitAll()
        .antMatchers("/signin").permitAll()
        .antMatchers("/signup").permitAll()
        .antMatchers("/all_challenges").permitAll()
        .antMatchers("/tag/**").hasRole("USER")
        .anyRequest().fullyAuthenticated()
        .and()
        .httpBasic()
        .and()
        .exceptionHandling().accessDeniedHandler(accessDeniedHandler);
    	http.csrf().disable();
    }

    @Autowired
    public void configAuthBuilder(AuthenticationManagerBuilder builder) throws Exception {
        builder.userDetailsService(securedUserDetailsService); 
    }


}
