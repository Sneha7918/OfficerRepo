package com.cg.nsa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.nsa.entity.Officer;

@Service
/*********************************************************************
 * 
 * @author SNEHA V
 * Version 1.0
 * Description this is a controller class
 * created date 22-04-2021
 *
 *********************************************************************/

public interface IOfficerService {
	
	public Officer addOfficer(Officer officer);
	
	public Officer editOfficer(Officer officer,String userId);
	
	public List<Officer> getOfficerByState(String state);
	
	public List<Officer> getAllOfficers();


}
