package com.hcoelho.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcoelho.domain.Exame;
import com.hcoelho.repository.ExameRepository;
import com.hcoelho.service.exception.ExameException;

@Service
public class ExameService {

	@Autowired
	ExameRepository repository;

	public List<Exame> findAllExams() {
		return repository.findAll();
	}

	public Exame newExam(Exame exame) {
		return repository.save(exame);
	}

	public Exame findExam(Integer id) {
		return repository.findById(id).orElseThrow(() -> new ExameException(id));
	}

	public Exame editExam(Exame exame, Integer id) {
		exame.setId(id);
		return repository.save(exame);
	}

	public void deleteExam(Integer id) {
		repository.deleteById(id);
	}

}