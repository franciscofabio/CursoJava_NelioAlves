package Estruturas_repetitivas.while_.Exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int senha = 2002;
		
		while (x != senha) {
			System.out.println("Senha Invalida");
			x = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();

	}

}
