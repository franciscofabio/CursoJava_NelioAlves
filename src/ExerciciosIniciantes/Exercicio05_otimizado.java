// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

package ExerciciosIniciantes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05_otimizado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod = 0, qtd = 0;
		double vlr_unit, valorPG = 0.0;
		
		for(int i = 0; i < 2; i++) {
			cod = sc.nextInt();
			qtd = sc.nextInt();
			vlr_unit = sc.nextDouble();
			
			valorPG += (qtd * vlr_unit);
		}
		
		System.out.printf("VALOR A PAGAR = R$ %.2f%n",valorPG);
		
		sc.close();
	}
}
