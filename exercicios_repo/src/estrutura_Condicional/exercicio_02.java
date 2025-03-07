package estrutura_Condicional;

import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		int num, result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um numero: ");
		num = sc.nextInt();
		
		result = num % 2;
		System.out.println("result = " + result);
		
		if(result == 0) {
			System.out.println("PAR");	
		}else {
			System.out.println("IMPAR");
		}
		sc.close();
		
	}
}
