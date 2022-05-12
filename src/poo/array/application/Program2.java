package poo.array.application;

import java.util.Locale;
import java.util.Scanner;

import poo.array.entities.Average;
import poo.array.entities.Product;



public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new Product(name, price);
		}
		
		System.out.printf("AVERAGE PRICE = %.2f",Average.AVGProduct(vect));
		
		sc.close();
	}
}
