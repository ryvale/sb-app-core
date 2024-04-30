package com.exa.app.sbcore.uservice;

public class ServiceResponse<T> {
	private final String message;
	
	private final T finalResponse;
	
	private final String details;
	
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

	public T getFinalResponse() {
		return finalResponse;
	}

	public String getDetails() {
		return details;
	}

}
