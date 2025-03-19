package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		int n;

		System.out.println("Qual a quantidade de números?");
		n = sc.nextInt();

		int[] number = new int[n];

		for (int i=0; i<n; i++) {
			System.out.println("Digite um número: ");
			number[i] = sc.nextInt();




		}
		
		System.out.println("Numeros pares: ");
		for (int i=0; i<n; i++) {
			if(number[i] % 2 == 0) {
				contador += 1;
				System.out.print(number[i]+ " ");
			}
		}
		
		System.out.println();
		System.out.println("Quantidade de pares = " + contador);
		sc.close();

	}

}
