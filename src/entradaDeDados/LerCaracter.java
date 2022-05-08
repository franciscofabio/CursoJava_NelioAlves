package entradaDeDados;

import java.util.Scanner;

public class LerCaracter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char x;
		x = sc.next().charAt(0);
		System.out.printf("Você digitou: %c%n",x);
		
		sc.close();

	}

}
