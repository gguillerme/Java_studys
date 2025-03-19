package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n;
		int c = 1;
		int maior = 0;
		int aux = 0;
		
		System.out.println("Quantidade de números: ");
		n = sc.nextInt();
		
		int[] values = new int[n];
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Digite um número: ");
			values[i] = sc.nextInt();
//			aux = ;
			if(values[i] > maior) {

				maior = values[i];
				aux++;
			}
		}
		
		System.out.println("Maior valor: " + maior);
		
		System.out.println("Posição do maior valor: " + aux);
		
		sc.close();

	}

}
