package com.jobPortal.Service;

import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobPortal.DTO.PaidSubscriptionDTO;
import com.jobPortal.Entity.PaidSubscription;
import com.jobPortal.Repository.PaidSubscriptionRepository;
import com.jobPortal.Security.InvoiceGenerator;

@Service
public class PaidSubscriptionService {

	@Autowired
	private PaidSubscriptionRepository paidSubscriptionRepository;
	
	
	
	public PaidSubscriptionDTO createSubscription(PaidSubscriptionDTO dto) {
		PaidSubscription sub = new PaidSubscription();
		
		sub.setId(dto.id);
		sub.setStudentId(dto.studentId);
		sub.setRecruiterId(dto.recruiterId);
		sub.setPlanId(dto.planId);
		sub.setUserEmail(dto.userEmail);
		sub.setPaymentStatus(dto.paymentStatus);
		sub.setStartDate(dto.startDate);
		sub.setEndDate(dto.endDate);
		sub.setInvoiceUrl(dto.invoiceUrl);
		
		PaidSubscription saved = paidSubscriptionRepository.save(sub);
		
		return mapToDTO(saved);
		
		
	}
	
	public List<PaidSubscriptionDTO>getSubscriptionByUserEmail(String userEmail){
		
		return paidSubscriptionRepository.findByUserEmail(userEmail).stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	public List<PaidSubscriptionDTO>getSubscriptionByStudentId(Long studentId){
		return paidSubscriptionRepository.findByStudentId(studentId).stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	public List<PaidSubscriptionDTO>getSubscriptionByRecruiterId(Long recruiterId){
		return paidSubscriptionRepository.findByRecruiterId(recruiterId).stream().map(this::mapToDTO).collect(Collectors.toList());
		
	}
	public List<PaidSubscriptionDTO>getAll(){
		return paidSubscriptionRepository.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	
	public ByteArrayInputStream generateInvoice(Long id) {
		
		PaidSubscription subscription = paidSubscriptionRepository.findById(id).orElseThrow(()-> new RuntimeException("Subscription not found"));
		return InvoiceGenerator.generateInvoice(subscription);
	}
	private PaidSubscriptionDTO mapToDTO(PaidSubscription sub ){
		PaidSubscriptionDTO dto = new PaidSubscriptionDTO();
	       dto.setId(sub.getId());
	       dto.setStudentId(sub.getStudentId());
	       dto.setRecruiterId(sub.getRecruiterId());
	       dto.setPlanId(sub.getPlanId());
	       dto.setUserEmail(sub.getUserEmail());
	       dto.setPaymentStatus(sub.getPaymentStatus());
	       dto.setInvoiceUrl(sub.getInvoiceUrl());
	       dto.setStartDate(sub.getStartDate());
	       dto.setEndDate(sub.getEndDate());
		
		return dto;
	}	

}

