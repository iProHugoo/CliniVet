package com.hcoelho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcoelho.domain.Consulta;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Integer> {

}