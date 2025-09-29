package com.jobPortal.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobPortal.Entity.Admin;
import com.jobPortal.Enum.Role;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{
	
         Admin findByEmail(String email);
         List <Admin> findByRole(Role role);      
}

