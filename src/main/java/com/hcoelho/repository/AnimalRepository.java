package com.hcoelho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcoelho.domain.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}