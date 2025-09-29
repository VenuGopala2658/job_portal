package com.jobPortal.DTO;

public class EmailRequest{

	public String to;
	public String subject;
	public String body;
	
	public EmailRequest() {}
	public EmailRequest(String to, String subject, String body) {
	
		this.to = to;
	    this.subject = subject;
	    this.body = body;
	}
	
}
