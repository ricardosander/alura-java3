package br.com.ricardosander.banco.conta;

public class ContaPoupanca extends Conta {

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	@Override
	public void deposita(double deposito) throws ValorInvalidoException {
		super.deposita(deposito - 0.1);
	}
}