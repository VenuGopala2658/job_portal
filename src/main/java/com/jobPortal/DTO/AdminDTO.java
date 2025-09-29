package com.jobPortal.DTO;

import com.jobPortal.Enum.Role;

public class AdminDTO {

	public Long id;
	public String name;
	public String email;
	public Role role;
	public boolean active;
	public boolean blocked;

	public AdminDTO() {
	}

	public AdminDTO(Long id, String name, String email, Role role, boolean active, boolean blocked) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.role = role;
		this.active = active;
		this.blocked = blocked;
	}

}