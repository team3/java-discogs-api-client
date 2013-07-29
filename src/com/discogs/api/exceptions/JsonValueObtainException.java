package com.discogs.api.exceptions;

@SuppressWarnings("serial")
public class JsonValueObtainException extends Exception {
	public JsonValueObtainException(String s) {
		super(s);
	}
	
	public JsonValueObtainException(Throwable t) {
		super(t);
	}
}
