package estrutura_Condicional;

import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		int A, B;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva o primeiro numero: ");
		A = sc.nextInt();

		System.out.println("Escreva o segundo numero: ");
		B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao multiplos");

		} else {
			System.out.println("Nao sao multiplos");

		}

		sc.close();

	}

}
