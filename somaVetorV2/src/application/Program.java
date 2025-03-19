package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite o numero de vetores para A e B");
		n = sc.nextInt();
		
		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] soma = new int[n];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do vetor A");
			vetorA[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Digite o valor do vetor B");
			vetorB[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			soma[i] = vetorB[i] + vetorA[i]; 
			System.out.println("Resultado da soma de B + A: " + soma[i]);
		}
		
		sc.close();

	}

}
