package com.algaworks.cursojsf.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
public class Pessoa implements Serializable {
	private Integer codigo;
	private String nome;

	public Pessoa() {
	}

	public Pessoa(Integer codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
}
