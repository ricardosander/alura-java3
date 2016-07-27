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
			contas.add(new ContaPoupanca(random.nextInt(100), "Cliente " + random.nextInt(10)));
		}

		System.out.println("Contas antes da ordenação:");
		System.out.println(contas);
		Collections.sort(contas);

		System.out.println("Contas depois da ordenação:");
		System.out.println(contas);

		Collections.reverse(contas);
		System.out.println("Contas após inversão:");
		System.out.println(contas);

		Collections.shuffle(contas);
		System.out.println("Contas após embaralhamento:");
		System.out.println(contas);

		Collections.rotate(contas, 2);
		System.out.println("Contas após rotação 2:");
		System.out.println(contas);
	}
}
