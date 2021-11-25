package com.bankapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure (HttpSecurity http) throws  Exception {
    http
        .authorizeRequests()
        .antMatchers("/notices","/contact")
        .permitAll()
        .antMatchers("/loans","/cards","/balance","/account")
        .authenticated()
        .and().formLogin()
        .and().httpBasic();
  }

}
