package com.hcoelho.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.hcoelho.service.exception.DoencaException;

import java.sql.SQLIntegrityConstraintViolationException;

@ControllerAdvice
public class DoencaAdvice {

	@ResponseBody
	@ExceptionHandler(DoencaException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	String DiseaseNotFound(DoencaException ex) {
		return ex.getMessage();
	}

	@ResponseBody
	@ExceptionHandler(SQLIntegrityConstraintViolationException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String DiseaseInAnamnese() {
		return "Esta doença já está incluida numa Anamnese";
	}

}