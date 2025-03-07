package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0, gasolina = 0, diesel = 0, cod = 0;
		
		while (cod != 4) {
			System.out.println("Escreva o cod referente ao combustível (1, 2, 3) digite 4 para finalizar: ");
			cod = sc.nextInt();
			
			if (cod == 1) {
				alcool = alcool + 1;
			
			}else if(cod == 2) {
				gasolina = gasolina + 1;
			
			}else if(cod == 3) {
				diesel = diesel + 1;
				
			}else if (cod == 4){
				System.out.println("Muito Obrigado!");

			}else {
				System.out.println("Código invalido");
				
			}
			

			
		}
		

		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		
		sc.close();

	}

}
