package application;

import java.util.Scanner;

import entities.Notas;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Notas notas = new Notas();

		System.out.println("Escreva o nome do aluno: ");
		String nomeAluno = sc.nextLine();

		System.out.println("Escreva a nota do primeiro trimestre (máx 30): ");
		notas.primeiroTri = sc.nextInt();

		System.out.println("Escreva a nota do segundo trimestre (máx 35): ");
		notas.segundoTri = sc.nextInt();

		System.out.println("Escreva a nota do terceiro trimestre (máx 35): ");
		notas.terceiroTri = sc.nextInt();

		System.out.println("Nota final = " + notas.notaTotal());

		if (notas.calculoAno() == 1) {
			System.out.println("Parabéns, você passou de ano!");
		} else if (notas.calculoAno() == 2) {
			System.out.println("Infelizmente você não passou.");
			System.out.println("Faltando " + notas.calculoNotaFaltante() + " pontos");
		} else {
			System.out.println("Erro, tente novamente.");

			
		}
		

		sc.close();

	}

}
