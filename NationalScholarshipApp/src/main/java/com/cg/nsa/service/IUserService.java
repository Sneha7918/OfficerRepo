package com.cg.nsa.service;

import org.springframework.stereotype.Service;
import com.cg.nsa.entity.User;

/*********************************************************************
 * 
 * @author SNEHA V
 * Version 1.0
 * Description this is a user service interface
 * created date 22-04-2021
 *
 *********************************************************************/
@Service
public interface IUserService {

	User login(User user);
	
	User logout(User user);
}
