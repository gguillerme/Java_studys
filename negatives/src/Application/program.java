package Application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantity of numbers: ");

		int n = sc.nextInt();
		int[] vect = new int[n];
		int[] negativeNumber = new int[n];


		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Enter a number: ");
			vect[i] = sc.nextInt();
			if(vect[i]<0) {
				System.out.println("Negative Number!");
				negativeNumber[i] = vect[i];
			}else {
				System.out.println("Positive Number!");
			}

		}

		System.out.println("NEGATIVE NUMBERS: " );
		for (int i=0; i<n; i++) {
			if (negativeNumber[i]<0) {
				System.out.println(negativeNumber[i]);
			}
		}


		sc.close();

	}

}
