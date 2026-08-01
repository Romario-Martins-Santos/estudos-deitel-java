/* (Números primos) Um número inteiro positivo é primo se for divisível apenas por 1 e por ele mesmo. 
 * Por exemplo, 2, 3, 5 e 7 são primos, mas 4, 6, 8 e 9 não são. O número 1, por definição, não é primo.
c) Inicialmente, você poderia pensar que n/2 é o limite superior que deve ser testado para ver se um número é primo, mas você precisa ir 
apenas até a raiz quadrada de n. Reescreva o programa e execute-o de ambas as maneiras.
*/

package capitulo6.exercicios.questao6p25;

public class Questao6p25C {

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}

		// Optimization: test only up to the square root of number
		for (int i =  2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		int limit = 10000;
		int primeCount = 0;

		System.out.printf("Testing prime numbers below %d:%n%n", limit);

		for  (int i = 1; i < limit; i++) {
			if (isPrime(i)) {
				System.out.printf("%d ", i);
				primeCount++;
			}
		}

		System.out.printf("%n%nTotal prime numbers found: %d%n", primeCount);
	}
}
