package com.july.exception;

public class BusinessException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public BusinessException(Object Obj) {
		super(Obj.toString());
	}
	
}
