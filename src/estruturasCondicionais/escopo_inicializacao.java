package estruturasCondicionais;

import java.util.Scanner;

public class escopo_inicializacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double price = sc.nextDouble();

		if (price > 100.0) {
			double discount = price * 0.1;
		}
		//System.out.println(discount);
		
		sc.close();
	}

}
