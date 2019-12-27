package com.jebus.hibernate.update.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jebus.hibernate.update.entity.Employee;
import com.jebus.hibernate.update.repo.EmployeeRepositry;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepositry employeeRepo;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void doUpdateEmployee(Employee employee) {
		employeeRepo.save(employee);
	}
}
