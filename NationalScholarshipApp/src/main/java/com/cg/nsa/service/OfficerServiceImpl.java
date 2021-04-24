package com.cg.nsa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.nsa.entity.Officer;
import com.cg.nsa.exception.IdNotFoundException;
import com.cg.nsa.exception.OfficerExistException;
import com.cg.nsa.exception.StateNotFoundException;
import com.cg.nsa.repository.IOfficerRepository;

@Service

/*********************************************************************
 * 
 * @author SNEHA V
 * Version 1.0
 * Description this is a controller class
 * created date 22-04-2021
 *
 *********************************************************************/

public class OfficerServiceImpl implements IOfficerService{

@Autowired

IOfficerRepository officerDao;

/*********************************************************************
 * 
 * @param officer
 * @return a message whether adding of officer was successful or not
 * 
 *********************************************************************/

@Override
	public Officer addOfficer(Officer officer) {
	
	if(officerDao.existsById(officer.getUserId())) {
		throw new OfficerExistException("This Officer exists ! ");
	}
	
	else {
        return officerDao.save(officer);
	}
}


/*********************************************************************
 * 
 * @param officer,userId
 * @return message if officer details were edited or not
 * 
 *********************************************************************/

@Override
	public Officer editOfficer(Officer officer,String userId) {
	
	     if(officerDao.existsById(userId)) {
	    	 
	    	   Officer officer1 = officerDao.getByUserId(userId);	    	   
	    	   
	           officer1.setPassword(officer.getPassword());
	          
	           officer1.setState(officer.getState());
	
	           return officerDao.save(officer1);
	
	     }     
	      
	     else {	    	 
     	       throw new IdNotFoundException();
	     }
			
	}



/*********************************************************************
 * 
 * @param state
 * @return List of Officers in that state
 * 
 *********************************************************************/

@Override
	public List<Officer> getOfficerByState(String state) {
		
	 if(officerDao.existsOfficerByState(state)) {	 
		 return  officerDao.getOfficerByState(state);
	 }		
	
	else {		
		 throw new StateNotFoundException();

	}
		 
	}

/*********************************************************************
 * 
 * 
 * @return List of all Officers
 * 
 *******************************************************************/

@Override
	public List<Officer> getAllOfficers() {
		return officerDao.findAll();
	}

}