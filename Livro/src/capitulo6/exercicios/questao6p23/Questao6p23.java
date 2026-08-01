/* (Localize o mínimo) Escreva um método minimum3 que retorna o menor dos três números de ponto flutuante. Utilize o método Math.
min para implementar minimum3. Incorpore o método a um aplicativo que lê três valores do usuário, determina o menor valor e exibe o 
resultado
*/

package capitulo6.exercicios.questao6p23;

import java.util.Scanner;

public class Questao6p23 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("Enter [d] to entere numbers or [s] to exit: ");
			
			String entryOption = input.next();
			if (entryOption.equalsIgnoreCase("s")) {
				System.out.println("Program Completed!");
				break;
				
			} else if (entryOption.equalsIgnoreCase("d")) {
				System.out.print("Enter the first number: ");
				double n1 = input.nextDouble();
				
				System.out.print("Enter the second number: ");
				double n2 = input.nextDouble();
				
				System.out.print("Enter the third number: ");
				double n3 = input.nextDouble();
				
				System.out.printf("The smallest number is %.2f%n%n",
						minimum3(n1, n2, n3));
				
			} else {
				System.out.println("Invalid option! Type 'd' to start or 's' to exit.\n");
			}
		}
		
		input.close();
	}
	
	public static double minimum3(double n1, double n2, double n3) {
		return Math.min(n1, Math.min(n2, n3));
	}
}