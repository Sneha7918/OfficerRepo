package com.cg.nsa.service;
import com.cg.nsa.entity.Scholarship;
import com.cg.nsa.entity.Student;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public interface IStudentService {

	Student findByStudentId(int studentId);
	Optional<Student>  getStudentById(String userId);
}
