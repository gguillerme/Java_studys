package saidaEntradaDados;
import java.util.Scanner;

public class exercicio_04 {
	// Fazer um programa que leia o número de um funcionário, seu número de horas
	// trabalhadas, o valor que recebe por
	// hora e calcula o salário desse funcionário. A seguir, mostre o número e o
	// salário do funcionário, com duas casas decimais.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int key;
		double bancoHoras, ganhoHoras, horaExtra;
		
		System.out.println("Qual o nº do seu cracha? ");
		key = sc.nextInt();
		
		System.out.println("Quantos você recebe por hora? ");
		ganhoHoras = sc.nextDouble();

		System.out.println("Quantas horas vc tem no banco? ");
		bancoHoras = sc.nextDouble();

		horaExtra = bancoHoras * ganhoHoras;
		
		System.out.println("ID do funcionário: " + key);
		
		System.out.println("Horas extras R$: " + horaExtra);
		
		sc.close();
	
	
	}

}
