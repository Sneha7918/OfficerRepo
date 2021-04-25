package com.cg.nsa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.nsa.entity.Scholarship;

@Service
public interface IScholarshipService {

	
	Optional <Scholarship > getById(int scholarship);
	List<Scholarship> getAllScholarships();
}
