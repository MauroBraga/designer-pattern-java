package br.com.mrb.loja.orcamento.situacao;

import br.com.mrb.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento{

	@Override
    public void finalizar(Orcamento orcamento) {
    	orcamento.setSituacao(new Finalizado());
    }
    
}