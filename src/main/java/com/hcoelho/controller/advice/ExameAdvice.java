package com.hcoelho.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.hcoelho.service.exception.ExameException;

@ControllerAdvice
public class ExameAdvice {

	@ResponseBody
	@ExceptionHandler(ExameException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String DiseaseNotFound(ExameException ex) {
		return ex.getMessage();
	}
}