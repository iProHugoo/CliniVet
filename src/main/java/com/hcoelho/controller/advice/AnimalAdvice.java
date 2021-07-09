package com.hcoelho.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.hcoelho.service.exception.AnimalException;

@ControllerAdvice
public class AnimalAdvice {

	@ResponseBody
	@ExceptionHandler(AnimalException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String AnimalNotFound(AnimalException ex) {
		return ex.getMessage();
	}

}