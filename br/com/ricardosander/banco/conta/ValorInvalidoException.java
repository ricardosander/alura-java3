package br.com.ricardosander.banco.conta;

public class ValorInvalidoException extends Exception {

	public ValorInvalidoException(double valor) {
		super("Valor inválido: " + valor);
	}

}
