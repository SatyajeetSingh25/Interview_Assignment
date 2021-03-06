package com.example.assignment.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	 @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

	        auth.inMemoryAuthentication()
	                .withUser("admin").password("password").roles("ADMIN");

	    }

	    // Secure the endpoins with HTTP Basic authentication
	    @Override
	    protected void configure(HttpSecurity http) throws Exception {

	        http
	                //HTTP Basic authentication
	                .httpBasic()
	                .and()
	                .authorizeRequests()
	                .antMatchers("/admin/**").hasRole("ADMIN")
	                .and()
	                .formLogin();
	    }

}