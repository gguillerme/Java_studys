package estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int cod, qnt;
		double valor = 0;
		
		System.out.println("Entre 1 a 5 qual item vc vai querer?");
		cod = sc.nextInt();

		System.out.println("Qual a quantidade?");
		qnt = sc.nextInt();
		
		if(cod == 1) {
			valor = qnt * 4.00;
		}else if (cod == 2) {
			valor = qnt * 4.50;

		}else if (cod == 3) {
			valor = qnt * 5.00;

		}else if (cod == 4) {
			valor = qnt * 2.00;
		
		}else if (cod == 5) {
			valor = qnt * 1.50;
		} else {
			System.out.println("Código " + cod + " Inválido");
		}
		
		if (cod <= 5 && cod > 0) {
			System.out.printf("O total do seu pedido ficou  R$%.2f %n", valor);
		}else {
			System.out.println("Pedido inválido, tente novamente");
		}
	
		
		sc.close();
	}

}
