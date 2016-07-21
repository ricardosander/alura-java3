package br.com.ricardosander.banco.conta;

/**
 * ValorInvalidoException
 * Classe de exceção para passagem de valores inválidos.
 * @author ricardo.sander.lopes@gmail.com
 *
 */
public class ValorInvalidoException extends Exception {

	/**
	 * Constrói a exceção.
	 * @param valor Valor inválido informado.
	 */
	public ValorInvalidoException(double valor) {
		super("Valor inválido: " + valor);
	}

}
