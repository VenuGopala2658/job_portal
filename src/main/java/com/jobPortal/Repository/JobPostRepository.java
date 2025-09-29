package com.jobPortal.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobPortal.Entity.JobPost;
import com.jobPortal.Enum.JobType;

@Repository
public interface JobPostRepository extends JpaRepository<JobPost,Long> {
   List<JobPost>findByPostedByEmail(String email);
   List<JobPost>findByJobTitle(String jobTitle);
   List<JobPost>findByJobType(JobType jobType);  //can also add company name and job id
   List<JobPost>findByCompanyName(String companyName);
}
