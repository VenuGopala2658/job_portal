package com.jobPortal.DTO;

public class CreateApplicationDTO {

	public Long jobId;
	public String studentEmail;
	public String recruiterEmail;
	public String resumeURL;
	
	public CreateApplicationDTO() {}
	public CreateApplicationDTO(Long jobId, String studentEmail, String recruiterEmail, String resumeURL) {
		
		this.jobId=jobId;
		this.studentEmail=studentEmail;
		this.recruiterEmail=recruiterEmail;
		this.resumeURL=resumeURL;
	}
}
