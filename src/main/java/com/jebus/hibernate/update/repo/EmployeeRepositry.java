package com.jebus.hibernate.update.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jebus.hibernate.update.entity.Employee;

@Repository
public interface EmployeeRepositry extends JpaRepository<Employee, Long> {

}
