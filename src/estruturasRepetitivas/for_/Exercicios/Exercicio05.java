package estruturasRepetitivas.for_.Exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = 1;
		//fatorial
		for (int i = 1; i <= n; i++) {
			r *= i;
		}
		System.out.println(r);
		sc.close();

	}

}
