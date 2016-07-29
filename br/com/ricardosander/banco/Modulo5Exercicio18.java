package br.com.ricardosander.banco;

import java.util.TreeSet;

public class Modulo5Exercicio18 {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet = new TreeSet<>();

		for (int i = 1; i <= 1000; i++) {
			treeSet.add(i);
		}
		treeSet = (TreeSet<Integer>) treeSet.descendingSet();
		System.out.println(treeSet);
	}
}
