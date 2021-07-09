package com.hcoelho.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcoelho.domain.Consulta;
import com.hcoelho.service.ConsultaService;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {

	@Autowired
	ConsultaService service;

	// Lista Todas Consultas
	@GetMapping
	public List<Consulta> listaTodasConsultas() {
		return service.findAllConsultation();
	}

	// Cria uma Nova Consulta
	@PostMapping
	public Consulta criaNovaConsulta(@Valid @RequestBody Consulta consulta) {
		return service.newConsultation(consulta);
	}

	// Busca uma Consulta por ID
	@GetMapping("/{id}")
	public Consulta buscaUmaConsulta(@PathVariable Integer id) {
		return service.findConsultation(id);
	}

	// Edita uma Consulta por ID
	@PutMapping("/{id}")
	public Consulta atualizaConsulta(@Valid @RequestBody Consulta consulta, @PathVariable Integer id) {
		return service.editConsultation(consulta, id);
	}

	// Apaga uma Consulta por ID
	@DeleteMapping("/{id}")
	void excluiConsulta(@PathVariable Integer id) {
		service.deleteConsultation(id);
	}

}