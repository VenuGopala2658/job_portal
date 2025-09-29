package com.jobPortal.DTO;

import com.jobPortal.Enum.Role;

public class RegisterRequest {
   	public String name;
	public String email;
	public String password;
	public Role role;


public RegisterRequest(String name, String email, String password, Role role) {
	
	this.name=name;
	this.email=email;
	this.password=password;
	this.role=role;
}

}