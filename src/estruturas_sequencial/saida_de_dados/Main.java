package estruturas_sequencial.saida_de_dados;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		//sem quebra de linha no final
		System.out.print("Bom dia!");

		
		//com quebra de linha no final
		System.out.println("Bom dia!");
		System.out.println("Proxima linha");
		
		//Escrever o conteúdo de uma variável tipo básico
		int y = 32;
		System.out.println(y);
		
		//Escrever o conteúdo de uma variável com ponto flutuante
		double x = 10.35784;
		System.out.println(x);
		
		//definir qtd de casas decimais
		System.out.printf("%.2f%n", x);
		//considera o . (ponto) como separador de casas decimais
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		//Concatenar vários elementos em um mesmo comando de escrita
		System.out.println("RESULTADO = " + x + " METROS");
		
		//printf
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		//com todos os tipos básicos
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha %.2f reais.%n", nome, idade, renda);
		
		
		
		
		
		
		

	}

}
