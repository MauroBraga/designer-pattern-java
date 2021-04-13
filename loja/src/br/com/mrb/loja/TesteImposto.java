package br.com.mrb.loja;

import java.math.BigDecimal;

import br.com.mrb.loja.imposto.CalculadoraDeImpostos;
import br.com.mrb.loja.imposto.ICMS;
import br.com.mrb.loja.imposto.TipoImposto;
import br.com.mrb.loja.orcamento.Orcamento;

public class TesteImposto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"),1);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		System.out.print(calculadora.calcular(orcamento, new ICMS())); 

	}

}
