package com.hcoelho.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcoelho.domain.Animal;
import com.hcoelho.repository.AnimalRepository;
import com.hcoelho.service.exception.AnimalException;

@Service
public class AnimalService {

	@Autowired
	AnimalRepository repository;

	public List<Animal> findAllAnimals() {
		return repository.findAll();
	}

	public Animal newAnimal(Animal animal) {
		return repository.save(animal);
	}

	public Animal findAnimal(Integer id) {
		return repository.findById(id).orElseThrow(() -> new AnimalException(id));
	}

	public Animal editAnimal(Animal animal, Integer id) {
		animal.setId(id);
		return repository.save(animal);
	}

	public void deleteAnimal(Integer id) {
		repository.deleteById(id);
	}

}