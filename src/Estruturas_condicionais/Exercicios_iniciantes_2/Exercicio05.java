package Estruturas_condicionais.Exercicios_iniciantes_2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int qtd = sc.nextInt();
		double valor = 0.0;
		
		if (codigo == 1) {
			valor = qtd * 4.00;
		} else if (codigo == 2) {
			valor = qtd * 4.50;
		} else if (codigo == 3) {
			valor = qtd * 5.00;
		} else if (codigo == 4) {
			valor = qtd * 2.00;
		} else {
			valor = qtd * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f%n",valor);
		
		sc.close();
	}
}
