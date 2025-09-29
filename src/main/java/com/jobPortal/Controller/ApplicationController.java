package com.jobPortal.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jobPortal.DTO.ApplicationDTO;
import com.jobPortal.Enum.Status;
import com.jobPortal.Repository.ApplicationRepository;
import com.jobPortal.Service.ApplicationService;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

	@Autowired
	private ApplicationService applicationService;
	
	@Autowired
	private ApplicationRepository applicationRepository;

	@PostMapping("/apply")
	public ResponseEntity<ApplicationDTO>apply(@RequestBody ApplicationDTO dto){
		return ResponseEntity.ok(applicationService.apply(dto));
	}
	
	@GetMapping("/student/{studentId}")
	public ResponseEntity<List<ApplicationDTO>>getApplicationByStudentId(@PathVariable Long studentId){
	 return ResponseEntity.ok(applicationService.getApplicationByStudentId(studentId));
 	}
	
	@GetMapping("/job/{jobId}")
	public ResponseEntity<List<ApplicationDTO>>getApplicationByJobId(@PathVariable Long jobId){
		 return ResponseEntity.ok(applicationService.getApplicationByJobId(jobId));
	 }
	
	@PostMapping("/id/{id}/status")
	public void updateStatus(@PathVariable Long id, @RequestParam Status status){
		 applicationService.updateStatus(id,status);
	 }
	
	@GetMapping("/internal/count")
	 public ResponseEntity<Long>countApplications(){
		 return ResponseEntity.ok(applicationRepository.count());
	 }
}

