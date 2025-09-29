package com.jobPortal.DTO;

public class AuthResponse {
	
	private String token;
	private String message; 
	
	public AuthResponse(String token, String message) {
		this.token = token;
		this.message=message;
	}
	
	public AuthResponse() {
    }

    // Getter for token
    public String getToken() {
        return token;
    }

    // Setter for token
    public void setToken(String token) {
        this.token = token;
    }

    // Getter for message
    public String getMessage() {
        return message;
    }

    // Setter for message
    public void setMessage(String message) {
        this.message = message;
    }

}
