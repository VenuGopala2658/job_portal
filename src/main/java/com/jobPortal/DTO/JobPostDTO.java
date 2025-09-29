package com.jobPortal.DTO;

import java.util.Date;

import com.jobPortal.Enum.JobType;

public class JobPostDTO {

	public Long id;
	public String jobTitle;
	public String jobDescription;
	public String jobLocation;
	public JobType jobType;
	public String companyName;
	public String postedByEmail;
	public Date postedDate;
	
	public JobPostDTO() {}
	 public JobPostDTO(Long id, String jobTitle, String jobDescription,String jobLocation, JobType jobType, String companyName, String postedByEmail, Date postedDate) {
		 this.id = id;
		 this.jobTitle = jobTitle;
		 this.jobDescription = jobDescription;
		 this.jobLocation = jobLocation;
		 this.jobType= jobType;
		 this.companyName = companyName;
		 this.postedByEmail = postedByEmail;
		 this.postedDate = postedDate;
	 }
	
}

