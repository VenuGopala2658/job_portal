package com.jobPortal.DTO;

public class StudentDTO {
	
	
	public Long id;
	public String name;
	public String email;
	public String phone;
	public String qualification;
	public String yearOfPassing;
	public String collegeName;
	public String universityName;
	public String resumeURL;

	
public StudentDTO(Long id,String name,String email,String phone,String qualification,String yearOfPassing, String collegeName, String universityName, String resumeURL) {
	this.id=id;
	this.name=name;
	this.email=email;
	this.phone= phone;
	this.qualification = qualification;
	this.yearOfPassing=yearOfPassing;
	this.collegeName=collegeName;
	this.universityName=universityName;
	this.resumeURL=resumeURL;
   }
}


