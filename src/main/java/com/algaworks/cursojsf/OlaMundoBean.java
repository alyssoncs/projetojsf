package com.algaworks.cursojsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OlaMundoBean {
	private String nome;
	private String nomeMaiusculo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void clicouNoBotao() {
		setNomeMaiusculo(nome.toUpperCase());
	}

	public String getNomeMaiusculo() {
		return nomeMaiusculo;
	}

	public void setNomeMaiusculo(String nomeMaiusculo) {
		this.nomeMaiusculo = nomeMaiusculo;
	}
}
