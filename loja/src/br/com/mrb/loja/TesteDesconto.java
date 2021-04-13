package br.com.mrb.loja;

import java.math.BigDecimal;

import br.com.mrb.loja.desconto.CalculadoraDeDesconto;
import br.com.mrb.loja.orcamento.Orcamento;

public class TesteDesconto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("200"),4);
		CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
		System.out.println(calculadora.calcular(orcamento)); 
		
		Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"),1);
		System.out.println(calculadora.calcular(orcamento2)); 

	}

}
