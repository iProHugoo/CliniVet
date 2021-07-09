package com.hcoelho.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Data
public class Exame implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull(message = "Hemograma é obrigatório")
	private Boolean hemogramacompleto;
	
	@NotNull(message = "Colesterol é obrigatório")
	private Boolean colesterol;
	
	@NotNull(message = "Fósforo é obrigatório")
	private Boolean fosforo;
	
	@NotNull(message = "Cálcio é obrigatório")
	private Boolean calcio;
	
	@NotNull(message = "Glicosa é obrigatória")
	private Boolean glicose;
	
	@NotNull(message = "Magnésio é obrigatório")
	private Boolean magnesio;
	
	@NotNull(message = "Ureia é obrigatória")
	private Boolean ureia;
	
	@NotNull(message = "Potássio é obrigatório")
	private Boolean potassio;
	
	@NotNull(message = "Ultrassonografia é obrigatória")
	private String ultrassonografia;
	
	@NotNull(message = "Radriografia é obrigatória")
	private String radiografia;
	
	@NotNull(message = "Data é obrigatória")
	private String data;

	@JsonBackReference
	@ManyToOne
	private Animal animal;

}