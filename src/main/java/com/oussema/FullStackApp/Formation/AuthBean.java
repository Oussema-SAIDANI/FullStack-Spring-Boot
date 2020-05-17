package com.oussema.FullStackApp.Formation;

public class AuthBean {

	private String message;

	public AuthBean(String message) {
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "AuthBean [message=" + message + "]";
	}

}
