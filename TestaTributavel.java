package java2;

public class TestaTributavel {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
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
