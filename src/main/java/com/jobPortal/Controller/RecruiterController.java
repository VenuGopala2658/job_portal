package com.jobPortal.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobPortal.DTO.RecruiterDTO;
import com.jobPortal.Repository.RecruiterRepository;
import com.jobPortal.Service.RecruiterService;

@RestController
@RequestMapping("/api/recruiters")                 //API building
public class RecruiterController {
 @Autowired
 private RecruiterService recruiterService;
 
 @Autowired 
 private RecruiterRepository recruiterRepository;
 
 @PostMapping("/register")
 public ResponseEntity <RecruiterDTO> register(@RequestBody RecruiterDTO dto) {
	 return ResponseEntity.ok(recruiterService.createRecruiter(dto));
 }
 @GetMapping("/email/{email}")
 public ResponseEntity<RecruiterDTO>getByEmail(@PathVariable String email){
	 return ResponseEntity.ok(recruiterService.getRecruiterByEmail(email));
 }
 @GetMapping("/id/{id}")
 public ResponseEntity<RecruiterDTO>getById(@PathVariable Long id){
	 return ResponseEntity.ok(recruiterService.getRecruiterById(id));
}
 @GetMapping("/internal/count")
 public ResponseEntity<Long>countRecruiters(){
	 return ResponseEntity.ok(recruiterRepository.count());
 }
 
 @PostMapping("/update")
 public ResponseEntity<RecruiterDTO>updateRecruiter(@RequestBody RecruiterDTO dto) {
 RecruiterDTO updated = recruiterService.updateRecruiter(dto);
 return ResponseEntity.ok(updated);
 }

}

