package com.cg.nsa.exception;

public class IdNotFoundException extends  RuntimeException {

	public IdNotFoundException()
	{
		
	}
	
    public IdNotFoundException(String msg)
    {
		super(msg);
	}
	
}