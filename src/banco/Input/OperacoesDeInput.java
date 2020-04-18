package banco.Input;

import java.util.Map;
import java.util.Scanner;

import banco.Conta.Conta;
import banco.Factories.ContaFactory;

public class OperacoesDeInput {
	Scanner scanner = new Scanner(System.in);
	
	public Conta operacaoAbreConta() {
		ContaFactory contaFactory = new ContaFactory();
		
		System.out.println("\n-------------------");
		System.out.println("Qual tipo de conta deseja criar?");
		System.out.println("(1) CC, (2) CP, (3) CPEspecial");
		int tipoConta = scanner.nextInt();
		Conta conta = contaFactory.criarConta(tipoConta);
		
		return conta;
	}
	
	public void operacaoDeposito(Map<Integer, Conta> contas) {
		System.out.print("Entre com o número de conta para depósito: ");
		int numeroConta = scanner.nextInt();
		if(contas.containsKey(numeroConta)) {
			System.out.print("Conta válida! Entre com o valor do depósito: ");
			double valor = scanner.nextDouble();
			Conta conta = contas.get(numeroConta);
			conta.creditar(valor);
			
			System.out.print("Valor: " + valor + " depositado!");
		} else {
			System.out.print("Conta inválida!");
		}
	}
	
	public void operacaoSacar(Map<Integer, Conta> contas) {
		System.out.print("Entre com o número de conta para saque: ");
		int numeroConta = scanner.nextInt();
		
		if(contas.containsKey(numeroConta)) {
			System.out.print("Conta válida! Entre com o valor do saque: ");
			double valor = scanner.nextDouble();
			Conta conta = contas.get(numeroConta);
			conta.debitar(valor);
			
			System.out.print("Valor: " + valor + " sacado!");
		} else {
			System.out.print("Conta inválida!");
		}
	}
	
	public void verSaldo(Map<Integer, Conta> contas) {
		System.out.print("Entre com o número de conta para ver o saldo: ");
		int numeroConta = scanner.nextInt();
		
		if(contas.containsKey(numeroConta)) {			
			System.out.print(contas.get(numeroConta));
		} else {
			System.out.print("Conta inválida!");
		}
	}
}
