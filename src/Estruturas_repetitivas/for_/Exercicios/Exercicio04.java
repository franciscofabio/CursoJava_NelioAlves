package Estruturas_repetitivas.for_.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			if (n2==0) {
				System.out.println("divisão impossivel");
			}else {
				System.out.printf("%.1f%n",(double) n1/n2);
			}
		}
		sc.close();
	}
}
