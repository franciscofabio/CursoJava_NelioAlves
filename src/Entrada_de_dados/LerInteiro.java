package Entrada_de_dados;

import java.util.Scanner;

public class LerInteiro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		x = sc.nextInt();
		System.out.println(x+1);
		
		sc.close();

	}

}
