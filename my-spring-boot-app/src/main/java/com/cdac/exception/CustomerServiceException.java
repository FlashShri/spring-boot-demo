package com.cdac.exception;

public class CustomerServiceException extends Exception {
	private String msg;

	public CustomerServiceException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
	
}
