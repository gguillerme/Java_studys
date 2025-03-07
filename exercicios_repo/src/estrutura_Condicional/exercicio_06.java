package estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um número: ");
		double num = sc.nextDouble();
		
		if (num >= 00 && num < 25) {
			System.out.println("Está entre 00 e 25");
		}else if(num >= 25 && num < 50) {
			System.out.println("Está entre 25 e 50");
			
		}else if(num >= 50 && num < 75) {
			System.out.println("Está entre 50 e 75");

		}else if(num >= 75 && num < 100) {
			System.out.println("Está entre 75 e 100");
			
		}else {
			System.out.println("Fora de intervalo");
			
		}
		sc.close();
		
	}

}
