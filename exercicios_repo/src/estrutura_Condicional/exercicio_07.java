package estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.println("Digite a cordenada de x: ");
		x = sc.nextDouble();
		
		System.out.println("Digite a cordenada de y: ");
		y = sc.nextDouble();
		
		
		if(x > 0) {
			if(y > 0 && y != 0) {
				System.out.println("Q1");
			}else{
				System.out.println("Quadrante está no Eixo X");
			}
			
			if(y < 0) {
				System.out.println("Q4");
				
			}
		}
		if(x < 0) {
			if(y > 0 && y != 0) {
				System.out.println("Q2");
			}else{
				System.out.println("Quadrante está no Eixo Y");
			}
			
			if ( y < 0) {
				System.out.println("Q3");
			}
		}
		
		if(x == 0) {
			if(y != 0 ) {
				System.out.println("Quadrante está no Eixo Y");				
			}
			
		}
		
		if (x == 0 && y == 0) {
			System.out.println("Quadrante Origem");
		}
		
		
		sc.close();
	}

}
