/*(Lados de um triângulo direito) Escreva um aplicativo que lê três inteiros diferentes de zero, determina e imprime 
 * se eles poderiam representar os lados de um triângulo direito.
*/
package exercicioCapitulo4;

import java.util.Scanner;

public class Questao4p36 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Entrada de dados com uma breve explicação ao usuário
		System.out.println("Triangle Validity Checker");
		System.out.println("-------------------------");
		
		System.out.print("Enter the first side: ");
		int side1 = input.nextInt();
		
		System.out.print("Enter the second side: ");
		int side2 = input.nextInt();
		
		System.out.print("Enter the third side: ");
		int side3 = input.nextInt();
		
		// Validação: Lados não podem ser zero ou negativos
		if (side1 <=0 || side2 <= 0 || side3 <= 0) {
			System.out.println("Error: Sides must be greater than zero.");
		} else {
			// Aplicação da Desigualdade Triangular
			// A soma de dois lados deve ser SEMPRE maior 
			boolean isTriangule = (side1 + side2 > side3) &&
								  (side1 + side3 > side2) &&
								  (side2 + side3 > side1);
			if (isTriangule) {
				System.out.println("The values can form a triangle!");
				
				boolean isRightTriangule = ((side1 * side1) == (side2 * side2) + (side3 * side3)) ||
											 ((side2 * side2) == (side1 * side1) + (side3 * side3)) ||
											 ((side3 * side3) == (side1 * side1) + (side2 * side2));
				if(isRightTriangule) {
					System.out.println("The triangle IS a Right Triangle!");
				} else {
					System.out.println("The Triangle is NOT a Right Triangle.");
				}
						
			} else {
				System.out.println("The Values Cannot Form a Triangle");
			}								 	
		}
	}
}
