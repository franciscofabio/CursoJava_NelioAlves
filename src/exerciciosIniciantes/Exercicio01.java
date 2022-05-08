// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
// mensagem explicativa, conforme exemplos.

package exerciciosIniciantes;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, soma;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		System.out.println("SOMA = "+soma);
		
		sc.close();

	}

}
