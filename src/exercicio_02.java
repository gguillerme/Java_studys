import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {
	// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
	// valor da área deste círculo com quatro casas decimais conforme exemplos.
	// Fórmula da área: area = π . raio2
	// Considere o valor de π = 3.14159

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double pi, raioCirculo, area;
		int potencia = 2;

		pi = 3.14159;

		System.out.println("Escreva o valor do raio de um circulo: ");
		raioCirculo = sc.nextDouble();
		
		area = pi * Math.pow(raioCirculo, potencia);
		
		System.out.printf("A Area é igual a: %.4f ", area);
		
		sc.close();
		
	}

}
