package com.jobPortal.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobPortal.DTO.RecruiterDTO;
import com.jobPortal.Entity.Recruiter;
import com.jobPortal.Repository.RecruiterRepository;
@Service
public class RecruiterService {
@Autowired
private RecruiterRepository recruiterRepository;

  public RecruiterDTO createRecruiter(RecruiterDTO dto) {
	  
  Recruiter recruiter = new Recruiter(dto.id, dto.name, dto.email, dto.phone, dto.companyName, dto.companyDescription, dto.companyWebsite);
  recruiter= recruiterRepository.save(recruiter);
  //dto.setId(recruiter.getId());
  return new RecruiterDTO(
		  recruiter.getId(),
		  recruiter.getName(),
		  recruiter.getEmail(),
		  recruiter.getPhone(),
		  recruiter.getCompanyName(),
		  recruiter.getCompanyDescription(),
		  recruiter.getCompanyWebsite());
  }
   
  public RecruiterDTO getRecruiterByEmail(String email) {
	  Recruiter recruiter = recruiterRepository.findByEmail(email);
	  if(recruiter == null) return null;
	  return new RecruiterDTO(
			  recruiter.getId(),
			  recruiter.getName(),
			  recruiter.getEmail(),
			  recruiter.getPhone(),
			  recruiter.getCompanyName(),
			  recruiter.getCompanyDescription(),
			  recruiter.getCompanyWebsite());
  
  } 
  
  public RecruiterDTO getRecruiterById(Long id) {
	    Optional<Recruiter> recruiterOptional = recruiterRepository.findById(id);
	    if (!recruiterOptional.isPresent()) return null;
	    Recruiter recruiter = recruiterOptional.get();
	    return new RecruiterDTO(
	            recruiter.getId(),
	            recruiter.getName(),
	            recruiter.getEmail(),
	            recruiter.getPhone(),
	            recruiter.getCompanyName(),
	            recruiter.getCompanyDescription(),
	            recruiter.getCompanyWebsite());
	}
  
  public RecruiterDTO updateRecruiter(RecruiterDTO dto) {
	  if (dto.getId() == null) {
	  throw new IllegalArgumentException("Recruiter id must be provided for update");
	  }

	  Recruiter existing = recruiterRepository.findById(dto.getId())
	  .orElseThrow(() -> new RuntimeException("Recruiter not found with id: " + dto.getId()));

	  // Apply updates from DTO
	  existing.setName(dto.getName());
	  existing.setEmail(dto.getEmail());
	  existing.setCompanyName(dto.getCompanyName());
	  existing.setPhone(dto.getPhone());
	  existing.setCompanyDescription(dto.getCompanyDescription());
	  existing.setCompanyWebsite(dto.getCompanyWebsite());

	  Recruiter saved = recruiterRepository.save(existing);
	  return mapToDTO(saved);
	  }

	  // mapToDTO method (reuse your existing mapper logic)
	  private RecruiterDTO mapToDTO(Recruiter recruiter) {
	  return new RecruiterDTO(
	  recruiter.getId(),
	  recruiter.getName(),
	  recruiter.getEmail(),
	  recruiter.getCompanyName(),
	  recruiter.getPhone(),
	  recruiter.getCompanyDescription(),
	  recruiter.getCompanyWebsite()
	  );
	}
  
 }



 