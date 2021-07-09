package com.hcoelho.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcoelho.domain.Consulta;
import com.hcoelho.repository.ConsultaRepository;
import com.hcoelho.service.exception.ConsultaException;

@Service
public class ConsultaService {

	@Autowired
	ConsultaRepository repository;

	public List<Consulta> findAllConsultation() {
		return repository.findAll();
	}

	public Consulta newConsultation(Consulta consulta) {
		return repository.save(consulta);
	}

	public Consulta findConsultation(Integer id) {
		return repository.findById(id).orElseThrow(() -> new ConsultaException(id));
	}

	public Consulta editConsultation(Consulta consulta, Integer id) {
		consulta.setId(id);
		return repository.save(consulta);
	}

	public void deleteConsultation(Integer id) {
		repository.deleteById(id);
	}

}