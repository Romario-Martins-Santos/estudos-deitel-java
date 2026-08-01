/* Desafie o poder de computação do seu computador 
testando números bem maiores que 1.000. Exiba os resultados.

Para resolver o item b, nós fazemos duas coisas:
Aumentamos o limite no laço for.
Medimos o tempo de execução do programa para sentir o impacto no processamento!
 */
package capitulo6.exercicios.questao6p24;

public class Questao6p24B {

	public static void main(String[] args) {

		int  limit = 30000;

		System.out.printf("Testing perfect numbers from 1 to %d:%n%n", limit);

		// 1. Mark start  time
		long startTime = System.currentTimeMillis();

		for (int i = 1; i <= limit; i++) {
			if (isPerfect(i)) {
				System.out.printf("%d is a perfect number! Factors: ", i);
				displayFactors(i);
				System.out.println();
			}
		}

		// 2. Mark en time and calculate duration
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;

		System.out.printf("%nExecution time for limit %d: %d ms%n", limit, duration);
	}

	// Returns true if number is perfect, false otherwise
	public static boolean isPerfect(int number) {
		int sum = 0;

		// Optimization: testing up to number / 2
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}

		return sum == number;
	}

	// Prints all factors/divisors of the given number
	public static void displayFactors(int number) {
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				System.out.printf("%d ", i);
			}
		}
	}
}