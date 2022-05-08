// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.


package exerciciosIniciantes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod_p1, cod_p2, qtd_p1, qtd_p2 = 0;
		double vlr_unit_p1, vlr_unit_p2, valorPG = 0.0;
		
		cod_p1 = sc.nextInt();
		qtd_p1 = sc.nextInt();
		vlr_unit_p1 = sc.nextDouble();
		
		cod_p2 = sc.nextInt();
		qtd_p2 = sc.nextInt();
		vlr_unit_p2 = sc.nextDouble();
		
		valorPG = (qtd_p1 * vlr_unit_p1) + (qtd_p2 * vlr_unit_p2);
		
		System.out.printf("VALOR A PAGAR = R$ %.2f%n",valorPG);
		
		sc.close();

	}

}
