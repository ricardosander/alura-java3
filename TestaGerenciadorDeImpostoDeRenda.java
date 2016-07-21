package java2;

public class TestaGerenciadorDeImpostoDeRenda {

	public static void main(String[] args) {

		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);

		ContaCorrente cc = new ContaCorrente();
		try {
			cc.deposita(1000);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		gerenciador.adiciona(cc);

		System.out.println(gerenciador.getTotal());
		System.out.printf("O saldo é: %.2f", cc.getSaldo());

	}
}
