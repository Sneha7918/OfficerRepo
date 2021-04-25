package com.cg.nsa.service;

import java.util.Optional;
import com.cg.nsa.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.nsa.entity.*;
import com.cg.nsa.repository.IStudentRepository;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	IStudentRepository studentDao;
	
	@Override
	
	public Optional<Student> getStudentById(String userId){
		return studentDao.findById(userId);
		
	}
	

@Override

public Student findByStudentId(int studentId){
	return studentDao.findByStudentId(studentId);
	
}

}

