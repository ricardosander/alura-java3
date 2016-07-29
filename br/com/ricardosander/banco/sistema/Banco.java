package br.com.ricardosander.banco.sistema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.ricardosander.banco.conta.Conta;

public class Banco {

	private List<Conta> contas;
	private Map<String, Conta> contasIndexadas;
	
	public Banco() {
		
		this.contas = new ArrayList<>();
		this.contasIndexadas = new HashMap<>();
	}
	
	public void add(Conta conta) {
		
		this.contas.add(conta);
		this.contasIndexadas.put(conta.getCliente(), conta);
	}
	
	public Conta pega(int posicao) {
		return this.contas.get(posicao);
	}
	
	public int pegaQUantidadeDeContas() {
		return this.contas.size();
	}
	
	public Conta buscaPorNome(String nome) {
		return this.contasIndexadas.get(nome);
	}
}
