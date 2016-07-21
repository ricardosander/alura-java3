package br.com.ricardosander.banco.sistema;

import br.com.ricardosander.banco.conta.Tributavel;

/**
 * GerenciadorDeImpostoDeRenda
 * Classe responsável por gerenciar o imposto de renda de entidades tributáveis.
 * @author ricardo.sander.lopes@gmail.com
 *
 */
public class GerenciadorDeImpostoDeRenda {

	private double total;

	/**
	 * Adicionada uma entidade tributável.
	 * @param t
	 */
	public void adiciona(Tributavel t) {

		System.out.println("Adicionando tributavel: " + t);
		this.total += t.calculaTributos();
	}

	/**
	 * Retorna o valor total de tributos.
	 * @return
	 */
	public double getTotal() {
		return this.total;
	}
}
