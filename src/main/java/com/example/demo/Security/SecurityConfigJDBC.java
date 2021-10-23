/*
package com.example.demo.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@EnableWebSecurity
public class SecurityConfigJDBC extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource);
               */
/* .withDefaultSchema()
                .withUser(
                        User.withUsername("check")
                        .password("check")
                        .roles("USER")
                )
                .withUser(
                        User.withUsername("hello")
                        .password("hello")
                        .roles("ADMIN")
                );*//*

    }



    */
/*@Bean
    public PasswordEncoder getPasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }*//*


    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {

        httpSecurity.
                authorizeRequests()
                .antMatchers("/hello")
                .hasRole("ADMIN")
                .antMatchers("/check")
                .hasRole("USER")
                .antMatchers("/").permitAll()
                .and().formLogin();
        //httpSecurity.authorizeRequests().antMatchers("/login*").permitAll();

    }

}
*/
