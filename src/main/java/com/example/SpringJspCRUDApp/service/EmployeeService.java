package com.example.SpringJspCRUDApp.service;

import java.util.List;

import com.example.SpringJspCRUDApp.model.Department;
import com.example.SpringJspCRUDApp.model.Employee;

public interface EmployeeService {

	public boolean addNewEmployee(Employee emp);

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(Long id);

	public boolean updateEmployee(Employee emp);

	public boolean deleteEmployee(Long id);

	public List<Department> getDepartments();
	
}
