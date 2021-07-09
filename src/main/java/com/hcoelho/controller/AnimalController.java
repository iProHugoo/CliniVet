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

import com.hcoelho.domain.Animal;
import com.hcoelho.service.AnimalService;

@RestController
@RequestMapping("/animal")
public class AnimalController {

	@Autowired
	AnimalService service;

	// Lista Todos Animais
	@GetMapping
	public List<Animal> listaTodosAnimais() {
		return service.findAllAnimals();
	}

	// Cria um Novo Animal
	@PostMapping
	public Animal criaNovoAnimal(@Valid @RequestBody Animal animal) {
		return service.newAnimal(animal);
	}

	// Busca um Animal por ID
	@GetMapping("/{id}")
	public Animal buscaUmAnimal(@PathVariable Integer id) {
		return service.findAnimal(id);
	}

	// Edita um Animal por ID
	@PutMapping("/{id}")
	public Animal atualizaAnimal(@RequestBody Animal animal, @PathVariable Integer id) {
		return service.editAnimal(animal, id);
	}

	// Apaga um Animal por ID
	@DeleteMapping("/{id}")
	void excluiAnimal(@PathVariable Integer id) {
		service.deleteAnimal(id);
	}

}