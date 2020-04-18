package banco.Factories;

import banco.Conta.*;

public class ContaFactory {
	private final int AGENCIA = 1;
	private int ultimaConta;

	public ContaFactory() {
		ultimaConta = 0;
	}
	
	public Conta criarConta(int tipoConta) {
		if(tipoConta == 1) {
			System.out.println("Criando Conta Corrente...");
			return new ContaCorrente(AGENCIA, proximaConta());
		} else if(tipoConta == 2) {
			System.out.println("Criando Conta Poupança...");
			 return new ContaPoupanca(AGENCIA, proximaConta());
		} else if(tipoConta == 3) {
			System.out.println("Criando Conta Poupança Especial...");
			return new ContaPoupancaEspecial(AGENCIA, proximaConta());
		} else {
			System.out.println("Opção inválida!");
			return null;
		}
	}
	
	private int proximaConta() {
		this.ultimaConta += 1;
		return this.ultimaConta;
	}
}
