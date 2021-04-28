package com.cg.nsa.exception;

import java.util.ArrayList;
import java.util.List;

/*********************************************************************
 * 
 * @author SNEHA V
 * Version: 1.0
 * Description: This is the implementation class of ValidationException
 * created date: 22-04-2021
 *
 *********************************************************************/

public class ValidationException  extends RuntimeException{

	List<String> messages=new ArrayList<>();

	/***********************************
	 * 
	 * This is a no-arg constructor 
	 * 
	 **********************************/
	
	public ValidationException()
	{
		
	}
	
	/***************************************************************
	 * 
	 * @param message
	 * This is a parameterized constructor with field - message
	 * 
	 ***************************************************************/
	
	public ValidationException(List<String> messages) 
	{
		super();
		this.messages = messages;

	}
	
	/***************************************************************
	* getMessages method
	* @return List of messages
	****************************************************************/

	public List<String> getMessages() 
	{
		return messages;
	}
}
