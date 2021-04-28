package com.cg.nsa.exception;

/*********************************************************************
* 
* @author SNEHA V
* Version: 1.0
* Description: This is the implementation class of IdNotFoundException
* created date: 22-04-2021
*
***********************************************************************/

public class IdNotFoundException extends  RuntimeException {


	/***********************************
	 * 
	 * This is a no-arg constructor 
	 * 
	 **********************************/
	
	public IdNotFoundException()
	{
		
	}
	
	/***************************************************************
	 * 
	 * @param message
	 * This is a parameterized constructor with field - message
	 * 
	 ***************************************************************/
    public IdNotFoundException(String msg)
    {
		super(msg);
	}
	
}
