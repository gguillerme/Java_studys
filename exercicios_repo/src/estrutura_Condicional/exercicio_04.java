package estrutura_Condicional;

import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int horIni, horFim, horTotal;

		horIni = sc.nextInt();

		horFim = sc.nextInt();

		if (horIni < horFim) {
			horTotal = horFim - horIni;

		} else {
			horTotal = 24 - (horIni - horFim);
		}
		
		System.out.println("O jogo durou " + horTotal + " hora(s)");
		
		sc.close();
		
	}

}
