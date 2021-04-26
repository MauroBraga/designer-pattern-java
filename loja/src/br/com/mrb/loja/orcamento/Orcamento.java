package br.com.mrb.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {
	
	private BigDecimal valor;
	private int quantidadeItens;
	private String situacao;

	public Orcamento(BigDecimal valor, int quantidadeItens) {
		super();
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
	}

	public void  aplicarDescontoExtra(){
		BigDecimal valorDoDesconto  BigDecimal.ZERO;
		if(situacao.equals("EM ANALISE")){
			valorDoDesconto = new BigDecimal("0.05");
		}
		if(situacao.equals("APROVAR")){
			valorDoDesconto = new BigDecimal("0.01");
		}
		this.valor = this.valor.substract(valorDoDesconto);
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	
	
}
