package com.example.SpringAngular.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringAngular.Repository.EmployeeRepository;
import com.example.SpringAngular.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private final EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	
	public Employee addEmployee( Employee employee) {
		
		employee.setEmployeeCode(UUID.randomUUID().toString());
		
		return employeeRepository.save(employee);
	}
	
	public List<Employee> findAllEmployees(){
		return employeeRepository.findAll();
		
	}
	
	public Employee updateEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}
	
	public void deleteEmployee(Long id) {
		
		employeeRepository.deleteById(id);
	}
	
	public Employee findEmployeeById(Long id) {
		return employeeRepository.findEmployeeById(id).orElseThrow(() -> new UserNotFoundException("User with id " + id + " doesn't Exist"));
	}

}
