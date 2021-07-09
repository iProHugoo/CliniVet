package com.hcoelho.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Data
public class Animal implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull(message = "Foto é obrigatória")
	private String foto;

	@NotNull(message = "Nome é obrigatório")
	private String nome;

	@NotNull(message = "Raça é obrigatória")
	private String raca;

	@NotNull(message = "Pelagem é obrigatória")
	private String pelagem;

	@NotNull(message = "Peso é obrigatório")
	private Integer peso;

	@NotNull(message = "Tipo é obrigatório")
	private Integer tipo;

	@NotNull(message = "Data de nascimento é obrigatória")
	@Pattern(regexp = "^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$", message = "Formato da data deve ser: AAAA-MM-DD")
	private String dataNascimento;

	@NotNull(message = "Data de cadastro é obrigatória")
	@Pattern(regexp = "^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$", message = "Formato da data deve ser: AAAA-MM-DD")
	private String dataCadastro;

	@NotNull(message = "Estado é obrigatório")
	private Integer estado;

	@JsonManagedReference
	@OneToMany(mappedBy = "animal")
	private List<Consulta> consultas = new ArrayList<>();

	@JsonManagedReference
	@OneToMany(mappedBy = "animal")
	private List<Exame> exames = new ArrayList<>();

}