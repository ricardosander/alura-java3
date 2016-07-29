package br.com.ricardosander.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Modulo5Exercicio19 {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<>();
		
		for (int i = 1; i <= 1000; i++) {
			numeros.add(i);
		}
		Collections.reverse(numeros);
		System.out.println(numeros);
	}
}
