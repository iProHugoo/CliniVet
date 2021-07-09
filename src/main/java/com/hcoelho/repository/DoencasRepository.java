package com.hcoelho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcoelho.domain.Doencas;

@Repository
public interface DoencasRepository extends JpaRepository<Doencas, Integer> {

}