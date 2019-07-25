package com.app.employee.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.app.employee.employee.model.Employee;
import com.app.employee.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepository;
	
	public void saveEmployee(Employee emp) {
		empRepository.save(emp);
	}
	
	public List<Employee> getAllEmployee() {
		List<Employee> emp = new ArrayList<>();
		empRepository.findAll().forEach(e -> emp.add(e));
		return emp;
	}
	
	public Employee getEmployeeByID1(Long empid) {
		Employee emp = empRepository.findById(empid).orElse(null);
		return emp;
	}
	
	public Employee updateEmployee1(Long empid, Employee empDetails) {
		Employee emp = empRepository.findById(empid).orElse(null);
		
		if(emp == null) 
		  { 
		  return null;
		  }
		  
		  emp.setName(empDetails.getName());
		  emp.setDesignation(empDetails.getDesignation());
		  emp.setExpertise(empDetails.getExpertise()); 
		  Employee updateEmployee = empRepository.save(emp);
		
		
		return updateEmployee;
	}
	
	public void deleteEmployee1(Long empid) {
		Employee emp = empRepository.findById(empid).orElse(null);
		if(emp==null) 
		  { 
		  System.out.println("Not Found"); 
		  } 
		
		empRepository.delete(emp);
	}
}
