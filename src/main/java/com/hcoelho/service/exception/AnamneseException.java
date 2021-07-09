package com.hcoelho.service.exception;

public class AnamneseException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AnamneseException(Integer id) {
		super("ID de Anamnese " + id + " não foi encontrado");
	}

}