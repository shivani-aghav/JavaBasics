package com.techno.javabasics.exception;

public class InsufficientBalanceException extends RuntimeException {

	String msg;
	public InsufficientBalanceException(String msg) {
		this.msg=msg;
	}
	
	@Override
	public String getMessage() {
		
		return this.msg;
	}
}
