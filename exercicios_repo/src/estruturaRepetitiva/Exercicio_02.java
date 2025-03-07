package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		

		
		
		do {
			
			System.out.println("Escreva a cordenada de x: ");
			x = sc.nextInt();
			
			System.out.println("Escreva a cordenada de y: ");
			y = sc.nextInt();
			
			if(x < 0 && y < 0) {
				System.out.println("Terceiro");
				
			}else if(x < 0 && y > 0){
				System.out.println("Primeiro");
				
			}else if(x > 0 && y < 0) {
				System.out.println("Quarto");
				
			}else if(x > 0 && y > 0) {
				System.out.println("Segundo");
				
			}
			  
		} while (x != 0 && y != 0);
		
		
		
		sc.close();

	}

}
