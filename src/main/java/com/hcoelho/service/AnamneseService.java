package com.hcoelho.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcoelho.domain.Anamnese;
import com.hcoelho.repository.AnamneseRepository;
import com.hcoelho.service.exception.AnamneseException;

@Service
public class AnamneseService {

	@Autowired
	AnamneseRepository repository;

	public List<Anamnese> findAllAnamneses() {
		return repository.findAll();
	}

	public Anamnese newAnamnese(Anamnese anamnese) {
		return repository.save(anamnese);
	}

	public Anamnese findAnamnese(Integer id) {
		return repository.findById(id).orElseThrow(() -> new AnamneseException(id));
	}

	public Anamnese editAnamnese(Anamnese anamnese, Integer id) {
		anamnese.setId(id);

		return repository.save(anamnese);
	}

	public void deleteAnamnese(Integer id) {
		repository.deleteById(id);
	}

}