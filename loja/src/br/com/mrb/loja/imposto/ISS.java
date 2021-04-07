package br.com.mrb.loja.imposto;

import java.math.BigDecimal;

import br.com.mrb.loja.orcamento.Orcamento;

public class ISS implements Imposto {

	public BigDecimal calcular(Orcamento orcamento) {
		
		return orcamento.getValor().multiply(new BigDecimal("0.6"));
		
	}
	
}
