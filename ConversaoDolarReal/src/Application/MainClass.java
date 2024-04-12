package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class MainClass {

	public static void main(String[] args) { //DÁ PRA CHAMAR FUNÇÕES EM VARIÁVEIS AQUI MESMO NO MAIN
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		CurrencyConverter.dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		CurrencyConverter.dollars = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.moneyConverter());
		
		sc.close();
	}

}
