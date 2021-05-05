package br.com.mrb.loja.pedido.acao;

import br.com.mrb.loja.pedido.Pedido;

public class SalvarPedidoBancoDados implements AcaoAposGerarPedido {

	
	
	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando pedidos no banco de dados");
	}
}
