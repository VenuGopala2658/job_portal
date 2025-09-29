package com.jobPortal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jobPortal.DTO.AdminDTO;
import com.jobPortal.Enum.Role;
import com.jobPortal.Service.AdminService;

@RestController
@RequestMapping("/api/admins")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@GetMapping("/users")
	public ResponseEntity<List<AdminDTO>>getAllUsers(){
	 return ResponseEntity.ok(adminService.getAllUsers());
		
	}
	
	@GetMapping("/role/{role}")
	 public ResponseEntity<List<AdminDTO>>getByRole(@PathVariable Role role){
		 return ResponseEntity.ok(adminService.getUserByRole(role));
	 }

	@PutMapping("/{id}/status")
	 public ResponseEntity<AdminDTO>updateUserStatus(@PathVariable Long id, @RequestParam boolean active){
		 return ResponseEntity.ok(adminService.updateStatus(id,active));
   }
	
	@PutMapping("/{id}/block")
	 public ResponseEntity<AdminDTO>blockUser(@PathVariable Long id){
		AdminDTO dto = adminService.blockUser(id);
		if(dto==null) {
			return ResponseEntity.notFound().build();
		}
		 return ResponseEntity.ok(dto);
	 }
	
	@PutMapping("/{id}/unBlock")
	 public ResponseEntity<AdminDTO>unBlockUser(@PathVariable Long id){
		AdminDTO dto = adminService.unBlockUser(id);
		if(dto==null) {
			return ResponseEntity.notFound().build();
		}
		 return ResponseEntity.ok(dto);
	 }
}




