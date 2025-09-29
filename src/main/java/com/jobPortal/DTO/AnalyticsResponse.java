package com.jobPortal.DTO;

public class AnalyticsResponse {

	public Long totalStudents;
	public Long totalRecruiters;
    public Long totalJobPosts;
    public Long totalApplications;
    public Long totalAuth;
    public Long totalAdmins;
    public Long totalEmails;
    public Long totalFileUpload;
    public Long totalSubscriptionPlan;
    public Long totalPayment;
    public Long totalPaidSubscription;
    public Long totalUserPaymentStatus;
    
    public AnalyticsResponse() {}

    public AnalyticsResponse(Long totalStudents,Long totalRecruiters,Long totalJobPosts,Long totalApplications, 
    		Long totalAuth,Long totalAdmins,Long totalEmails,Long totalFileUpload,Long totalSubscriptionPlan,
    		Long totalPayment,Long totalPaidSubscription,Long totalUserPaymentStatus) {
    	
      this.totalStudents = totalStudents;
      this.totalRecruiters = totalRecruiters;
      this.totalJobPosts = totalJobPosts;
      this.totalApplications = totalApplications;
      this.totalAuth = totalAuth;
      this.totalAdmins = totalAdmins;
      this.totalEmails = totalEmails;
      this.totalFileUpload = totalFileUpload;
      this.totalSubscriptionPlan=totalSubscriptionPlan;
      this.totalPayment=totalPayment;
      this.totalPaidSubscription=totalPaidSubscription;
      this.totalUserPaymentStatus=totalUserPaymentStatus;
    }
}

