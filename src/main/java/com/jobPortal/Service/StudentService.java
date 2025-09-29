package com.jobPortal.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobPortal.DTO.StudentDTO;
import com.jobPortal.Entity.Student;
import com.jobPortal.Repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	public StudentDTO createOrUpdateStudent(StudentDTO dto) {
		
		Student student = new Student(
				dto.id,dto.name,dto.email,dto.phone,dto.qualification,dto.yearOfPassing, dto.collegeName,dto.universityName,dto.resumeURL);
			
		Student saved = (Student)studentRepository.save(student);
		return mapToDTO(saved);
	}

	public StudentDTO getStudentByEmail(String email) {
		Student student = studentRepository.findByEmail(email).orElseThrow(()-> new RuntimeException("Student not found"));
		 return mapToDTO(student);
		
	}
	public StudentDTO getStudentById(Long id) {
		Student student = studentRepository.findById(id).orElseThrow(()-> new RuntimeException("Student not found"));
		 return mapToDTO(student);
	}
	

	private StudentDTO mapToDTO(Student student) {
		return  new StudentDTO(
				student.getId(),
				student.getName(),
				student.getEmail(),
				student.getPhone(),
				student.getQualification(),
				student.getYearOfPassing(),
				student.getCollegeName(),
				student.getUniversityName(),
				student.getResumeURL());
				
		
	}
}


