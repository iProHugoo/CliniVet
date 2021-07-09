package com.hcoelho.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.hcoelho.service.exception.ConsultaException;

@ControllerAdvice
public class ConsultaAdvice {

	@ResponseBody
	@ExceptionHandler(ConsultaException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String ConsultationNotFound(ConsultaException ex) {
		return ex.getMessage();
	}

}