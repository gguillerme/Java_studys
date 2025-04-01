package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, soma = 0, aux = 0;

		System.out.println("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();

		int[] vector = new int[n];

		for (int i = 0; i < vector.length; i++) {
			System.out.println("Digite um número: ");
			vector[i] = sc.nextInt();

		}

		for (int i = 0; i < vector.length; i++) {
			if (vector[i] % 2 == 0) {
				soma += vector[i];
				aux++;
			}
		}
		

		if (soma == 0) {
			System.out.println("Nenhum número par");
		}else {
			System.out.println("Media dos pares: " + soma / aux);
		}
		sc.close();
	}

}
