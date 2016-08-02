package br.com.ricardosander.banco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class RegistroDeMensagens {

	public static void main(String[] args) throws InterruptedException {
		
		Collection<String> mensagens = new Vector<>();
		
		Thread t1 = new Thread(new ProduzMensagens(0, 10000, mensagens));
		Thread t2 = new Thread(new ProduzMensagens(10000, 20000, mensagens));
		Thread t3 = new Thread(new ProduzMensagens(20000, 30000, mensagens));
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Theards produtoras de mensagens finalizadas!");
		
		for (int i = 0; i < 15000; i++) {
			if (!mensagens.contains("Mensagem " + 1)) {
				throw new IllegalStateException("Não encontrei a mensagem " + i);
			}
		}
		
		if (mensagens.contains(null)) {
			throw new IllegalStateException("Não deveria ter null aqui dentro!");
		}
		
		System.out.println("Fim da execução com sucesso.");
	}
}
