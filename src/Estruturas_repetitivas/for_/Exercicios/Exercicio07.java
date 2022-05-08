package Estruturas_repetitivas.for_.Exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int l = 1; l <= n; l++) {
			int quadrado = (int) Math.pow(l, 2);
			int cubo = (int) Math.pow(l, 3);
			System.out.println(l+" "+quadrado+" "+cubo);
		}
		sc.close();
	}
}
