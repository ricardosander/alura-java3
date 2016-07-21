package br.com.ricardosander.banco.sistema;

import br.com.ricardosander.banco.conta.Conta;

/**
 * AtualizadorDeContas
 * Classe responsável por atualizar as contas com uma taxa.
 * @author ricardo.sander.lopes@gmail.com
 *
 */
public class AtualizadorDeContas {

	private double saldoTotal;
	private double selic;

	/**
	 * 
	 * @param selic
	 */
	public AtualizadorDeContas(double selic) {

		this.selic = selic;
		this.saldoTotal = 0.0;
	}
	
	/**
	 * Retorna o saldo total de todas as contas atualizadas.
	 * @return
	 */
	public double getSaldoTotal() {
		return this.saldoTotal;
	}

	/**
	 * Roda a atualização de conta em uma Conta.
	 * @param conta Conta a aser atualizada e totalizada.
	 */
	public void roda(Conta conta) {

		System.out.println("Saldo anterior: " + conta.getSaldo());
		conta.atualiza(this.selic);
		System.out.println("Saldo final: " + conta.getSaldo());
		this.saldoTotal += conta.getSaldo();
	}
}