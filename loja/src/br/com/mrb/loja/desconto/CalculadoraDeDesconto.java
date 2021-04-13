package br.com.mrb.loja.desconto;

import java.math.BigDecimal;

import br.com.mrb.loja.orcamento.Orcamento;

public class CalculadoraDeDesconto {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto  desconto =new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}

}
