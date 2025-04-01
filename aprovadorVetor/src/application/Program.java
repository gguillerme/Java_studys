package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, aux = 1;
		double soma;
		
		System.out.println("Quantos alunos serão digitados?");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		double[] media = new double[n];
		
		for (int i = 0; i < nota1.length; i++) {
			System.out.println("Digite, respectivamente, nome, primeira e segunda nota do " + aux + "a aluno: ");
			aux++;
			sc.nextLine();
			nome[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
			soma = (nota1[i] + nota2[i]);
			media[i] = soma / 2;
		}
		
		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < nota1.length; i++) {
			if( media[i] >= 6) {
				System.out.println(nome[i]);
			}
			
		}
		
		
		sc.close();
		
		
		
		
		
		
		
	}

}
