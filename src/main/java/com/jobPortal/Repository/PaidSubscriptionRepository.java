package com.jobPortal.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobPortal.Entity.PaidSubscription;


@Repository
public interface PaidSubscriptionRepository extends JpaRepository<PaidSubscription,Long>{

	List<PaidSubscription>findByRecruiterId(Long recruiterId);
	List<PaidSubscription>findByStudentId(Long studentId);
	List<PaidSubscription>findByUserEmail(String userEmail);
}

