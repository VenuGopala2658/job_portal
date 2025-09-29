package com.jobPortal.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobPortal.DTO.ApplicationDTO;
import com.jobPortal.Entity.Application;
import com.jobPortal.Enum.Status;
import com.jobPortal.Repository.ApplicationRepository;

@Service
public class ApplicationService {
@Autowired
  private ApplicationRepository applicationRepository;
 
  public ApplicationDTO apply(ApplicationDTO dto) {
	  
	  Application appln = new Application();
	  appln.setId(dto.id);
	  appln.setStudentId(dto.studentId);
	  appln.setJobId(dto.jobId);
	  appln.setStudentEmail(dto.studentEmail);
	  appln.setRecruiterEmail(dto.recruiterEmail);
	  appln.setResumeURL(dto.resumeURL);
	  appln.setStatus(dto.status);
	  appln.setAppliedDate(dto.appliedDate);
	  
	  Application saved = applicationRepository.save(appln);
	  return new ApplicationDTO(saved.getId(), 
			  saved.getStudentId(), 
			  saved.getJobId(), 
			  saved.getStudentEmail(),
			  saved.getRecruiterEmail(),
			  saved.getResumeURL(), 
			  saved.getStatus(),
			  saved.getAppliedDate());
	  
  } 
  
  
  public List<ApplicationDTO>getApplicationByStudentId(Long studentId){
	  return applicationRepository.findByStudentId(studentId).stream().map(appln -> new ApplicationDTO(
			  appln.getId(), appln.getStudentId(), appln.getJobId(), 
			  appln.getStudentEmail(), appln.getRecruiterEmail(), appln.getResumeURL(), 
			   appln.getStatus(),appln.getAppliedDate())
			  ).collect(Collectors.toList());
  }
  
  public List<ApplicationDTO>getApplicationByJobId(Long jobId){
	  return applicationRepository.findByJobId(jobId).stream().map(appln -> new ApplicationDTO(
			  appln.getId(), appln.getStudentId(), appln.getJobId(), appln.getStudentEmail(), appln.getRecruiterEmail(),
			  appln.getResumeURL(), appln.getStatus(),appln.getAppliedDate())
			  ).collect(Collectors.toList());  
  }
  
  
  public void updateStatus(Long id, Status status) {
	   Application appln = applicationRepository.findById(id).orElseThrow(()-> new RuntimeException("Application not found"));
	  appln.setStatus(status);
	  applicationRepository.save(appln);
  }
}

