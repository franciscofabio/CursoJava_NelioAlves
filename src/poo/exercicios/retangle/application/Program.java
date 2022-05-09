package poo.exercicios.retangle.application;

import java.util.Locale;
import java.util.Scanner;

import poo.exercicios.retangle.entities.Retangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangle retangle = new Retangle();
		
		System.out.println("Enter rectangle width and height:");
		retangle.width = sc.nextDouble();
		retangle.height = sc.nextDouble();
		
		System.out.println(retangle);
		
		sc.close();

	}

}
