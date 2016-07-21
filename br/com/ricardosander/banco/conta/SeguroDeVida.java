package br.com.ricardosander.banco.conta;

/**
 * SeguroDeVida
 * Classe que representa um seguro de vida.
 * @author ricardo.sander.lopes@gmail.com
 *
 */
public class SeguroDeVida implements Tributavel {

	@Override
	public double calculaTributos() {
		return 42;
	}

}
