package Estruturas_condicionais.Estrutura_if_else;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("Bom Dia!");
		}else {
			System.out.println("Boa Tarde!");
		}
		
		sc.close();

	}

}
