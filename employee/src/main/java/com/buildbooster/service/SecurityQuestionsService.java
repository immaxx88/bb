package com.buildbooster.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buildbooster.model.SecurityQuestions;
import com.buildbooster.repository.SecurityQuestionsRepository;

@Service
public class SecurityQuestionsService {
	
	@Autowired
	SecurityQuestionsRepository securityQuestionsRepository;
	
	public void saveQuestions(SecurityQuestions securityQuestions) 
	{
		securityQuestionsRepository.save(securityQuestions);
	}
	
	public List<SecurityQuestions> getAllQuestions(){
		List<SecurityQuestions> securityQuestions = new ArrayList<>();
		securityQuestionsRepository.findAll().forEach(e -> securityQuestions.add(e));
		return securityQuestions;
	}

}
