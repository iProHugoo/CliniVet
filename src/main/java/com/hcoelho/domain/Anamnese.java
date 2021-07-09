package com.hcoelho.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
public class Anamnese implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull(message = "problemaSistemaDigestivo não pode ser nulo")
	private String problemaSistemaDigestivo; 
	
	@NotNull(message = "problemaSistemaUroGenital não pode ser nulo")
	private String problemaSistemaUroGenital;
	
	@NotNull(message = "problemaSistemaCardioRespiratorio não pode ser nulo")
	private String problemaSistemaCardioRespiratorio; 
	
	@NotNull(message = "problemaSistemaLocomotor não pode ser nulo")
	private String problemaSistemaLocomotor;
	
	@NotNull(message = "problemaPele não pode ser nulo")
	private String problemaPele;
	
	@NotNull(message = "problemaOlhos não pode ser nulo")
	private String problemaOlhos;
	
	@NotNull(message = "problemaOuvido não pode ser nulo")
	private String problemaOuvido; 

	@ManyToMany
	@Size(min = 0, max = 5, message = "Limite de até 5 doenças por Anamnese")
	private List<Doencas> doencas = new ArrayList<>();

}
