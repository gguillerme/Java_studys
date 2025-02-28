import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, soma;
		
		System.out.println("Digite o primeiro número :");
		x = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.println("A soma dos números é: "+ soma);
		
		sc.close();
		
	}

}
