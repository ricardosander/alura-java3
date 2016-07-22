package br.com.ricardosander.banco.conta;

/**
 * ContaCorrente
 * Classe que representa uma conta corrente.
 * @author ricardo.sander.lopes@gmail.com
 *
 */
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int numero, String cliente) {
		super(numero, cliente);
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}