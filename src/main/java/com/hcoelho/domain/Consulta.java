package com.hcoelho.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Data
public class Consulta implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@NotNull(message = "ID do Animal é obrigatório")
	private Integer id;
	
	@NotNull(message = "Data é obrigatória")
	@Pattern(regexp= "^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$", message = "Formato da data deve ser: AAAA-MM-DD")
	private String data;
	
	@NotNull(message = "Observações é obrigatório")
	private String observacoes;
	
	@NotNull(message = "Queixa é obrigatória")
	private String queixaprincipal;
	
	@NotNull(message = "Histórico é obrigatório")
	private String historicorecente;

	@JsonBackReference
	@ManyToOne
	private Animal animal;

	@OneToOne
	private Anamnese anamnese;

}