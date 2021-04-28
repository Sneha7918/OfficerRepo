package com.cg.nsa.exception;

/*********************************************************************
 * 
 * @author SNEHA V
 * Version: 1.0
 * Description: This is the implementation class of StateNotFoundException
 * created date: 22-04-2021
 *
 *********************************************************************/

public class StateNotFoundException extends RuntimeException {

	/***********************************
	 * 
	 * This is a no-arg constructor 
	 * 
	 **********************************/
	
	public StateNotFoundException() {
		
	}
	
	/***************************************************************
	 * 
	 * @param message
	 * This is a parameterized constructor with field - message
	 * 
	 ***************************************************************/
	
    public StateNotFoundException(String msg) {
		super(msg);
	}
}
