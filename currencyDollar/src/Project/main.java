package Project;
 
import java.util.Scanner;

import util.Convertor;

public class main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Qual o valor do dollar?");
		double valor = sc.nextDouble();
		
		System.out.println("Quantos dolares vai comprar?");
		double compra = sc.nextDouble();
		
		double result = Convertor.conversor(valor, compra);
		System.out.println("Valor a ser pago necessário R$" + result);
		
		
		
		
		sc.close();
	}

}
