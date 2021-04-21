package com.cg.nsa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.nsa.entity.Officer;
import com.cg.nsa.service.IOfficerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("Officer Controller")
@RestController
@RequestMapping(value = "/officer")

public class OfficerController {

@Autowired
	IOfficerService officerService;

@ApiOperation(value="add new Officer")

@PostMapping(value = "/addOfficer")
	public ResponseEntity<String> addOfficer(@RequestBody Officer officer) {
		officerService.addOfficer(officer);
		return new ResponseEntity<>("Added Officer successfully", HttpStatus.OK);
	}




@PutMapping(value = "/updateOfficer/{userId}")
	public ResponseEntity<String> editOfficer(@RequestBody Officer officer,@PathVariable String userId) {
		officerService.editOfficer(officer,userId);
		return new ResponseEntity<>("Updated officer successfully", HttpStatus.OK);
	}


@GetMapping(value = "/getOfficerByState/{state}")
	public List<Officer> getOfficerByState(@PathVariable String state) {
		
		return officerService.getOfficerByState(state);
	}


@ApiOperation(value="get all Officers")

@GetMapping(value = "/getAll")
	public List<Officer> getAllOfficers() {
		return officerService.getAllOfficers();
	}
	
}
