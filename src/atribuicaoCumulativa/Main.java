package atribuicaoCumulativa;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor_pagar = 50.0, custo_min_excedido = 2.00;
		int minutos_consumo = 0, minutos_excedidos = 0, minutos_plano = 100;
		
		minutos_consumo = sc.nextInt();
		
		if (minutos_consumo > minutos_plano) {
			minutos_excedidos = minutos_consumo - minutos_plano;
			valor_pagar += (minutos_excedidos * custo_min_excedido);
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n",valor_pagar);
		
		sc.close();		
	}

}
