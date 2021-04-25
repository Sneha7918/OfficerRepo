package com.cg.nsa.service;
import com.cg.nsa.entity.*;
import com.cg.nsa.repository.IScholarshipRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScholarshipServiceImpl implements IScholarshipService {
	
	@Autowired
	IScholarshipRepository scholarshipRepository;
	
	/**
	 * Description Get Scholarship from scholarshipId
	 * @param scholarshipId
	 * @return Scholarship object
	 */
	
	@Override
	public Optional<Scholarship> getById(int scholarshipId) {
		
		return scholarshipRepository.findById(scholarshipId);
	}
	
	@Override
	public List<Scholarship> getAllScholarships() {
		
		return scholarshipRepository.findAll();
	}

	
		
	
}