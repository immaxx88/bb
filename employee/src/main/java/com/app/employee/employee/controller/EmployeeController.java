package com.app.employee.employee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.app.employee.employee.model.Employee;
import com.app.employee.employee.model.Store;
//import com.app.employee.employee.service.EmployeeService;
import com.app.employee.employee.service.StoreService;


@RestController
@RequestMapping("/buildbooster")
public class EmployeeController {
	//@Autowired
	//EmployeeService employeeService;
	
	@Autowired
	StoreService storeService;
	
//	@Autowired
	
	
	
	//Create Store
	@PostMapping("store")
	public Store createStore(@Valid @RequestBody Store store) {
		storeService.saveStore(store);
		return store;
	}
	
	//Create Employee
//	@PostMapping("/employees")
//	public Employee createEmployee(@Valid @RequestBody Employee emp) {
//		employeeService.saveEmployee(emp);
//		return emp; 
//	}
	
	//Get Store
	@GetMapping("store")
	public List<Store> getStore()
	{
		List<Store> store = storeService.getAllStore();
		return store;
	}
	
	//Get Employee
//	  @GetMapping("/employees") 
//	  public List<Employee> getAllEmployee()
//	  { 
//		   List<Employee> emp = employeeService.getAllEmployee(); 
//		  return emp ;
//	  }
	
	
	  
	  //Get Employee By ID
//	  @GetMapping("employees/{id}") 
//	  public ResponseEntity<Employee> getEmployeeByID(@PathVariable(value="id") Long empid) 
//	  { 
//	  Employee emp = employeeService.getEmployeeByID1(empid);
//	  if(emp == null) 
//	  { 
//	  return ResponseEntity.notFound().build(); 
//	  }
//	  
//	  return ResponseEntity.ok().body(emp); 
//	  }
	  
	  //update an employee by empid
	  
//	  @PutMapping("/employees/{id}") 
//	  public ResponseEntity<Employee> updateEmployee(@PathVariable(value="id") Long empid,@Valid @RequestBody Employee empDetails)
//	  {
//	  Employee updatedEmployee = employeeService.updateEmployee1(empid,empDetails); 
//	  
//	  
//	  return ResponseEntity.ok().body(updatedEmployee); 
//	  }
	  
//	  @DeleteMapping("/employees/{id}") 
//	  public void deleteEmployee(@PathVariable(value="id") Long empid)
//	  { 
//	  //Employee emp = 
//		 employeeService.deleteEmployee1(empid);	   
//	  
//	  
//	  //return ResponseEntity.ok().build(); 
//	  }
	 
}
