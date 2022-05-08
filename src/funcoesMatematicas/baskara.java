package funcoesMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class baskara {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double delta, a, b, c, x1, x2;
		System.out.println("Informe o valor de a: ");
		a = sc.nextDouble();
		System.out.println("Informe o valor de b: ");
		b = sc.nextDouble();
		System.out.println("Informe o valor de c: ");
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2.0) - (4*a*c);
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println("=========RESULTADO==========");
		System.out.println("Valor de Delta: "+(int)delta);
		System.out.println("X1: "+(int)x1);
		System.out.println("X2: "+(int)x2);
		
		sc.close();

	}

}
