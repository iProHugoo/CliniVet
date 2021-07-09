package com.hcoelho.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcoelho.domain.Doencas;
import com.hcoelho.repository.DoencasRepository;
import com.hcoelho.service.exception.DoencaException;

@Service
public class DoencasService {

	@Autowired
	DoencasRepository repository;

	public List<Doencas> findAllDiseases() {
		return repository.findAll();
	}

	public Doencas newDisease(Doencas doencas) {
		return repository.save(doencas);
	}

	public Doencas findDisease(Integer id) {
		return repository.findById(id).orElseThrow(() -> new DoencaException(id));
	}

	public Doencas editDisease(Doencas doencas, Integer id) {
		doencas.setId(id);
		return repository.save(doencas);
	}

	public void deleteDisease(Integer id) {
		repository.deleteById(id);
	}

}