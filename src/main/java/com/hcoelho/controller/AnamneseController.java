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

import com.hcoelho.domain.Anamnese;
import com.hcoelho.service.AnamneseService;

@RestController
@RequestMapping("/anamnese")
public class AnamneseController {

	@Autowired
	AnamneseService service;

	// Lista Todas Anamneses
	@GetMapping
	public List<Anamnese> listaTodasAnamneses() {
		return service.findAllAnamneses();
	}

	// Cria uma Nova Anamnese
	@PostMapping
	public Anamnese criaNovaAnamnese(@Valid @RequestBody Anamnese anamnese) {
		return service.newAnamnese(anamnese);
	}

	// Busca uma Anamnese por ID
	@GetMapping("/{id}")
	public Anamnese buscaUmaAnamnese(@PathVariable Integer id) {
		return service.findAnamnese(id);
	}

	// Edita uma Anamnese por ID
	@PutMapping("/{id}")
	public Anamnese atualizaAnamnese(@Valid @RequestBody Anamnese anamnese, @PathVariable Integer id) {
		return service.editAnamnese(anamnese, id);
	}

	// Apaga uma Anamnese por ID
	@DeleteMapping("/{id}")
	void excluiAnamnese(@PathVariable Integer id) {
		service.deleteAnamnese(id);
	}

}