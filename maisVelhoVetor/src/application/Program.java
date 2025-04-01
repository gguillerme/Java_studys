package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, aux = 1, idadeMaior = 0;
		String nomeMaior = null;
		
		System.out.println("Quantas pessoas você vai digitar?");
		n = sc.nextInt();
		
		sc.nextLine();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + aux + "a pessoa: ");
			aux++;
			
			System.out.println("Nome: ");
			nome[i] = sc.nextLine();
			
			System.out.println("Idade: ");
			idade[i] = sc.nextInt();
			
			sc.nextLine();
			
			if(idade[i] > idadeMaior) {
				idadeMaior = idade[i];
				nomeMaior = nome[i];
			}
		}
		
		System.out.println("Pessoa mais velha: " + nomeMaior);
		
		
		sc.close();

	}

}
