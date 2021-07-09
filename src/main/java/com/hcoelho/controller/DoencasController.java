package com.hcoelho.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcoelho.domain.Doencas;
import com.hcoelho.service.DoencasService;

@RestController
@RequestMapping("/doencas")
public class DoencasController {

	@Autowired
	DoencasService service;

	// Lista Todas Doenças
	@CrossOrigin
	@GetMapping
	public List<Doencas> listaTodasDoencas() {
		return service.findAllDiseases();
	}

	// Cria uma Nova Doença
	@CrossOrigin
	@PostMapping
	public Doencas criaNovaDoenca(@Valid @RequestBody Doencas doencas) {
		return service.newDisease(doencas);
	}

	// Busca uma Doença por ID
	@CrossOrigin
	@GetMapping("/{id}")
	public Doencas buscaUmaDoenca(@PathVariable Integer id) {
		return service.findDisease(id);
	}

	// Edita uma Doença por ID
	@CrossOrigin
	@PutMapping("/{id}")
	public Doencas atualizaDoenca(@Valid @RequestBody Doencas doencas, @PathVariable Integer id) {
		return service.editDisease(doencas, id);
	}

	// Apaga uma Doença por ID
	@CrossOrigin
	@DeleteMapping("/{id}")
	void excluiDoenca(@PathVariable Integer id) {
		service.deleteDisease(id);
	}

}