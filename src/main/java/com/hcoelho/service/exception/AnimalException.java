package com.hcoelho.service.exception;

public class AnimalException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AnimalException(Integer id) {
		super("ID de Animal " + id + " não foi encontrado");
	}

}