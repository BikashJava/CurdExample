package com.curd.service;

import java.util.List;

import com.curd.model.Employee;

/**
 * @author Bikash Behera
 *
 */
public interface EmployeeService {
	
	public void addEmployee(Employee employee);

	public List<Employee> listEmployeess();
	
	public Employee getEmployee(int empid);
	
	public void deleteEmployee(Employee employee);
}
