import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);

		int teatro1, n_teatro1, teatro2, n_teatro2;
		double valor1, valor2, total;
		
		System.out.print("Escreva o código do primeiro teatro: ");
		teatro1 = sc.nextInt();

		System.out.print("Quantas peças vai querer? ");
		n_teatro1 = sc.nextInt();

		System.out.println("Escreva o valor: ");
		valor1 = sc.nextDouble();

		System.out.print("Escreva o código do segundo teatro: ");
		teatro2 = sc.nextInt();

		System.out.print("Quantas peças vai querer?");
		n_teatro2 = sc.nextInt();
		
		System.out.println("Escreva o valor: ");
		valor2 = sc.nextDouble();

		
		total = (int) (n_teatro1 * valor1 + n_teatro2 * valor2);
		System.out.printf("Valor a pagar: R$ %.f %n", total);

		sc.close();
	}

}
