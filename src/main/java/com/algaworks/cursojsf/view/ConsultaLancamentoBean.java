package com.algaworks.cursojsf.view;

import lombok.Data;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@Data
public class ConsultaLancamentoBean {
	private List<String> lancamentos = new ArrayList<>();

	@PostConstruct
	public void inicializar() {
		for (int i = 0; i < 20; i++) {
			lancamentos.add("");
		}
	}
}
