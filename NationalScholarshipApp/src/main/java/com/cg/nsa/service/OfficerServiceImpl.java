package com.cg.nsa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.nsa.entity.Officer;
import com.cg.nsa.repository.IOfficerRepository;

@Service

public class OfficerServiceImpl implements IOfficerService{

@Autowired

IOfficerRepository officerDao;


@Override
	public Officer addOfficer(Officer officer) {
		return officerDao.save(officer);
	}


@Override
	public Officer editOfficer(Officer officer,String userId) {
	Officer officer1 = officerDao.getByUserId(userId);

	officer1.setPassword(officer.getPassword());
	officer1.setState(officer.getState());

	
		return officerDao.save(officer1);
	}


@Override
	public List<Officer> getOfficerByState(String state) {
		
		return  officerDao.getOfficerByState(state);
		
		
	}


@Override
	public List<Officer> getAllOfficers() {
		return officerDao.findAll();
	}





}