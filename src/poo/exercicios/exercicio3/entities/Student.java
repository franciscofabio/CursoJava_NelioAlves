package poo.exercicios.exercicio3.entities;

public class Student {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double finalGrade() {
		return nota1 + nota2 + nota3;
	}
	
	public double missingPoints() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		} else {
			return 0.0;
		}	
	}
	
	public String toString() {
		if (missingPoints() > 0.0) {
			return "FINAL GRADE = "+String.format("%.2f%n", finalGrade())
			     +String.format("%s%n", "FAILED")
					+String.format("%s", "MISSING ")+String.format("%.2f POINTS", missingPoints());
		} else {
			return String.format("FINAL GRADE = %.2f%n", finalGrade())
			     +"PASS";
		}
		
	}

}
