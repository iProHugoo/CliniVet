package com.hcoelho.service.exception;

public class ConsultaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ConsultaException(Integer id) {
		super("ID de Consulta " + id + " não encontrado");
	}

}