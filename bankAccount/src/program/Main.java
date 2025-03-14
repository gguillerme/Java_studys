package program;

import java.util.Locale;
import java.util.Scanner;

import utils.Program;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		Program program = new Program();
		
		System.out.println("Enter account number: ");
		program.setAccountNumber(sc.nextInt());
		
        sc.nextLine(); //Limpa o buffer
		
		System.out.println("Digite o seu nome: ")
		;
		program.setAccountName(sc.nextLine());
		
		System.out.println("Quer fazer o depósito inicial (yes/no)?");
		String accountQuestion = sc.nextLine();
		
		if(accountQuestion.equals("yes")) {
			System.out.println("Digite o depósito inicial: ");
			program.setAccountValue(sc.nextDouble());
			
		} else { 
			System.out.println("Você optou por não fazer o depósito inicial");
			
		}
		
		
		System.out.println("Account dat"
				+ "a: ");
		System.out.println("Account " + program.getAccountNumber() + " Holder: " + program.getAccountName() + ", Balance: $" + program.getAccountInicialDeposit());
	
		System.out.println("Enter a deposit value: ");
		program.setAccountDeposit(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.println("Account " + program.getAccountNumber() + " Holder: " + program.getAccountName() + ", Balance: $" + program.AccountDepositValue());

		System.out.println("Enter a withdraw value: ");
		program.setAccountWithdraw(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.println("Account " + program.getAccountNumber() + " Holder: " + program.getAccountName() + ", Balance: $" + program.AccountWithdrawValue());
		

		sc.close();

	}

}
