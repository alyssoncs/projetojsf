package com.algaworks.cursojsf;

import com.algaworks.cursojsf.domain.ItemEstoque;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
@Getter
public class EstoqueBean {

	private ItemEstoque itemEstoque = new ItemEstoque();
	private List<ItemEstoque> itensEstoque = new ArrayList<ItemEstoque>();

	public void incluir() {
		this.itensEstoque.add(this.itemEstoque);
		this.itemEstoque = new ItemEstoque();
	}

}