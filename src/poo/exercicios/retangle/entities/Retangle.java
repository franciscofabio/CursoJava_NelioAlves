package poo.exercicios.retangle.entities;

public class Retangle {
	
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2*(width + height);
	}
	
	public double diagonal() {
		double c = Math.pow(width, 2) + Math.pow(height, 2);
		return Math.sqrt(c);
	}
	
	public String toString() {
		return "AREA = "+String.format("%.2f%n", this.area())
		    +"PERIMETER = "+String.format("%.2f%n", this.perimeter())
		    +"DIAGONAL = "+String.format("%.2f%n", this.diagonal());
	}

}
