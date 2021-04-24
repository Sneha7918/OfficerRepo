package com.cg.nsa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.cg.nsa.entity.Officer;
import com.cg.nsa.entity.User;
import com.cg.nsa.exception.ValidationException;
import com.cg.nsa.service.IOfficerService;

/*********************************************************************
 * 
 * @author SNEHA V
 * Version 1.0
 * Description this is Testing module 
 * created date 23-04-2021
 *
 *********************************************************************/

@SpringBootTest
class NationalScholarshipAppApplicationTests {

	@Autowired
	
	IOfficerService service;
	
//	@Test
//	void testInstitution() {
//		Officer officer = new Officer("141","deepu","officer","Deepali verma","Goa");
//	 		
//		assertEquals(officer,service.addOfficer(officer));
//		
//	}
	
	@Test
	void testInstitution1() {
		Officer officer = new Officer("","","","","");
	 		
		assertThrows(ValidationException.class,()->service.addOfficer(officer));
		
	}

}
