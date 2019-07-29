package com.buildbooster.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buildbooster.model.SecurityQuestions;

public interface SecurityQuestionsRepository extends JpaRepository< SecurityQuestions, Long >{

}
