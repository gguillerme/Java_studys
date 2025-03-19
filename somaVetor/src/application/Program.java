package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		
		System.out.println("How many numbers: ");
		n = scanner.nextInt();

		double[] vetor = new double[n];
		
		for(int i=0; i<n; i++) {
			scanner.nextLine();
			System.out.println("Enter a number: ");
			vetor[i] = scanner.nextDouble(); 
		}

		System.out.print("VALUES =" );
		for(int i=0; i<n; i++) {			
			System.out.print(" " + vetor[i]);
		}

		double average = 0.0;
		double sum = 0.0;
		for(int i=0; i<n; i++) {		
			sum += vetor[i];
		}
		average = sum/n;
		
		System.out.println();
		System.out.println("SOMA = " + sum );
		System.out.println("AVERAGE = " + average );
				
		scanner.close();

	}

}
