package com.jebus.hibernate.update.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jebus.hibernate.update.repo.EmployeeRepositry;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepositry employeeRepo;

	@Override
	public EmployeeRepositry getRepository() {
		return employeeRepo;
	}

}
