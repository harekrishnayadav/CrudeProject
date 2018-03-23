package com.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

public class EmployeeDao {
	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee save(Employee emp) {
		return employeeRepository.save(emp);

	}

	public List<Employee> findAll() {
		return employeeRepository.findAll();

	}

	public Employee findOne(long empid) {
		return employeeRepository.findOne(empid);

	}

}
