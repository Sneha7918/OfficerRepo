package com.cg.nsa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.nsa.entity.Officer;

@Repository
public interface IOfficerRepository extends JpaRepository<Officer, String> 
{
	List<Officer> getOfficerByState(String state);
	
	Officer getByUserId(String userId);

	boolean existsOfficerByState(String state);
	
	//Officer saveOfficer(Officer officer);
	
	//Officer updateOfficer(Officer officer);
	
	//Officer fetchOfficerByState(String state);
	
	//List<Officer> fetchAllOfficers();
}
