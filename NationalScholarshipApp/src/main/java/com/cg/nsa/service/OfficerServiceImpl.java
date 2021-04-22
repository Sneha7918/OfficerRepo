package com.cg.nsa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.nsa.entity.Officer;
import com.cg.nsa.exception.IdNotFoundException;
import com.cg.nsa.exception.StateNotFoundException;
import com.cg.nsa.repository.IOfficerRepository;

@Service

/***
 * 
 * @author SNEHA
 *
 */

public class OfficerServiceImpl implements IOfficerService{

@Autowired

IOfficerRepository officerDao;

/**
 * @param officer
 * @return
 */
@Override
	public Officer addOfficer(Officer officer) {
		return officerDao.save(officer);
	}


@Override
	public Officer editOfficer(Officer officer,String userId) {
	
	     if(officerDao.existsById(userId)) {
	    	 
	    	   Officer officer1 = officerDao.getByUserId(userId);

	           officer1.setPassword(officer.getPassword());
	           officer1.setState(officer.getState());
	
	           return officerDao.save(officer1);
	
	     }     
	      
	     else {
	    	 
     	       throw new IdNotFoundException("Invalid userId!");
	     }
			
	}


@Override
	public List<Officer> getOfficerByState(String state) {
		
	 if(officerDao.existsOfficerByState(state)) {
		 
		 return  officerDao.getOfficerByState(state);
	 }
		
	
	else {
		
		 throw new StateNotFoundException("No Officer in this state.");

	}
		 
	}


@Override
	public List<Officer> getAllOfficers() {
		return officerDao.findAll();
	}

}