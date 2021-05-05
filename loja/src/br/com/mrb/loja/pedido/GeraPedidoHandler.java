package br.com.mrb.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.mrb.loja.orcamento.Orcamento;
import br.com.mrb.loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {

	private List<AcaoAposGerarPedido> list;
	
	//construtor com injenção de dependencia: repository, service, etc
	public GeraPedidoHandler(List<AcaoAposGerarPedido> list) {
		super();
		this.list = list;
	}
	
	
	
	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(),dados.getQuantidadeItens());
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		list.forEach( a -> a.executarAcao(pedido));
	}

}
