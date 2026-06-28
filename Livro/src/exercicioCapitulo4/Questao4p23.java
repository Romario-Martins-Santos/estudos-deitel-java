/*(Encontre os dois números maiores) Utilizando uma abordagem semelhante àquela do Exercício 4.21, encontre os dois maiores valores 
entre os 10 valores inseridos. [Observação: você só pode inserir cada número uma vez.
*/
package exercicioCapitulo4;
import java.util.Scanner;

public class Questao4p23 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		int counter = 0;
		int number;
		int largest = Integer.MIN_VALUE;  // o "campeão"
		int secondLargest = Integer.MIN_VALUE; // o "vice-campeão"
		
		System.out.println("--- Finding the two Largest Numbers ---");
		
		while (counter < 10) {
			System.out.printf("Enter integer %d: ", counter +1);
			number = input.nextInt();
			
			// REGRA 1: O número é maior que o primeiro lugar?
			if (number > largest) {
				// Antes de mudar o primeiro, o antigo primeiro vira o segundo!
				secondLargest = largest;
				largest = number;
			}
			// REGRA 2: Não é maior que o primeiro, mas é maior que o segundo?
			else if (number > secondLargest) {
				secondLargest = number;
			}
			counter++;
		}
		System.out.println("\n--- RESULTS ---");
		System.out.printf("First Largest (Winner): %d%n", largest);
		System.out.printf("Second largest (Runner-up): %d%n", secondLargest);		
	}
}
