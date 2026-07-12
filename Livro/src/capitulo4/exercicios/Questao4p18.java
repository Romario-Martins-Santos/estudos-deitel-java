// Determina se um cliente de uma loja de departamentos excedeu o limite de crédito em uma conta-corrente
package capitulo4.exercicios;

import java.util.Scanner;

public class Questao4p18 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int accountNumber = 0;
		int beginningBalance = 0;
		int totalCharges = 0;
		int totalCredits  = 0;
		int creditLimit = 0;
		int newBalance = 0;
		
		System.out.print("Enter the account number (or -1 to quit): ");
		accountNumber = input.nextInt();
		
		while(accountNumber != -1) {
			System.out.print("Enter beginning balance: ");
			beginningBalance = input.nextInt();
			
			System.out.print("Enter total charges: ");
			totalCharges = input.nextInt();
			
			System.out.print("Enter total credits: ");
			totalCredits = input.nextInt();
			
			System.out.print("Enter authorized credit limit: ");
			creditLimit = input.nextInt();			
			
			// Calculo do novo saldo
			newBalance = beginningBalance + totalCharges - totalCredits;
			
			System.out.printf("%nAccount: %d%n", accountNumber);
			System.out.printf("New balance is: %d%n", newBalance);
			
			// Verifica se o saldo estourou o limite			
			if (newBalance > creditLimit) {
				int amountExceeded = newBalance - creditLimit; // calcula a diferença
				System.out.println("Credit Limit Exceeded!");	
				System.out.printf("You went over your limit by: %d%n", amountExceeded);
			}	
			
			System.out.println();
			
			System.out.print("Enter the account number (or -1 to quit): ");
			accountNumber = input.nextInt();			
					
		}		
	}
}
