package com.jobPortal.DTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.jobPortal.Enum.PaymentStatus;
import com.jobPortal.Enum.PaymentType;

public class PaymentDTO {

	public Long id;
	public Long userId;
	public Long planId;
	public String transactionId;
	public BigDecimal amount;
	public String currency;
	public PaymentStatus paymentStatus;
	public PaymentType paymentType;
	public LocalDateTime paymentDate;
   
   public PaymentDTO() {}	
   public PaymentDTO(Long id,Long userId,Long planId,String transactionId,BigDecimal amount,String currency,
		         PaymentStatus paymentStatus, PaymentType paymentType, LocalDateTime paymentDate) {
	  
	     this.id=id;
	     this.userId=userId;
	     this.planId=planId;
	     this.transactionId=transactionId;
	     this.amount=amount;
	     this.currency=currency;
	     this.paymentStatus=paymentStatus;
	     this.paymentType=paymentType;
	     this.paymentDate=paymentDate;
  }

}
