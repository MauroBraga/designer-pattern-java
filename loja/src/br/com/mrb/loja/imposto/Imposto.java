package br.com.mrb.loja.imposto;

import java.math.BigDecimal;

import br.com.mrb.loja.orcamento.Orcamento;

public interface Imposto {
	BigDecimal calcular(Orcamento orcamento);
}
