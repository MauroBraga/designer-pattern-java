package br.com.mrb.loja.pedido;

import java.time.LocalDateTime;

import br.com.mrb.loja.orcamento.Orcamento;

public class GeraPedidoHandler {

	//construtor com injenção de dependencia: repository, service, etc
	
	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(),dados.getQuantidadeItens());
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		System.out.println("Salvar Pedidos no banco de dados");
		System.out.println("Enviar email com dados do novo pedido");
	}
}
