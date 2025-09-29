package com.jobPortal.Service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobPortal.DTO.AdminDTO;
import com.jobPortal.Entity.Admin;
import com.jobPortal.Enum.Role;
import com.jobPortal.Repository.AdminRepository; 

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminUserRepository;
	
	public List<AdminDTO>getAllUsers(){
		return adminUserRepository.findAll().stream().map(this::toDTO).collect(Collectors.toList());
	}


	
	public AdminDTO blockUser(Long id) {
		Admin user = adminUserRepository.findById(id).orElse(null);
		if(user!= null) {
		  user.setBlocked(true);
		  adminUserRepository.save(user);
		  return toDTO(user);
		}
		return null;
	}
	
	public AdminDTO unBlockUser(Long id) {
		Admin user = adminUserRepository.findById(id).orElse(null);
		if(user!= null) {
		  user.setBlocked(false);
		  adminUserRepository.save(user);
		  return toDTO(user);
		}
		return null;
	}
	
	//add users and delete users function are needed
	
	public List<AdminDTO>getUserByRole(Role role){
		
		return adminUserRepository.findByRole(role).stream().map(this::toDTO)
				.collect(Collectors.toList());
	}
	
    public AdminDTO updateStatus(Long id, boolean isActive){
		
    	Admin user = adminUserRepository.findById(id).orElse(null);
		if(user==null) throw new RuntimeException("User not found");
		
		user.setActive(isActive);
		adminUserRepository.save(user);
		return toDTO(user);
	}
    
    private AdminDTO toDTO(Admin admin) {
    	return new AdminDTO(admin.getId(),
    			            admin.getName(),
    			            admin.getEmail(),
    			            admin.getRole(),
    			            admin.isActive(), 
    			            admin.isBlocked());
    }
}
