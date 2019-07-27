package com.javainuse.service;

import org.springframework.stereotype.Service;

import com.javainuse.exceptionhandling.ResourceNotFoundException;
import com.javainuse.model.Employee;

@Service
public class EmployeeService {

	public Employee getEmployee() throws EmployeeServiceException {
		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		return emp;
	}

	public Employee getEmployeeNull() throws ResourceNotFoundException {

		throw new ResourceNotFoundException("Resource Not Found");
	}

	public Employee getEmployeeException() throws EmployeeServiceException {

		throw new EmployeeServiceException();
	}

}
