package com.algaworks.cursojsf.view;

import com.algaworks.cursojsf.domain.Lancamento;
import com.algaworks.cursojsf.domain.TipoLancamento;
import lombok.Data;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import java.io.Serializable;

@ManagedBean
@ViewScoped
@Data
public class CadastroLancamentoBean implements Serializable {
	private Lancamento lancamento = new Lancamento();

	@PostConstruct
	private void setDefaultValues() {
		TipoLancamento defaultTipoLancamento = TipoLancamento.values()[0];
		lancamento.setTipo(TipoLancamento.DESPESA);

		System.out.println(lancamento.getTipo().getDescricao());
	}

	public void cadastrar() {
		System.out.println("Tipo: " + this.lancamento.getTipo());
		System.out.println("Pessoa: " + this.lancamento.getPessoa().getNome());
		System.out.println("Descrição: " + this.lancamento.getDescricao());
		System.out.println("Valor: " + this.lancamento.getValor());
		System.out.println("Data vencimento: " + this.lancamento.getDataVencimento());
		System.out.println("Conta paga: " + this.lancamento.isPago());
		System.out.println("Data pagamento: " + this.lancamento.getDataPagamento());

		this.lancamento = new Lancamento();

		String msg = "Cadastro efetuado com sucesso!";
		FacesContext.getCurrentInstance()
				.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg));
	}


	public TipoLancamento[] getTiposLancamento() {
		return TipoLancamento.values();
	}
}
