package com.jobPortal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobPortal.Entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long>{
}
