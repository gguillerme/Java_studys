package project;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int contador = sc.nextInt();
		
		int[][] matriz = new int[contador][contador];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
				
			}
			
		}
		
		int count = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
					if (matriz[i][j] < 0) {
						count++;
					}
				
			}
		}
		
		
		sc.close();

	}

}
