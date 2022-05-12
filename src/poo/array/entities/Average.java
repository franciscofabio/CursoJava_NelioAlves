package poo.array.entities;

public class Average {
	
	public static double calc(double[] params) {
		double soma = 0;
		for (int i = 0; i < params.length; i++) {
			soma += params[i];
		}
		return soma/params.length;
	}
	
	public static double AVGProduct(Product[] params) {
		double soma = 0;
		for (int i = 0; i < params.length; i++) {
			soma += params[i].getPrice();
		}
		return soma/params.length;
	}

}
