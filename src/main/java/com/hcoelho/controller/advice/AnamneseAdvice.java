package com.hcoelho.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.hcoelho.service.exception.AnamneseException;

@ControllerAdvice
public class AnamneseAdvice {

	@ResponseBody
	@ExceptionHandler(AnamneseException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String AnamneseNotFound(AnamneseException ex) {
		return ex.getMessage();
	}

}