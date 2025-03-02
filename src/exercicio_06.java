import java.util.Locale;
import java.util.Scanner;
public class exercicio_06 {
	// Fazer um programa que leia três valores com ponto flutuante
	// de dupla precisão: A, B e C. Em seguida, calcule e mostre:
	// a) a área do triângulo retângulo que tem A por base e C por altura.
	// b) a área do círculo de raio C. (pi = 3.14159)
	// c) a área do trapézio que tem A e B por bases e C por altura.
	// d) a área do quadrado que tem lado B.
	// e) a área do retângulo que tem lados A e B

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);	
		
		
		double A, B, C, pi, resultA, resultB, resultC, resultD, resultE;
		
		pi = 3.14159;

		System.out.println("Digite a base/lado: ");
		A = sc.nextDouble();
		
		System.out.println("Digite a base/lado: ");
		B = sc.nextDouble();
	
		System.out.println("Digite a altura/raio: ");
		C = sc.nextDouble();
		
		resultA = (A * C) / 2; //TRIANGULO
		
		resultB = pi * Math.pow(C, 2); //CIRCULO
		
		resultC = (B + A) / 2 * C; //TRAPEZIO
		
		resultD = B * B; //QUADRADO
		
		resultE = B * A; //RETANGULO
		
		
		System.out.printf("TRIANGULO: %.3f %n", resultA);
		System.out.printf("CIRCULO: %.3f %n", resultB);
		System.out.printf("TRAPEZIO: %.3f %n", resultC);
		System.out.printf("QUADRADO: %.3f %n", resultD);
		System.out.printf("RETANGULO: %.3f %n", resultE);
		
		
		sc.close();		
		
		
	}

}
