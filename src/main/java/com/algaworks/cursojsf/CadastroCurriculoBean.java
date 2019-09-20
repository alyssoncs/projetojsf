package com.algaworks.cursojsf;

import lombok.Data;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
@Data
public class CadastroCurriculoBean {
	private String vaga = "A0382D";
	private String cargo = "Programador Java Senior";
}
