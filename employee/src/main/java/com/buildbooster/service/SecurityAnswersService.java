package com.buildbooster.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buildbooster.model.SecurityAnswers;
import com.buildbooster.repository.SecurityAnswersRepository;

@Service
public class SecurityAnswersService{
	
	@Autowired
	SecurityAnswersRepository securityAnswersRepository;
	
	public SecurityAnswers saveAnswer(SecurityAnswers securityAnswer) {
		securityAnswersRepository.save(securityAnswer);
		return securityAnswer; 
	}
	
	public List<SecurityAnswers> getAllAnswers(){
		List<SecurityAnswers> securityAnswers = new ArrayList<>(); 
		securityAnswersRepository.findAll().forEach(e -> securityAnswers.add(e));
		return securityAnswers; 
	}
	
	
	
	

}
