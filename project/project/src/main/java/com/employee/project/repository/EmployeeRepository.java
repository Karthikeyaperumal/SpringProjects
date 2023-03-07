package com.employee.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.employee.project.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
