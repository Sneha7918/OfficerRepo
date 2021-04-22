package com.cg.nsa.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.nsa.entity.Officer;
import com.cg.nsa.exception.ValidationException;
import com.cg.nsa.service.IOfficerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("Officer Controller")
@RestController
@RequestMapping(value = "/officer")

/***
 * 
 * @author SNEHA V
 * Version 1.0
 * Description this is a controller class
 * created date 22-04-2021
 *
 */

public class OfficerController {

@Autowired

IOfficerService officerService;

@ApiOperation(value="add new Officer")

/***
 * 
 * @param officer
 * @return a message whether adding of officer was successful or not
 */

@PostMapping(value = "/addOfficer")
	public ResponseEntity<String> addOfficer(@Valid @RequestBody Officer officer,BindingResult bindingResult) throws MethodArgumentNotValidException {
		
	String error="";   //stores all errors
	
	if(bindingResult.hasErrors())
	{
		System.out.println("yes it has some errors");
		List<FieldError> errors=bindingResult.getFieldErrors();
		System.out.println("errors "+errors);
		
		List<String> errorList=new ArrayList<String>();
		
		for(FieldError err:errors)
		{
			errorList.add(err.getDefaultMessage());
		}
		throw new ValidationException(errorList);
	}
	
	
	officerService.addOfficer(officer);
		return new ResponseEntity<>("Added Officer successfully", HttpStatus.OK);
	}

/***
 * 
 * @param officer,userId
 * @return message if officer details were edited or not
 */

@PutMapping(value = "/updateOfficer/{userId}")
	public ResponseEntity<String> editOfficer(@RequestBody Officer officer,@PathVariable String userId) {
		officerService.editOfficer(officer,userId);
		return new ResponseEntity<>("Updated officer successfully", HttpStatus.OK);
	}


/***
 * 
 * @param state
 * @return List of Officers in that state
 */

@GetMapping(value = "/getOfficerByState/{state}")
	public List<Officer> getOfficerByState(@PathVariable String state) {
		
		return officerService.getOfficerByState(state);
	}

/***
 * 
 * @return List of all Officers
 */

@ApiOperation(value="get all Officers")

@GetMapping(value = "/getAll")
	public List<Officer> getAllOfficers() {
		return officerService.getAllOfficers();
	}
	
}
