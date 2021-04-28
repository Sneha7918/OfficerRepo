package com.cg.nsa.service;

import java.util.List;
import java.util.Optional;
import com.cg.nsa.entity.Scholarship;
import org.springframework.stereotype.Service;

/*********************************************************************
 * 
 * @author SNEHA V
 * Version 1.0
 * Description this is a scholarship service interface
 * created date 22-04-2021
 *
 *********************************************************************/

@Service
public interface IScholarshipService {
	
	Optional <Scholarship > getById(int scholarship);
	List<Scholarship> getAllScholarships();
}
