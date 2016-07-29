package br.com.ricardosander.banco.conta;

/**
 * Classe Conta. Representa uma conta bancária no banco.
 * @author ricardo.sander.lopes@gmail.com
 *
 */
public abstract class Conta {

	protected String cliente;
	protected double saldo;
	protected int numero;
	
	public String getCliente() {
		return cliente;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Conta(int numero, String cliente) {
		this.numero = numero;
		this.cliente = cliente;
	}

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
	
	@Override
	public String toString() {
		return "Esta é uma conta conta saldo R$ " + this.saldo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	
}