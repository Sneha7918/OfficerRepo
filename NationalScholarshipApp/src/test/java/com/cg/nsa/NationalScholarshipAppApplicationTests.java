package com.cg.nsa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.nsa.entity.Officer;
import com.cg.nsa.entity.User;
import com.cg.nsa.service.IOfficerService;

@SpringBootTest
class NationalScholarshipAppApplicationTests {

	@Autowired
	
	IOfficerService officerservice;
	
	@Test
	void testInstitution() {
		//User user= new User("234","peeyu","officer");
		//Officer officer = new Officer("234","peeyu","officer","payal shah","Kerala");
	 		
	
		//officerservice.addOfficer(officer, "234");
	
		
	}

}
