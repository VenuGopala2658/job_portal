package com.jobPortal.Repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobPortal.Entity.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long>{
	 //List<Application>findByStudentEmail(String studentEmail); 
	 //List<Application>findByRecruiterEmail(String recruiterEmail);
	 List<Application>findByStudentId(Long studentId);
     List<Application>findByJobId(Long jobId);
     Optional<Application>findById(Long id);
}
