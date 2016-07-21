package br.com.ricardosander.banco;

import br.com.ricardosander.banco.conta.ContaCorrente;
import br.com.ricardosander.banco.conta.ContaPoupanca;
import br.com.ricardosander.banco.conta.ValorInvalidoException;
import br.com.ricardosander.banco.sistema.AtualizadorDeContas;

/**
 * TestaContas
 * Classe que realiza o teste de classes contas.
 * @author ricardo.sander.lopes@gmail.com
 *
 */
public class TestaContas {

	/**
	 * Método main
	 * @param args
	 */
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        try {
			cc.deposita(1000);
			cp.deposita(1000);

		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		} 
        
        cc.atualiza(0.01);
        cp.atualiza(0.01);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        adc.roda(cc);
        adc.roda(cp);

        System.out.println("Saldo Total: " + adc.getSaldoTotal());

        System.out.println("Imprimindo conta corrente: " + cc.toString());
        System.out.println("Imprimindo conta poupança: " + cp.toString());
    }
}