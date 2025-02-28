import java.util.Scanner;

public class exercicio_03 {
	// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
	// calcule e mostre a diferença do produto pelo produto de C e D segundo a
	// fórmula: DIFERENCA = (A * B - C * D).
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A, B, C, D, diferenca;

		System.out.println("Escreva valor de A: ");
		A = sc.nextInt();
		System.out.println("Escreva valor de B: ");
		B = sc.nextInt();
		System.out.println("Escreva valor de C: ");
		C = sc.nextInt();
		System.out.println("Escreva valor de D: ");
		D = sc.nextInt();

		diferenca = A * B - C * D;
		System.out.println("A diferença é: " + diferenca);
	}

}
