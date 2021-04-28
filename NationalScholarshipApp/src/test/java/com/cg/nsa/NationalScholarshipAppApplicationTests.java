package com.cg.nsa;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.cg.nsa.entity.Officer;
import com.cg.nsa.entity.Scholarship;
import com.cg.nsa.entity.Student;
import com.cg.nsa.exception.StateNotFoundException;
import com.cg.nsa.exception.IdNotFoundException;
import com.cg.nsa.exception.OfficerExistException;

import com.cg.nsa.service.IOfficerService;
import com.cg.nsa.service.IScholarshipService;
import com.cg.nsa.service.IStudentService;

/*********************************************************************
 * 
 * @author SNEHA V
 * Version: 1.0
 * Description: This is the Testing Class 
 * created date: 23-04-2021
 *
 *********************************************************************/

@SpringBootTest
class NationalScholarshipAppApplicationTests {

	@Autowired	
	IOfficerService iOfficerService;
	
	@Autowired	
	IScholarshipService iScholarshipService;
	
	@Autowired	
	IStudentService iStudentService;
	
	/*************************************************************
	 *
	 * Description:Test case to add details of officer
	 * 
	 **************************************************************/
	
	@Test
	void testOfficer() {
		Officer officer = new Officer("103","srinivasm","officer","Srinivas Murthy","Karnataka");
	 		
		assertEquals(officer,iOfficerService.addOfficer(officer));
		
	}
	
	/*************************************************************
	 *
	 * Description:Test case to edit details of officer
	 * 
	 **************************************************************/
	
	@Test
	void testOfficerExist() {
		Officer officer = new Officer("102","shaship","officer","Shashikala Pandit","Maharashtra");
	 		
		assertThrows(OfficerExistException.class,()->iOfficerService.addOfficer(officer));
		
	}
	
	/***************************************************************************
	 *
	 * Description:Test case to check exception while editing details of officer
	 * 
	 ***************************************************************************/
	
	@Test
	void testIdNotFound() {
		Officer officer = new Officer("414","Harish","officer","Harish Keni","Karnataka");
	 		
		assertThrows(IdNotFoundException.class,()->iOfficerService.editOfficer(officer,"414"));
		
	}

	
	/***************************************************************************
	 *
	 * Description:Test case to check state not found exception 
	 * 
	 ***************************************************************************/
	
	@Test
	void testStateNotFound() {
	 		
		assertThrows(StateNotFoundException.class,()->iOfficerService.getOfficerByState("Rajasthan"));
		
	}
	
	/***************************************************************************
	 *
	 * Description:Test case to grant approval for scholarship application
	 * 
	 ***************************************************************************/
	
	@Test
	void grantScholarshipApproved() {
		Scholarship scholarship= iScholarshipService.getById(1000).orElse(null);
		Student student= iStudentService.findByStudentId(166);
		assertEquals(scholarship,iOfficerService.grantApproval(scholarship, student));
		
	}
	
	/***************************************************************************
	 *
	 * Description:Test case to reject approval for scholarship application
	 * 
	 ***************************************************************************/
	
	@Test
	void grantScholarshipRejected() {
		Scholarship scholarship= iScholarshipService.getById(1000).orElse(null);
		Student student= iStudentService.findByStudentId(168);
		assertEquals(null,iOfficerService.grantApproval(scholarship, student));
		
	}
	

}
