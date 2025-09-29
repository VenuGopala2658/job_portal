package com.jobPortal.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jobPortal.DTO.AuthResponse;
import com.jobPortal.DTO.LoginRequest;
import com.jobPortal.DTO.RegisterRequest;
import com.jobPortal.Entity.User;
import com.jobPortal.Repository.UserRepository;
import com.jobPortal.Security.JWTUtil;


@Service
public class AuthService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private JWTUtil jwtUtil;
	
	
	 public AuthResponse register(RegisterRequest request) {
		 
		 User user = new User();
		 user.setName(request.name);
		 user.setEmail(request.email);
		 user.setPassword(passwordEncoder.encode(request.password));
		 user.setRole(request.role);
		 userRepository.save(user);
		 
		 String token = jwtUtil.generateToken( user.getEmail(),user.getRole().name());
		 return  new AuthResponse(token,"User Registeration Successful");
		 
		  
	 }
	 
	 
	 public AuthResponse login(LoginRequest request) {
		 
		 User user = userRepository.findByEmail(request.email).orElseThrow(()-> new RuntimeException("User not found"));
		 
		 
		 if(!passwordEncoder.matches(request.password, user.getPassword()))
			 throw new RuntimeException("Invalid credentials");
		 
		 String token = jwtUtil.generateToken(user.getEmail(), user.getRole().name());
		 return new AuthResponse(token,"Login Successful");
		 
		 
	 }
}


