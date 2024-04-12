package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class MainClass {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter account number");
		int numeroDaConta = sc.nextInt();
		System.out.println("Enter account holder");
		String TitularNome = sc.next();
		System.out.println("Is there an initial deposit (y/n)? ");
		String DepositoInicialEscolha = sc.next();
		Conta conta = new Conta(TitularNome, numeroDaConta);
		
		if(DepositoInicialEscolha.equals("y")) {
			System.out.println("Enter initial deposit value: ");
			double depositoInicial = sc.nextDouble();
			
			conta.Deposito(depositoInicial);
			
			System.out.printf("Account data: %n");
			System.out.printf("Account: %d, Holder: %s, Balance: %.2f%n", conta.getNumeroConta(), conta.nomeTitular, conta.getValorConta());
		}
		 if(DepositoInicialEscolha.equals("n")) {
			
			System.out.printf("Account data: %n");
			System.out.printf("Account: %d, Holder: %s, Balance: %.2f%n", conta.getNumeroConta(), conta.nomeTitular, conta.getValorConta());
		}
		
		System.out.println("Enter deposit value: ");
		double deposito = sc.nextDouble();
		conta.Deposito(deposito);
		System.out.printf("Updated account data: %n");
		System.out.printf("Account: %d, Holder: %s, Balance: %.2f%n", conta.getNumeroConta(), conta.nomeTitular, conta.getValorConta());
		
		System.out.println("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		conta.Saque(saque);
		System.out.printf("Updated account data: %n");
		System.out.printf("Account: %d, Holder: %s, Balance: %.2f%n", conta.getNumeroConta(), conta.nomeTitular, conta.getValorConta());
		
		sc.close();
	}

}
