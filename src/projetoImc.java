//Objetivo do Código: Calcular o IMC (Índice de Massa Corporal) de uma pessoa.

import java.util.Locale;
import java.util.Scanner;

public class projetoImc {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu Nome");
		String name = sc.next();
		
		System.out.println("Informe sua Idade");
		int age = sc.nextInt();
		
		System.out.println("Informe sua Altura");
		double height = sc.nextDouble();
		
		System.out.println("Informe seu Peso");
		double weight = sc.nextDouble();
		
		double calc = (int) weight / Math.pow(height, 2.0);
		
		System.out.println();
		if(calc <= 18.5) {
			System.out.println("Abaixo do Peso");
			System.out.printf("Seu IMC é de %.1f%n", calc);
		}
		else if(calc <= 24.9) {
			System.out.println("Peso Normal");
			System.out.printf("Seu IMC é de %.1f%n", calc);
		}
		else if(calc <= 29.9) {
			System.out.println("Sobrepeso");
			System.out.printf("Seu IMC é de %.1f%n", calc);
		}
		else if(calc <= 34.9) {
			System.out.println("Obesidade Grau I");
			System.out.printf("Seu IMC é de %.1f%n", calc);
		}
		else if(calc <= 39.9) {
			System.out.println("Obesidade Grau II");
			System.out.printf("Seu IMC é de %.1f%n", calc);
		}
		else {
			System.out.println("Obesidade Grau III ou Mórbida");
			System.out.printf("Seu IMC é de %.1f%n", calc);
		}
		
		sc.close();
	}
}
