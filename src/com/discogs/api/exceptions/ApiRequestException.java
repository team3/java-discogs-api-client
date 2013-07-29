package com.discogs.api.exceptions;

public class ApiRequestException extends Exception {
	
	public ApiRequestException(String s) {
		super(s);
	}
	
	public ApiRequestException(Throwable t) {
		super(t);
	}
}
