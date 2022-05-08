package entradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class LerPontoFlutuante {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		//println pega localidade independente sempre .
		System.out.println(x);
		//printf pega localidade do sistema
		System.out.printf("%.2f%n",x);
		
		sc.close();

	}

}
