package com.exa.app.sbcore.uservice;

import org.slf4j.Logger;

import lombok.Getter;

public class ServiceResponse<T> {
	
	public final static ServiceResponse<Boolean> SR_TRUE = new ServiceResponse<>(Boolean.TRUE);
	
	public final static ServiceResponse<Boolean> SR_FALSE = new ServiceResponse<>(Boolean.FALSE);
	
	@Getter
	private final String message;
	
	@Getter
	private final T finalResponse;
	
	@Getter
	private final String details;
	

	public static <T>ServiceResponse<T>  messageFrom(ServiceResponse<?> sr) {
		return new ServiceResponse<T>(null, sr.getMessage(), sr.getDetails());
	}
	
	public static <T>ServiceResponse<T>  messageFrom(String message, String details) {
		return new ServiceResponse<T>(null, message, details);
	}
	
	public static <T>ServiceResponse<T>  messageFrom(String message) {
		return messageFrom(message, null);
	}

	
	public static <T>ServiceResponse<T> srLogMessage(String errMessage, String errDetails, String logMessage, Logger log,  Object ...params) {
		log.warn(String.format(logMessage, params));
		
		return ServiceResponse.messageFrom(errMessage, errDetails);
	}
	
	public static <T>ServiceResponse<T> srLogMessage(String errMessage, String logMessage, Logger log,  Object ...params) {
		return srLogMessage(errMessage, null, logMessage, log, params);
	}
	
	public static <T>ServiceResponse<T> srLogHeaderMessage(String errMessage, String errDetails, String header, String logMessage, Logger log,  Object ...params) {
		return srLogMessage(errMessage, errDetails, header + ":" +logMessage, log, params);
	}
	
	public static <T>ServiceResponse<T> srLogHeaderMessage(String errMessage, String header, String logMessage, Logger log,  Object ...params) {
		return srLogMessage(errMessage, null, header + ":" +logMessage, log, params);
	}
	
	
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
}
