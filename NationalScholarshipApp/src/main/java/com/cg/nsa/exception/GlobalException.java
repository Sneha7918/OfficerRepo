package com.cg.nsa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**********************************************************************
 * 
 * @author SNEHA V
 * Version: 1.0
 * Description: This is a Global Exception class
 * created date: 22-04-2021
 *
 **********************************************************************/

@RestControllerAdvice
public class GlobalException {

	/**************************************************************************************
	 * 
	 * IdNotFoundException
	 * @param exception
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * 
	 **************************************************************************************/
	
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<Object> handleException(IdNotFoundException exception)
	{
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	
	/*****************************************************************************************
	 * 
	 * StateNotFoundException
	 * @param exception
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * 
	 ****************************************************************************************/
	
	@ExceptionHandler(StateNotFoundException.class)
	public ResponseEntity<Object> handleException(StateNotFoundException exception)
	{
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	
	/*****************************************************************************************
	 * 
	 * ValidationException
	 * @param exception
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * 
	 ****************************************************************************************/
	
	@ExceptionHandler(ValidationException.class)
	public ResponseEntity<Object> handleException(ValidationException exception){
		return new  ResponseEntity<> (exception.getMessages(),HttpStatus.BAD_REQUEST);
	}
	
	
	/*****************************************************************************************
	 * 
	 * OfficerExistException
	 * @param exception
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * 
	 ****************************************************************************************/
	
	@ExceptionHandler(OfficerExistException.class)
	public ResponseEntity<Object> handleException(OfficerExistException exception)
	{
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	
	/*****************************************************************************************
	 * 
	 * InvalidInstitutionException
	 * @param exception
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * 
	 ****************************************************************************************/
	
	@ExceptionHandler(InvalidInstitutionException.class)
	public ResponseEntity<Object> handleException(InvalidInstitutionException exception)
	{
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	

}
