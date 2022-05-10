package poo.membrosEstaticos.exercicioFixacao.util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double amountPaid(double price, double bought) {
		double amount = bought * price;
		return  amount + amount * IOF;
	}
	

}
