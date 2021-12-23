package com.example.SpringJspCRUDApp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringJspCRUDApp.dao.EmployeeDAO;
import com.example.SpringJspCRUDApp.model.Department;
import com.example.SpringJspCRUDApp.model.Employee;
import com.example.SpringJspCRUDApp.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO empDAO;

	@Override
	public boolean addNewEmployee(Employee emp) {
		return empDAO.addNewEmployee(emp);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return empDAO.getAllEmployees();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return empDAO.getEmployeeById(id);
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		return empDAO.updateEmployee(emp);
	}

	@Override
	public boolean deleteEmployee(Long id) {
		return empDAO.deleteEmployee(id);
	}

	@Override
	public List<Department> getDepartments() {
		return empDAO.getDepartments();
	}
	
}
