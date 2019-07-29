package com.buildbooster.controller;

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

import com.buildbooster.model.SecurityAnswers;
import com.buildbooster.model.SecurityQuestions;
import com.buildbooster.model.Store;
import com.buildbooster.service.SecurityAnswersService;
import com.buildbooster.service.SecurityQuestionsService;
import com.buildbooster.service.StoreService;


@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	StoreService storeService;
	@Autowired
	SecurityQuestionsService securityQuestionsService;
	@Autowired
	SecurityAnswersService securityAnswersService;

	//***********************Create Store***********************
	//Create Store
	@PostMapping("/store")
	public Store createStore(@Valid @RequestBody Store store) {
		storeService.saveStore(store);
		return store;
	}
	
	//***********************Get All Stores***********************
	//Get Store
	@GetMapping("/store")
	public List<Store> getStore()
	{
		List<Store> store = storeService.getAllStore();
		return store;
	}
	
	//***********************Create Questions***********************
	@PostMapping("/question")
	public SecurityQuestions createQuestion(@RequestBody SecurityQuestions secQues)
	{
		securityQuestionsService.saveQuestions(secQues);
		return secQues;
		
	}
	
	//***********************Get All Questions***********************
	@GetMapping("/question")
	public List<SecurityQuestions> getQuestions(){
		List<SecurityQuestions> secQues = securityQuestionsService.getAllQuestions();
		return secQues;
	}
	
	//*************************Post a Answer*****************************
	@PostMapping("/answers")
	public SecurityAnswers createAnswers(@RequestBody SecurityAnswers secAns)
	{
		securityAnswersService.saveAnswer(secAns);
		return secAns;
	}
	
	//************************Get all Answer********************************
	@GetMapping("/answers")
	public List<SecurityAnswers> getAllAnswers()
	{
		List<SecurityAnswers> securityAnswer = securityAnswersService.getAllAnswers();
		return securityAnswer;
	}
	
	
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
