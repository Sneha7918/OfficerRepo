package com.cg.nsa.exception;

import java.util.ArrayList;
import java.util.List;

/***
 * 
 * @author SNEHA V
 * Version 1.0
 * Description this is a controller class
 * created date 22-04-2021
 *
 */
public class ValidationException  extends RuntimeException{

	List<String> messages=new ArrayList<String>();

	public ValidationException()
	{
		
	}
	public ValidationException(List<String> messages) 
	{
		super();
		this.messages = messages;
//		System.out.println("inside list param constructor");
//		System.out.println("messages : "+messages);
	}

	public List<String> getMessages() 
	{
		return messages;
	}
}
