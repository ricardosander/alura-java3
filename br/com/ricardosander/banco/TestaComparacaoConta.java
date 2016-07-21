package br.com.ricardosander.banco;

import br.com.ricardosander.banco.conta.ContaCorrente;
import br.com.ricardosander.banco.conta.ContaPoupanca;

public class TestaComparacaoConta {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1);
		ContaPoupanca cp = new ContaPoupanca(1);
		ContaCorrente cc2 = new ContaCorrente(1);
		
		if (cc != cc2) {
			System.out.println("Contas correntes de mesmo número tem referências diferentes.");
		}
		
		if (cc.equals(cc2)) {
			System.out.println("Contas correntes de mesmo número são iguais");
		}
		
		if (cc.equals(cp)) {
			System.out.println("Contas corrente e poupança de mesmo número são iguais");
		}
		
		cc2 = new ContaCorrente(2);
		
		if (cc != cc2) {
			System.out.println("Contas correntes de número diferente tem referências diferentes.");
		}
		
		if (cc.equals(cc2)) {
			System.out.println("Contas correntes de número diferente são iguais");
		}
		
		if (cc2.equals(cp)) {
			System.out.println("Contas corrente e poupança de número diferente são iguais");
		}
		
	}
}
