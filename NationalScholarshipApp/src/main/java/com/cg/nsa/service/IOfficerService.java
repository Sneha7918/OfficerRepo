package com.cg.nsa.service;

import java.util.List;

import com.cg.nsa.entity.Institution;
import com.cg.nsa.entity.Officer;
import com.cg.nsa.entity.Student;
import com.cg.nsa.entity.Scholarship;
import org.springframework.stereotype.Service;

/*********************************************************************
 * 
 * @author SNEHA V
 * Version: 1.0
 * Description: This is the service layer's IOfficerService interface
 * created date: 22-04-2021
 *
 *********************************************************************/

@Service
public interface IOfficerService {
	
	public Officer addOfficer(Officer officer);
	
	public Officer editOfficer(Officer officer,String userId);
	
	public List<Officer> getOfficerByState(String state);
	
	public List<Officer> getAllOfficers();

	Scholarship grantApproval(Scholarship scholarship, Student student);
	
	Institution statusUpdate(int code, String status);


}
