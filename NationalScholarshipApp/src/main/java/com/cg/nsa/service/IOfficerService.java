package com.cg.nsa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.nsa.entity.Officer;


@Service
public interface IOfficerService {
	
	public Officer addOfficer(Officer officer);
	
	public Officer editOfficer(Officer officer,String userId);
	
	public List<Officer> getOfficerByState(String state);
	
	public List<Officer> getAllOfficers();

	//public Officer getByuserId(int pId);
}
