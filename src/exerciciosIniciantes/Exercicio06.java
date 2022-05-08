/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura. - bxa / 2 - A*C / 2
b) a área do círculo de raio C. (pi = 3.14159) - A = PI * (raio * raio) -> Area = PI * pow(c,2)
c) a área do trapézio que tem A e B por bases e C por altura. - Area = (B+b).h /2 -> (A+B).C / 2
d) a área do quadrado que tem lado B. - Area = L*L -> Area = B*B
e) a área do retângulo que tem lados A e B. - Area = A*B  */ 

package exerciciosIniciantes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo, PI = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		//área do triângulo retângulo 
		triangulo = (A * C) / 2;
		
		//a área do círculo de raio C.
		circulo = PI * Math.pow(C,2);
		
		//a área do trapézio que tem A e B por bases e C por altura.
		trapezio = ((A + B) * C) / 2;
		
		//a área do quadrado que tem lado B.
		quadrado = Math.pow(B, 2);
		
		//a área do retângulo que tem lados A e B. - Area = A*B
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n",triangulo);
		System.out.printf("CIRCULO: %.3f%n",circulo);
		System.out.printf("TRAPEZIO: %.3f%n",trapezio);
		System.out.printf("QUADRADO: %.3f%n",quadrado);
		System.out.printf("RETANGULO: %.3f%n",retangulo);
		
		
		sc.close();
	}

}
