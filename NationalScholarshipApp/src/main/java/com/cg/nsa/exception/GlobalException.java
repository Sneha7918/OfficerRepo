package com.cg.nsa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<Object> handleException(IdNotFoundException exception)
	{
		return new ResponseEntity<Object>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(StateNotFoundException.class)
	public ResponseEntity<Object> handleException(StateNotFoundException exception)
	{
		return new ResponseEntity<Object>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ValidationException.class)
	public ResponseEntity<Object> handleException(ValidationException exception){
		return new  ResponseEntity<Object> (exception.getMessages(),HttpStatus.BAD_REQUEST);
	}
	
}
