package br.com.ricardosander.banco;

import br.com.ricardosander.banco.conta.Conta;
import br.com.ricardosander.banco.conta.ContaCorrente;

/**
 * TestaDeposita
 * Classe que testa o depósito.
 * @author ricardo.sander.lopes@gmail.com
 *
 */
public class TestaDeposita {

	/**
	 * Método principal.
	 * @param args
	 */
	public static void main(String[] args) {

		Conta c = new ContaCorrente();
		double deposito = 0;

		try {
			c.deposita(deposito);
			System.out.println("Depósito efetuado no valor de R$ " + deposito);
		} catch (Exception e) {
			System.out.println(e.getMessage() + ", valor: " + deposito);
		}

		try {
			deposito = 0.0;
			c.deposita(deposito);
			System.out.println("Depósito efetuado no valor de R$ " + deposito);
		} catch (Exception e) {
			System.out.println(e.getMessage() + ", valor: " + deposito);
		}

		try {
			deposito = -100;
			c.deposita(deposito);
			System.out.println("Depósito efetuado no valor de R$ " + deposito);
		} catch (Exception e) {
			System.out.println(e.getMessage() + ", valor: " + deposito);
		}

		try {
			deposito = 100;
			c.deposita(deposito);
			System.out.println("Depósito efetuado no valor de R$ " + deposito);
		} catch (Exception e) {
			System.out.println(e.getMessage() + ", valor: " + deposito);
		}
	}
}
