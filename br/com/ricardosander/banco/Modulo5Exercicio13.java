package br.com.ricardosander.banco;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Modulo5Exercicio13 {

	public static void main(String[] args) {
		
		System.out.println("Testando performace de ArrayList e LinkedList.");
		List<Integer> array = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		System.out.println("Testando ArrayList:");
		System.out.println("Inserção:");
		Modulo5Exercicio13.testaInsercaoLista(array);
		System.out.println("Busca:");
		Modulo5Exercicio13.testaBuscaLista(array);
		
		System.out.println("Testando LinkedList:");
		System.out.println("Inserção:");
		Modulo5Exercicio13.testaInsercaoLista(linkedList);
		System.out.println("Busca:");
		Modulo5Exercicio13.testaBuscaLista(linkedList);
		
	}
	
	public static void testaInsercaoLista(List<Integer> lista) {
		
		int numeros = 30000;
		long inicio, fim, total;
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i < numeros; i++) {
			lista.add(0, i);
		}
		fim = System.currentTimeMillis();
		total = fim - inicio;
		System.out.println("Tempo gasto: " + total);
	}
	
	public static void testaBuscaLista(List<Integer> lista) {
		
		int numeros = 30000;
		long inicio, fim, total;
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i < numeros; i++) {
			lista.get(i);
		}
		fim = System.currentTimeMillis();
		total = fim - inicio;
		System.out.println("Tempo gasto: " + total);
	}
}
