package br.com.mrb.loja.imposto;

import java.math.BigDecimal;

import br.com.mrb.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {
	
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		
		return  imposto.calcular(orcamento);
		
		
	}

}
