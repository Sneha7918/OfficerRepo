package com.cg.nsa.service;

import java.util.Optional;
import com.cg.nsa.entity.Student;
import org.springframework.stereotype.Service;

/*********************************************************************
 * 
 * @author SNEHA V
 * Version 1.0
 * Description this is a student service interface
 * created date 22-04-2021
 *
 *********************************************************************/
@Service
public interface IStudentService {

	Student findByStudentId(int studentId);
	Optional<Student>  getStudentById(String userId);
}
