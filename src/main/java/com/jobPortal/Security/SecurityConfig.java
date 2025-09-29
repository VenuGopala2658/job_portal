package com.jobPortal.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		
		return http.csrf().disable()
		.authorizeHttpRequests( auth->auth
        .antMatchers( "/api/auth/**",
                     "/api/students/**",
                     "/api/recruiters/**",
                     "/api/jobPosts/**",
                     "/api/applications/**",
                     "/api/admins/**",
                     "/api/notify/**",
                     "/api/uploadFiles/**",
                     "/api/analytics/**",
                     "/api/payments/**",
                     "/api/subscriptions",
                     "/api/user_payment_status",
                     "/api/subscription_plans"
                    ).permitAll()
        .anyRequest().authenticated())
		.build();
		
//		return http.build();
		
    }
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	 @Bean
	    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
	        return config.getAuthenticationManager();
	    }

}
