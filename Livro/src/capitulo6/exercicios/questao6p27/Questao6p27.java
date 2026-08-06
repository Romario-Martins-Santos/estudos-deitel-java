/* (Máximo divisor comum) O máximo divisor comum (MDC) de dois inteiros é o maior inteiro que é divisível 
 * por cada um dos dois números. Escreva um método mdc que retorna o máximo divisor comum de dois inteiros. 
 * [Dica: você poderia querer utilizar o algoritmo de Euclides. Você pode encontrar informações sobre isso 
 * em en.wikipedia.org/wiki/Euclidean_algorithm.] Incorpore o método a um aplicativo que lê dois valores 
 * do usuário e exibe o resultado. * 
 */
package capitulo6.exercicios.questao6p27;

import java.util.Scanner;

public class Questao6p27 {

	// Calculates the Greatest  Common Divisor using Euclid's Algorithm
	public static int gcd(int a, int b) {
		while (b != 0) {
			int remainder = a % b;
			a = b;
			b = remainder;
		}
		return a;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first integer: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter the second integer: ");
		int secondNumber = input.nextInt();

		int result = gcd(firstNumber, secondNumber);

		System.out.printf("%nThe Greatest Common Divisor (GCD) of %d and %d is: %d%n",
				firstNumber, secondNumber, result);

		input.close();
	}
}