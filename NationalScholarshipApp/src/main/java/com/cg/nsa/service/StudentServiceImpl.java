package com.cg.nsa.service;

import java.util.Optional;
import com.cg.nsa.entity.*;
import org.springframework.stereotype.Service;
import com.cg.nsa.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

/*********************************************************************
 * 
 * @author SNEHA V
 * Version 1.0
 * Description this is a student service implementation class
 * created date 22-04-2021
 *
 *********************************************************************/

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	IStudentRepository iStudentRepository;
	
	@Override
	
	public Optional<Student> getStudentById(String userId){
		return iStudentRepository.findById(userId);
		
	}
	
	@Override
    public Student findByStudentId(int studentId){
	     return iStudentRepository.findByStudentId(studentId);
	
}

}

