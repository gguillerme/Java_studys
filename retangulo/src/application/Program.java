package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo program = new Retangulo();
		
		System.out.println("Escreva a altura e largura do retangulo: ");
		program.alturaProgram = sc.nextDouble();
		program.larguraProgram = sc.nextDouble();
		
		System.out.println("AREA = " + program.area(0));
		System.out.println("PERIMETRO = " + program.perimetro(0));
		System.out.printf("DIAGONAL = %.2f", program.diagonal(0, 0));

		sc.close();

	}
}