package com.jobPortal.DTO;

import com.jobPortal.Enum.Status;

public class UpdateApplicationStatusDTO {
   public Long applicationId;
   public Status applicationStatus;
   
   public UpdateApplicationStatusDTO() {}
   public UpdateApplicationStatusDTO(Long applicationId, Status applicationStatus) {
	   this.applicationId=applicationId;
	   this.applicationStatus=applicationStatus;
   }
   
   public Long getApplicationId() {
	return applicationId;
   }
   public void setApplicationId(Long applicationId) {
	this.applicationId = applicationId;
   }
   public Status getApplicationStatus() {
	return applicationStatus;
   }
   public void setApplicationStatus(Status applicationStatus) {
	this.applicationStatus = applicationStatus;
   }
   
}
