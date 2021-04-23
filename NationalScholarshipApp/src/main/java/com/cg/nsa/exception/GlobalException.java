package com.cg.nsa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

/*********************************************************************
 * 
 * @author SNEHA V
 * Version 1.0
 * Description this is a controller class
 * created date 22-04-2021
 *
 *********************************************************************
 */
public class GlobalException {

	/*
	 * IdNotFoundException
	 */
	
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<Object> handleException(IdNotFoundException exception)
	{
		return new ResponseEntity<Object>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	/*
	 * StateNotFoundException
	 */
	
	@ExceptionHandler(StateNotFoundException.class)
	public ResponseEntity<Object> handleException(StateNotFoundException exception)
	{
		return new ResponseEntity<Object>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	/*
	 * ValidationException
	 */
	
	@ExceptionHandler(ValidationException.class)
	public ResponseEntity<Object> handleException(ValidationException exception){
		return new  ResponseEntity<Object> (exception.getMessages(),HttpStatus.BAD_REQUEST);
	}
	
	/*
	 * OfficerExistException
	 */
	
	@ExceptionHandler(OfficerExistException.class)
	public ResponseEntity<Object> handleException(OfficerExistException exception)
	{
		return new ResponseEntity<Object>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
	
}
