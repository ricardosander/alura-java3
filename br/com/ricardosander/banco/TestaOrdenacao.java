package br.com.ricardosander.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.ricardosander.banco.conta.ContaPoupanca;

public class TestaOrdenacao {

	public static void main(String[] args) {
		
		List<ContaPoupanca> contas = new LinkedList<>();
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			contas.add(new ContaPoupanca(random.nextInt(100), "Cliente " + i));
		}
		
		System.out.println("Contas antes da ordenação:");
		for (ContaPoupanca contaPoupanca : contas) {
			System.out.println(contaPoupanca.getNumero());
		}
		
		Collections.sort(contas);
		
		System.out.println("Contas depois da ordenação:");
		for (ContaPoupanca contaPoupanca : contas) {
			System.out.println(contaPoupanca.getNumero());
		}
		
		Collections.reverse(contas);
		System.out.println("Contas após inversão:");
		for (ContaPoupanca contaPoupanca : contas) {
			System.out.println(contaPoupanca.getNumero());
		}
		
		Collections.shuffle(contas);
		System.out.println("Contas após embaralhamento:");
		for (ContaPoupanca contaPoupanca : contas) {
			System.out.println(contaPoupanca.getNumero());
		}
		
		Collections.rotate(contas, 2);
		System.out.println("Contas após rotação 2:");
		for (ContaPoupanca contaPoupanca : contas) {
			System.out.println(contaPoupanca.getNumero());
		}
	}
}
