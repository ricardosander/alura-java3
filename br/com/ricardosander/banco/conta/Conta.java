package br.com.ricardosander.banco.conta;

/**
 * Classe Conta. Representa uma conta bancária no banco.
 * @author ricardo.sander.lopes@gmail.com
 *
 */
public abstract class Conta {
	
	protected double saldo;

	/**
	 * Retorna o saldo da Conta.
	 * @return Saldo da Conta.
	 */
	public double getSaldo() {
		return this.saldo;
	}

	/**
	 * Realiza um depósito bancário da Conta.
	 * @param deposito Valor a ser depositado. Deve ser um valor superior a 0.
	 * @throws ValorInvalidoException Caso o valor passado seja inválido.
	 */
	public void deposita(double deposito) throws ValorInvalidoException {
		
		if (deposito <= 0) {
			throw new ValorInvalidoException(deposito);
		}
		this.saldo += deposito;
	}

	/**
	 * Realiza um saque, descontando o valor informado do saldo da Conta.
	 * @param saque Valor a ser sacado.
	 */
	public void saca(double saque) {

		if (this.saldo < saque) {

			System.out.println("Saldo insuficiente.");
			return;
		}
		this.saldo -= saque;
	}

	/**
	 * Atualiza o saldo da conta com a taxa informada.
	 * @param taxa Taxa para reajuste do saldo da Conta.
	 */
	public abstract void atualiza(double taxa);
}