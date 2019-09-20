package com.algaworks.cursojsf.view;

import com.algaworks.cursojsf.domain.Produto;
import lombok.Data;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



@ManagedBean
@SessionScoped
@Data
public class GestaoProdutosBean implements Serializable {
	private Produto produto = new Produto();

	private Produto produtoSelecionado;

	private List<Produto> produtos = new ArrayList<>();
	private List<Produto> produtosFiltrados = new ArrayList<>();

	public void verificarInclusao(ActionEvent action) {
		if ("".equals(produto.getNome())) {
			produto.setNome("Fabricante não informado");
		}
	}

	public void incluir() {
		produtos.add(produto);
		produto = new Produto();
	}

	public void excluir() {
		produtos.remove(produtoSelecionado);
		produtosFiltrados.remove(produtoSelecionado);
	}

	public void nomePesquisaListener(ValueChangeEvent valueChangeEvent) {
		this.produtosFiltrados.clear();

		String nomeProcurado = valueChangeEvent.getNewValue().toString();
		filtraPorNome(produtos, nomeProcurado, produtosFiltrados);
	}

	private void filtraPorNome(List<Produto> produtos, String nomeProcurado, List<Produto> produtosFiltrados) {
		if (nomeProcurado == null || nomeProcurado.isEmpty()) {
			produtosFiltrados.addAll(produtos);
		} else {
			nomeProcurado = nomeProcurado.toLowerCase();
			for (Produto produto : produtos) {
				if (produto.getNome().toLowerCase().startsWith(nomeProcurado)) {
					produtosFiltrados.add(produto);
				}
			}
		}
	}

}


