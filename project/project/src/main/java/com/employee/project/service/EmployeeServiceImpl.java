package com.employee.project.service;

import java.util.List;
import java.util.Optional;

import com.employee.project.model.Employee;
import com.employee.project.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	@Override
	public Employee insertEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployees(int id) {
		
		Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee = optional.get();
		return employee;
	}

	@Override
	public List<Employee> getEmployee() {
		
		return (List<Employee>)employeeRepository.findAll();
	}

	public void deleteEmployee(int id) {

		employeeRepository.deleteById(id);
	}

	@Override
	public boolean isEmployeeExist(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.existsById(id);
	}

}
