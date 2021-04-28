package com.cg.nsa.service;

import com.cg.nsa.entity.*;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.cg.nsa.repository.IScholarshipRepository;

/*********************************************************************
 * 
 * @author SNEHA V
 * Version 1.0
 * Description this is a scholarship service implementation class
 * created date 22-04-2021
 *
 *********************************************************************/

@Service
public class ScholarshipServiceImpl implements IScholarshipService {
	
	@Autowired
	IScholarshipRepository iScholarshipRepository;
	
	/****************************************************
	 * Description Get Scholarship from scholarshipId
	 * @param scholarshipId
	 * @return Scholarship object
	 ****************************************************/
	
	@Override
	public Optional<Scholarship> getById(int scholarshipId) {
		
		return iScholarshipRepository.findById(scholarshipId);
	}
	
	/****************************************************
	 * Description Get All Scholarships
	 * @return List of scholarships
	 ****************************************************/
	
	@Override
	public List<Scholarship> getAllScholarships() {
		
		return iScholarshipRepository.findAll();
	}

	
		
	
}