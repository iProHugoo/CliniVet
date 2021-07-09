package com.hcoelho.service.exception;

public class DoencaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DoencaException(Integer id) {
		super("ID de Doença " + id + " não foi encontrado");
	}

}