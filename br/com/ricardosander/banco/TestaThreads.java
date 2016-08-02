package br.com.ricardosander.banco;

public class TestaThreads {

	public static void main(String[] args) {
		
		Programa p1 = new Programa();
		Programa p2 = new Programa();
		
		p1.setId(1);
		p2.setId(2);
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);

		t1.start();
		t2.start();
	}
}
