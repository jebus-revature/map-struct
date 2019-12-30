package com.jebus.hibernate.update.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jebus.hibernate.update.dto.EmployeeDto;
import com.jebus.hibernate.update.entity.Employee;
import com.jebus.hibernate.update.mapper.EmployeeMapper;
import com.jebus.hibernate.update.repo.EmployeeRepositry;
import com.jebus.hibernate.update.service.EmployeeService;

@RestController
public class EntityController {

	@Autowired
	private EmployeeRepositry employeeRepo;

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private EmployeeMapper employeeMapper;
	
	@GetMapping(path = "/employees")
	public ResponseEntity<List<EmployeeDto>> getAllEmployee() {
		return ResponseEntity.ok(employeeRepo.findAll().stream().map(emp -> employeeMapper.employeeToEmployeeDTO(emp))
				.collect(Collectors.toList()));
	}

	@PutMapping(path = "/employee/mapper/jpa", consumes = "application/json")
	public ResponseEntity<List<EmployeeDto>> updateEmployeeJpa(@RequestBody EmployeeDto employeedto) {
		Employee employee = employeeMapper.employeeDTOtoEmployee(employeedto);
		employeeService.doUpdateEmployee(employee);
		return ResponseEntity.ok(employeeRepo.findAll().stream().map(emp -> employeeMapper.employeeToEmployeeDTO(emp))
				.collect(Collectors.toList()));
	}

}
