package com.employee.project.service;

import java.util.List;

import com.employee.project.model.Employee;

public interface EmployeeService {

	public abstract Employee insertEmployee(Employee employee);
	
	public abstract void updateEmployee(Employee employee);
	
	public abstract Employee getEmployees(int id);
	
	public abstract List<Employee> getEmployee();
	
	public abstract void deleteEmployee(int id);
	
	public abstract boolean isEmployeeExist(int id);





}
