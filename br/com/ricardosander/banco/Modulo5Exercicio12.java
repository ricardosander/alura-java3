package br.com.ricardosander.banco;

import java.util.HashMap;
import java.util.Map;

import br.com.ricardosander.banco.conta.Conta;
import br.com.ricardosander.banco.conta.ContaCorrente;
import br.com.ricardosander.banco.conta.ValorInvalidoException;

public class Modulo5Exercicio12 {

	public static void main(String[] args) throws ValorInvalidoException {
		
		Map<String, ContaCorrente> map = new HashMap<>();
		
		ContaCorrente cc1 = new ContaCorrente(1, "Primeiro Cliente");
		ContaCorrente cc2 = new ContaCorrente(2, "Segundo Cliente");
		
		cc1.deposita(10);
		cc2.deposita(200);
		
		map.put("diretor", cc1);
		map.put("gerente", cc2);
		
		Conta contaDiretor = map.get("diretor");
		System.out.println(contaDiretor);
	}
}
