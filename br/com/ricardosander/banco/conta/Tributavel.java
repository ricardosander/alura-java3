package br.com.ricardosander.banco.conta;

/**
 * Tributavel
 * Representa uma entidade tributável.
 * @author ricardo.sander.lopes@gmail.com
 *
 */
public interface Tributavel {

	/**
	 * Calcula os tributos da entidade.
	 * @return Valor a ser tributado.
	 */
	double calculaTributos();
}
