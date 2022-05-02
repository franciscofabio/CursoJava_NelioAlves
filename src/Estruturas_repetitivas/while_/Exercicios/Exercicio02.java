package Estruturas_repetitivas.while_.Exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		String quadrante = "";

		while (x*y != 0) {
			if (x > 0 && y > 0) {
				quadrante = "primeiro";
			} else if (x < 0 && y > 0) {
				quadrante = "segundo";
			} else if (x < 0 && y < 0) {
				quadrante = "terceiro";
			} else {
				quadrante = "quarto";
			}
			
			System.out.println(quadrante);
			x = sc.nextInt();
			y = sc.nextInt();
		}

		sc.close();
	}
}
