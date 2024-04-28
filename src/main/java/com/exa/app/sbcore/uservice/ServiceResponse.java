package com.exa.app.sbcore.uservice;

public class ServiceResponse<T> {
	private String message;
	
	private T finalResponse;
	
	private String details;
	
	public ServiceResponse(T finalResponse, String message, String details) {
		super();
		this.message = message;
		this.finalResponse = finalResponse;
		this.details = details;
	}
	
	public ServiceResponse(T finalResponse, String message) {
		this(finalResponse, message, null);
	}
	
	public ServiceResponse(T finalResponse) {
		this(finalResponse, null);
	}
	
	public ServiceResponse(String message) {
		this(null, message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getFinalResponse() {
		return finalResponse;
	}

	public void setFinalResponse(T finalResponse) {
		this.finalResponse = finalResponse;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	

}
