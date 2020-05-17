package com.oussema.FullStackApp.Test;

public class BeanClass {

	private String message;

	public BeanClass(String message) {
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
		return "BeanClass [message=" + message + "]";
	}
	
	

}
