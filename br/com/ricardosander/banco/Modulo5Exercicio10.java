package br.com.ricardosander.banco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Modulo5Exercicio10 {

	public static void main(String[] args) {
		
		System.out.println("Testando o uso de Collection.");
		
		System.out.println("Iniciando.");
		Modulo5Exercicio10.realizaTeste(new ArrayList<Integer>());//Total inserção: 3 Total busca: 371
		Modulo5Exercicio10.realizaTeste(new HashSet<Integer>());//Total inserção: 8 Total busca: 3
	}
	
	public static void realizaTeste(Collection<Integer> numeros) {
		
		int total = 30000;
		long inicio;
		long fim;
		long totalInsercao;
		long totalPesquisa;

		inicio = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			numeros.add(i);
		}
		fim = System.currentTimeMillis();
		totalInsercao = fim - inicio;
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			numeros.contains(i);
		}
		fim = System.currentTimeMillis();
		totalPesquisa = fim - inicio;
		
		System.out.println("Total inserção: " + totalInsercao);
		System.out.println("Total busca: " + totalPesquisa);
	}
}
