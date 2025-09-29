package com.jobPortal.DTO;

import java.util.Date;

import com.jobPortal.Enum.Status;

public class ApplicationDTO {
  
	public Long id;
	public Long studentId;
	public Long jobId;
	public String studentEmail;
	public String recruiterEmail;
	public String resumeURL;
	public Status status;
	public Date appliedDate;
	
	public ApplicationDTO(Long id, Long studentId, Long jobId, String studentEmail, String recruiterEmail, String resumeURL, Status status, Date appliedDate) {
		   this.id = id;
		   this.studentId = studentId;
		   this.jobId = jobId;
		   this.studentEmail=studentEmail;
		   this.recruiterEmail=recruiterEmail;
		   this.resumeURL = resumeURL;
		   this.status = status;
		   this.appliedDate = appliedDate;
	   }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getRecruiterEmail() {
		return recruiterEmail;
	}

	public void setRecruiterEmail(String recruiterEmail) {
		this.recruiterEmail = recruiterEmail;
	}

	public String getResumeURL() {
		return resumeURL;
	}

	public void setResumeURL(String resumeURL) {
		this.resumeURL = resumeURL;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getAppliedDate() {
		return appliedDate;
	}

	public void setAppliedDate(Date appliedDate) {
		this.appliedDate = appliedDate;
	}
	
}


