package br.com.ricardosander.banco;

import br.com.ricardosander.banco.conta.ContaCorrente;
import br.com.ricardosander.banco.conta.Tributavel;
import br.com.ricardosander.banco.conta.ValorInvalidoException;

/**
 * TestaTributavel
 * Classe para realização de testes da classes tributáveis. 
 * @author ricardo.sander.lopes@gmail.com
 *
 */
public class TestaTributavel {

	/**
	 * Método main
	 * @param args
	 */
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1, "José");
        try {
			cc.deposita(100);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
        System.out.println(cc.calculaTributos());
        
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
	}
}
