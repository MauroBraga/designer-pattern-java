package br.com.mrb.loja;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.mrb.loja.orcamento.Orcamento;
import br.com.mrb.loja.pedido.GeraPedido;
import br.com.mrb.loja.pedido.GeraPedidoHandler;
import br.com.mrb.loja.pedido.Pedido;

public class TestePedidos {

	public static void main(String[] args) {
		BigDecimal valorOrcamento = new BigDecimal("600");
		String cliente = "Ana da Silva";
		LocalDateTime data = LocalDateTime.now();
		int quantidade = 2;
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento,quantidade);
		GeraPedidoHandler handler = new GeraPedidoHandler();
		handler.execute(gerador);
	}

}
