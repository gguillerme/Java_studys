package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculo calculo = new Calculo();
		
		System.out.println("Digite o nome do funcionário: ");
		calculo.nameCalc = sc.nextLine();
		
		System.out.println("Digite o salário bruto: ");
		calculo.brutoCalc = sc.nextDouble();
		
		System.out.println("Digite as taxas: ");
		calculo.taxasCalc = sc.nextDouble();
		
		
		System.out.println("Empregado: " + calculo.nameCalc + ", $ " + calculo.salarioLiquido());
		
		System.out.println("Qual a porcentagem de aumento do salario?");
		calculo.percentCalc = sc.nextDouble();
		
		System.out.println("Dados atualizados: " + calculo.nameCalc + ", $ " + calculo.aumentoSalario());
		
		sc.close();
		

	}

}
