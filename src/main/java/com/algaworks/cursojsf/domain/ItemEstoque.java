package com.algaworks.cursojsf.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ItemEstoque {

	private Integer codigoProduto;
	private String descricao;
	private Short quantidade;
	private BigDecimal valorUnitario;
	private Date dataChecagem;

}