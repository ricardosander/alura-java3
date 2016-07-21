package br.com.ricardosander.banco.conta;

public abstract class Conta {
	
	protected double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double deposito) throws ValorInvalidoException {
		
		if (deposito <= 0) {
			throw new ValorInvalidoException(deposito);
		}
		this.saldo += deposito;
	}

	public void saca(double saque) {

		if (this.saldo < saque) {

			System.out.println("Saldo insuficiente.");
			return;
		}
		this.saldo -= saque;
	}

	public abstract void atualiza(double taxa);
}