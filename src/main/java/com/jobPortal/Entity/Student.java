package com.jobPortal.Entity;

import javax.persistence.*;


@Entity
@Table(name="students")

public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;  
	private String email;
	private String phone;
	private String qualification;  
	private String yearOfPassing;
	private String collegeName;
	private String universityName;
	private String resumeURL;
	
	public Student() {}
	
	public Student(Long id,String name,String email,String phone,String qualification,String yearOfPassing, String collegeName, String universityName, String resumeURL) {
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	

	public String getYearOfPassing() {
		return yearOfPassing;
	}

	public void setYearOfPassing(String yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getResumeURL() {
		return resumeURL;
	}

	public void setResumeURL(String resumeURL) {
		this.resumeURL = resumeURL;
	}
	
	

}


