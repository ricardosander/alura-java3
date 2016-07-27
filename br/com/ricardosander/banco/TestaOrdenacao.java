package br.com.ricardosander.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.ricardosander.banco.conta.ContaPoupanca;

public class TestaOrdenacao {

	public static void main(String[] args) {
		
		ContaPoupanca c1 = new ContaPoupanca(123, "Cliente 1");
		ContaPoupanca c2 = new ContaPoupanca(1, "Cliente 2");
		ContaPoupanca c3 = new ContaPoupanca(23, "Cliente 3");
		
		List<ContaPoupanca> contas = new ArrayList<>();
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		System.out.println("Contas antes da ordenação:");
		for (ContaPoupanca contaPoupanca : contas) {
			System.out.println(contaPoupanca.getNumero());
		}
		
		Collections.sort(contas);
		
		System.out.println("Contas depois da ordenação:");
		for (ContaPoupanca contaPoupanca : contas) {
			System.out.println(contaPoupanca.getNumero());
		}
	}
}
