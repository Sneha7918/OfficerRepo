package com.cg.nsa.exception;

public class StateNotFoundException extends RuntimeException {

	public StateNotFoundException() {
		
	}
	
    public StateNotFoundException(String msg) {
		super(msg);
	}
}
