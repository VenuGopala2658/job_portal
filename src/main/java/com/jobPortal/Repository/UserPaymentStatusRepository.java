package com.jobPortal.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobPortal.Entity.UserPaymentStatus;

@Repository
public interface UserPaymentStatusRepository extends JpaRepository<UserPaymentStatus,Long>{
	
	Optional<UserPaymentStatus>findByUserId(Long id);
}
