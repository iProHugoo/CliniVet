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

import com.hcoelho.domain.Exame;
import com.hcoelho.service.ExameService;

@RestController
@RequestMapping("/exame")
public class ExameController {

	@Autowired
	ExameService service;

	// Lista Todos Exames
	@GetMapping
	public List<Exame> listaTodosExames() {
		return service.findAllExams();
	}

	// Cria um Novo Exame
	@PostMapping
	public Exame criaNovoExame(@Valid @RequestBody Exame exame) {
		return service.newExam(exame);
	}

	// Busca um Exame por ID
	@GetMapping("/{id}")
	public Exame buscaUmExame(@PathVariable Integer id) {
		return service.findExam(id);
	}

	// Edita um Exame por ID
	@PutMapping("/{id}")
	public Exame atualizaExame(@Valid @RequestBody Exame exame, @PathVariable Integer id) {
		return service.editExam(exame, id);
	}

	// Apaga um Exame por ID
	@DeleteMapping("/{id}")
	void excluiExame(@PathVariable Integer id) {
		service.deleteExam(id);
	}

}