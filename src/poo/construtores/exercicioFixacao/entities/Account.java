package poo.construtores.exercicioFixacao.entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double value) {
		this.balance += value; 
	}
	
	public void withdraw(double value) {
		this.balance -= value + 5.0; 
	}
	
	public String toString() {
		return "Account "+this.getNumber()+", Holder: "
				+getHolder()+", Balance: $ "+String.format("%.2f", getBalance());
	}
}
