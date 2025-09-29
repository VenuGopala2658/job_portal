package com.jobPortal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jobPortal.DTO.JobPostDTO;
import com.jobPortal.Enum.JobType;
import com.jobPortal.Repository.JobPostRepository;
import com.jobPortal.Service.JobPostService;

@RestController
@RequestMapping("/api/jobPosts")
public class JobPostController {
  @Autowired
  private JobPostService jobPostService;
  
  @Autowired
  private JobPostRepository jobPostRepository;
  
 @PostMapping
 public ResponseEntity<JobPostDTO>createJob(@RequestBody JobPostDTO dto){
	 return ResponseEntity.ok(jobPostService.postJob(dto));
 }
 
 @GetMapping("/email")
 public ResponseEntity<List<JobPostDTO>>getByPostedEmail(@RequestParam String email){
	 return ResponseEntity.ok(jobPostService.getByPostedByEmail(email));	 
 }
 
 @GetMapping("/jobTitle")
 public ResponseEntity<List<JobPostDTO>>getByJobTitle(@RequestParam String jobTitle){
	 return ResponseEntity.ok(jobPostService.getByJobTitle(jobTitle));
}
 
 @GetMapping("/jobType")
 public ResponseEntity<List<JobPostDTO>>getByJobType(@RequestParam JobType jobType){
	 return ResponseEntity.ok(jobPostService.getByJobType(jobType));
}
 @GetMapping("companyName")
 public ResponseEntity<List<JobPostDTO>>getByCompanyName(@RequestParam String companyName){
	 return ResponseEntity.ok(jobPostService.getByCompanyName(companyName));
}
 @GetMapping("/internal/count")
 public ResponseEntity<Long>countJobPosts(){
	 return ResponseEntity.ok(jobPostRepository.count());
 }
 
}



