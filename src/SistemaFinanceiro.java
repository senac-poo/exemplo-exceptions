import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import banco.Conta.*;
import banco.Factories.*;
import banco.Input.OperacoesDeInput;

public class SistemaFinanceiro {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		OperacoesDeInput input = new OperacoesDeInput();
		Map<Integer, Conta> contas = new HashMap<Integer, Conta>();
		
		while (true) {
			System.out.println("O que deseja fazer?");
			System.out.println("(1) Criar conta, (2) Saldo, (3) Depositar, (4) Sacar, (0) Sair");
			int tipoOperacao = scanner.nextInt();
			
			if(tipoOperacao == 0) {
				System.out.println("Tchau!");
				System.exit(0);
			} else if(tipoOperacao == 1) {
				Conta contaNova = input.operacaoAbreConta();
				if(contaNova != null) {
					contas.put(contaNova.getConta(), contaNova);
					System.out.println(contaNova);
				} else {
					System.out.println("Tipo de conta inválida!");
				}
			} else if(tipoOperacao == 2) {
				input.verSaldo(contas);
			} else if(tipoOperacao == 3) {
				input.operacaoDeposito(contas);
			} else if(tipoOperacao == 4) {
				input.operacaoSacar(contas);
			} else {
				System.out.println("Operação inválida");
			}
			System.out.println("\n-------------------");
		}
	}
}












