package br.com.mrb.loja.desconto;

import java.math.BigDecimal;

import br.com.mrb.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto{
	public SemDesconto() {
		super(null);
		
	}

	public BigDecimal calcular(Orcamento orcamento) {
		
		
		
		return BigDecimal.ZERO;
	}

}
