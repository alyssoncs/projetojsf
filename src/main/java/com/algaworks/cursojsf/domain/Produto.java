package com.algaworks.cursojsf.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Produto implements Serializable {
	private String nome;
	private String categoria;
	private String fabricante;
}
