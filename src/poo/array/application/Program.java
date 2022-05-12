package poo.array.application;

import java.util.Locale;
import java.util.Scanner;

import poo.array.entities.Average;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
			
		}
		
		System.out.printf("AVERAGE HEIGHT: %.2f",Average.calc(vect));
		
		sc.close();
	}
}
