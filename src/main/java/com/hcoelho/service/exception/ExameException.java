package com.hcoelho.service.exception;

public class ExameException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ExameException(Integer id) {
		super("ID de Exame " + id + " não foi encontrado");
	}

}