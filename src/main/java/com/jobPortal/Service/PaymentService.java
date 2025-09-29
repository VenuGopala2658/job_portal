package com.jobPortal.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobPortal.DTO.PaymentDTO;
import com.jobPortal.Entity.Payment;
import com.jobPortal.Repository.PaymentRepository;

@Service
public class PaymentService {
	
    @Autowired
    private PaymentRepository paymentRepository;
    
   public PaymentDTO makePayment(PaymentDTO dto) {   
   Payment pay= new Payment();
   pay.setId(dto.id);
   pay.setUserId(dto.userId);
   pay.setPlanId(dto.planId);
   pay.setTransactionId(dto.transactionId);
   pay.setAmount(dto.amount);
   pay.setCurrency(dto.currency);
   pay.setPaymentStatus(dto.paymentStatus);
   pay.setPaymentType(dto.paymentType);
   pay.setPaymentDate(dto.paymentDate);
   
   Payment saved = paymentRepository.save(pay);
   dto.id=saved.getId();
   dto.paymentDate=saved.getPaymentDate();
   dto.paymentStatus=saved.getPaymentStatus();
   
   return dto;
  } 
   
   public List<PaymentDTO>getAllPayments(){
	   return paymentRepository.findAll().stream().map(p-> {
		   PaymentDTO dto = new PaymentDTO();
		   dto.id=p.getId();
		   dto.userId=p.getUserId();
		   dto.planId=p.getPlanId();
		   //dto.transactionId=p.getTransactionId();
		   dto.amount=p.getAmount();
		   dto.currency=p.getCurrency();
		   dto.paymentStatus=p.getPaymentStatus();
		   dto.paymentType=p.getPaymentType();
		   dto.paymentDate=p.getPaymentDate();
		   return dto; })
          .collect(Collectors.toList());
   }
}
