package entradaDeDados;

import java.util.Scanner;

public class LerMaisdeUmTipoEnter {

	public static void main(String[] args) {
		// Varios tipos de dados separados com enter
		// Ler a linha inteira
		
		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();

	}

}
