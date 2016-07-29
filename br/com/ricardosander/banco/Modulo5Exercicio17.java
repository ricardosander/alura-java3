package br.com.ricardosander.banco;

import java.util.HashSet;

import br.com.ricardosander.banco.conta.Conta;
import br.com.ricardosander.banco.conta.ContaCorrente;

public class Modulo5Exercicio17 {

	public static void main(String[] args) {
		
		HashSet<Conta> contas = new HashSet<>();
		contas.add(new ContaCorrente(1, "Ricardo"));
		contas.add(new ContaCorrente(2, "Scarlet"));
		contas.add(new ContaCorrente(1, "Sr Piccolo"));
		contas.add(new ContaCorrente(3, "Loki"));
		contas.add(new ContaCorrente(2, "Kala"));
		System.out.println(contas);
	}	
}
