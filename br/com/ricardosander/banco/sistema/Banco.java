package br.com.ricardosander.banco.sistema;

import java.util.ArrayList;
import java.util.List;

import br.com.ricardosander.banco.conta.Conta;

public class Banco {

	private List<Conta> contas;
	
	public Banco() {
		this.contas = new ArrayList<>();
	}
	
	public void add(Conta conta) {
		this.contas.add(conta);
	}
	
	public Conta pega(int posicao) {
		return this.contas.get(posicao);
	}
	
	public int pegaQUantidadeDeContas() {
		return this.contas.size();
	}
}
