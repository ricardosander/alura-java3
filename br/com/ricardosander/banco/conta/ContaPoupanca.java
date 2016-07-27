package br.com.ricardosander.banco.conta;

/**
 * ContaPoupanca
 * Classe que representa uma conta poupança.
 * @author ricardo.sander.lopes@gmail.com
 *
 */
public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	public ContaPoupanca(int numero, String cliente) {
		super(numero, cliente);
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	@Override
	public void deposita(double deposito) throws ValorInvalidoException {
		super.deposita(deposito - 0.1);
	}

	@Override
	public int compareTo(ContaPoupanca o) {
		return this.numero - o.numero;
	}
}