package poo.construtores.exercicioFixacao.application;

import java.util.Locale;
import java.util.Scanner;

import poo.construtores.exercicioFixacao.entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		Account account = new Account(number, holder);
		
		System.out.println();
		System.out.print("Is there na initial deposit (y/n)? ");
		char op = sc.next().charAt(0);
		
		double value = 0.0;
		if (op != 'n') {
			System.out.print("Enter initial deposit value: ");
			value = sc.nextDouble();
			account.deposit(value);
		} else {
			account.deposit(value);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);	

		System.out.println();
		System.out.print("Enter a deposit value: ");
		value = sc.nextDouble();
		account.deposit(value);
		
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		account.withdraw(value);
		
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
	}
}
