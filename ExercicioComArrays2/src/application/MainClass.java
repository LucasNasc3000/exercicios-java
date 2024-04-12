package application;

import java.util.Scanner;
import java.util.Locale;

import entities.CriaPessoa;

public class MainClass {

	public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Quantos números você vai digitar? ");
      int n = sc.nextInt();
      sc.nextLine();
      int idade[] = new int[n];
      double altura[] = new double[n];
      String nome[] = new String[n];
      
      
      for(int i=0; i<n; i++) {
    	 idade[i] = sc.nextInt();
    	 altura[i] = sc.nextDouble();
    	 nome[i] = sc.nextLine();
      }
      
      for(int i=0; i<nome.length; i++) {
    	  System.out.printf(" idade: %d%n altura:%.2f%n nome: %s%n ", idade[i], altura[i], nome[i]);
      }
     
      
      sc.close();
	}

}