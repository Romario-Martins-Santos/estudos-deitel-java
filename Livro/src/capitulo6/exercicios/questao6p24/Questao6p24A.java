/* (Números perfeitos) Dizemos que um número inteiro é um número perfeito se a soma de seus fatores, incluindo 1 (mas não o próprio 
número), for igual ao número. Por exemplo, 6 é um número perfeito porque 6 = 1 + 2 + 3. Escreva um método isPerfect que determina 
se parâmetro number é um número perfeito. Utilize esse método em um applet que determina e exibe todos os números perfeitos entre 1 e 
1.000. Exiba os fatores de cada número perfeito confirmando que ele é de fato perfeito. Desafie o poder de computação do seu computador 
testando números bem maiores que 1.000. Exiba os resultados.
*/

package capitulo6.exercicios.questao6p24;

public class Questao6p24A {

	public static void main(String[] args) {
		
		System.out.println("Testing perfect numbers from 1 to 1000:\n");

		for (int i = 1; i <= 1000; i++) {
			if (isPerfect(i)) {
				System.out.printf("%d is a perfect number! Factors: ", i);
				displayFactors(i);
				System.out.println();
			}
		}
	}

	// Returns true if number is perfect, false otherwise
	public static boolean isPerfect(int number) {
		int sum = 0;

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