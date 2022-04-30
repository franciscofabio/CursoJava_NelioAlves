/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/

package Estruturas_condicionais.Exercicios_iniciantes_2;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hora_inicial = sc.nextInt();
		int hora_final = sc.nextInt();
		
		if (hora_inicial < hora_final) {
			System.out.printf("O JOGO DUROU %d HORAS(S)",hora_final - hora_inicial);
		} else {
			System.out.printf("O JOGO DUROU %d HORAS(S)",(24-hora_inicial)+hora_final);
		}
		
		sc.close();

	}

}
