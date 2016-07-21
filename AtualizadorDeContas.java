package java2;

public class AtualizadorDeContas {

	private double saldoTotal;
	private double selic;

	public double getSaldoTotal() {
		return this.saldoTotal;
	}

	public AtualizadorDeContas(double selic) {

		this.selic = selic;
		this.saldoTotal = 0.0;
	}

	public void roda(Conta conta) {

		System.out.println("Saldo anterior: " + conta.getSaldo());
		conta.atualiza(this.selic);
		System.out.println("Saldo final: " + conta.getSaldo());
		this.saldoTotal += conta.getSaldo();
	}
}