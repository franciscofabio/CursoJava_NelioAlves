package poo.membrosEstaticos.exercicioFixacao.application;

import java.util.Locale;
import java.util.Scanner;

import poo.membrosEstaticos.exercicioFixacao.util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double bought =  sc.nextDouble();
		
		System.out.println("Amount to be paid in reais = "+String.format("%.2f", CurrencyConverter.amountPaid(price, bought)));
		
		sc.close();
		

	}

}
