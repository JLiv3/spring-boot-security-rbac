package org.jlive.rbac.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
//                .antMatchers("/h2-console**").permitAll()
                .antMatchers("/user").access("hasAuthority('canReadUser')")
                .antMatchers("/admin").access("hasAuthority('canReadAdmin')")
                .anyRequest().authenticated()
                .and().httpBasic()
                .and().formLogin();
    }
}
