package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		double alturaMedia;
		double soma = 0.0;
		int contador = 0;
		int c = 1;

		System.out.println("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();

//		double[] vetor = new double[n];
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		String[] meno = new String[n];
		
		for (int i=0; i<n; i++) {
			
		
			System.out.println("Dados da "+ c +"a pessoa:");
			c += 1;
			sc.nextLine();
			System.out.println("Nome: ");
			nome[i] = sc.nextLine();
			
			System.out.println("Idade: ");
			idade[i] = sc.nextInt();
			
			System.out.println("Altura ");
			altura[i] = sc.nextDouble();
			soma += altura[i];
			
			if(idade[i] < 16) {
				contador += 1;
				System.out.println("DEBUG" + contador);
				meno[i] = nome[i]; 
				System.out.println("DEBUG" + meno[i]);
				
			}

		}
		
//		contador = contador * (n/100);
		
		alturaMedia = soma / n;
		System.out.printf("Altura média: %.2f ", alturaMedia);
		
//		System.out.println();
//		System.out.println("DEBUG contador =" + contador);
//		double debug = (double)contador / n * 100;
//		System.out.println("DEBUG calculo =" + debug);

		System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.2f%%", (double)contador / n * 100);
		System.out.println();
			
		for(int i=0; i<n; i++) {
			if (meno[i] != null) {
				System.out.println(meno[i]);
			}
		}
		
		
		

		sc.close();

	}

}
