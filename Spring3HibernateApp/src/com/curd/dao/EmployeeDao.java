package com.curd.dao;

import java.util.List;

import com.curd.model.Employee;

/**
 * @author Bikash Behera
 *
 */
public interface EmployeeDao {
	
	public void addEmployee(Employee employee);

	public List<Employee> listEmployeess();
	
	public Employee getEmployee(int empid);
	
	public void deleteEmployee(Employee employee);
}
