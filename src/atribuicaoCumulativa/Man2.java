package atribuicaoCumulativa;

import java.util.Locale;
import java.util.Scanner;

public class Man2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos_consumo = sc.nextInt();
		double conta = 50.0;
		
		if (minutos_consumo > 100) {
			//+= atribuição cumulativa
			conta += (minutos_consumo - 100) * 2.0;
		}
		
		System.out.printf("Valor a pagar R$: %.2f%n",conta);
		
		sc.close();

	}

}
