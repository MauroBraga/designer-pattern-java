package br.com.mrb.loja.orcamento;

import java.math.BigDecimal;

import br.com.mrb.loja.orcamento.situacao.EmAnalise;
import br.com.mrb.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {
	
	private BigDecimal valor;
	private int quantidadeItens;
	private SituacaoOrcamento situacao;

	public Orcamento(BigDecimal valor, int quantidadeItens) {
		super();
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.setSituacao(new EmAnalise());
	}

	public void  aplicarDescontoExtra(){
		BigDecimal valorDoDesconto = this.situacao.calcularValorDescontoExtra(this);
		this.valor = this.valor.subtract(valorDoDesconto);
	}

	public void aprovar() {
		this.situacao.aprovar(this);
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	
	
}
