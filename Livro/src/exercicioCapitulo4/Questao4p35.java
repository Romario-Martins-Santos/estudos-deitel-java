/*4.35 (Lados de um triângulo) Escreva um aplicativo que lê três valores diferentes de zero inseridos pelo usuário, 
 * determina e imprime se eles poderiam representar os lados de um triângulo.
 */
package exercicioCapitulo4;

import java.util.Scanner;

public class Questao4p35 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Entrada de dados com um breve explicação ao usuário
		System.out.println("Triangle Validity Checker");
		System.out.println("-------------------------");
		
		System.out.println("Enter the first side: ");
		int side1 = input.nextInt();
		
		System.out.println("Enter the second side: ");
		int side2 = input.nextInt();
		
		System.out.println("Enter the third side: ");
		int side3 = input.nextInt();
		
		// Validação: Lados não podem ser zero ou negativos
		if (side1 <=0 || side2 <= 0 || side3 <= 0) {
			System.out.println("Error: Sides must be greater than zero.");
		} else {
			// Aplicação da Desigualdade Triangular
			// A soma de dois lados deve  ser SEMPRE maior que o terceiro
			boolean isTriangle = (side1 + side2 > side3) &&
								(side1 + side3 > side2) &&
								(side2 + side3  > side1);
			if (isTriangle) {
				System.out.println("The values can form a triangle!");
			} else {
				System.out.println("The values cannot form a triangle.");
			}
		}
		input.close();
	}
}
