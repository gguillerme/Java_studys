package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Escreva a data do produto ");
		
		System.out.print("Nome: ");
		product.setName(sc.nextLine());

		System.out.print("Preço: ");
		product.setPrice(sc.nextDouble());
		
		System.out.println();
		System.out.print("Dados do produto: " + product.toString());
		
		System.out.println();
		System.out.print("Escreva o número de produtos para ser adicionado ao estoque: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Data atualizada: " + product.toString());
		
		System.out.println();
		System.out.print("Escreva o número de produtos para ser removidos do estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Data atualizada: " + product.toString());
		
		sc.close();
	}


}
