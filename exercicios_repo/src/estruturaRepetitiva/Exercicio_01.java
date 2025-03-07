package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pass = 0;
		
		
		do {
			System.out.println("Digite a senha: ");
			pass = sc.nextInt();
			if (pass != 2002) {
				System.out.println("Senha inválida");
			}
		} while (pass != 2002);
		
		System.out.println("Senha correta");
		
		
		
		sc.close();
	}

}
