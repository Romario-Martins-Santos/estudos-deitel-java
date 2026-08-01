/* 6.25 (Números primos) Um número inteiro positivo é primo se for divisível apenas por 1 e por ele mesmo. Por exemplo, 2, 3, 5 e 7 são primos, 
mas 4, 6, 8 e 9 não são. O número 1, por definição, não é primo.
a) Escreva um método que determina se um número é primo.
*/
package capitulo6.exercicios.questao6p25;

public class Questao6p25A {	

	/* Abordagem 1: Contador de fatores 
	 * percorre os números de 1 até o próprio número e conta quantos divisores ele tem. 
	 * Se o total de divisores for exatamente 2, ele é primo!		
	 */
//	public static boolean isPrime(int number) {
//		if (number <= 1 ) {
//			return false;  // 1 e números negativos não são primos
//		}
//		int factorCount = 0;
//
//		for (int i = 1; i <= number; i++) {
//			if (number % i == 0) {
//				factorCount++; // Encontrou um divisor!
//			}
//		}
//		// Se encontrou Apenas 2 fatores (1 e ele mesmo), é primo!
//		return factorCount == 2;			
//	}
	
	/* Abordagem 2: Tradução Otimizada ("Corta-Caminho")
	 * Em vez de contar até chegar no final, pense assim: se encontrar QUALQUER divisor entre 2
	 * e number - 1; o número JÁ NÃO É PRIMO.
	 * assim podemos interromper a busca imediatamente (retornando false), sem precisar testar o restante
	 */
	
	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		
		// Procura por algum divisor entre 2 e (number - 1)
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false; // Achou um divisor extra! Não é primo.
			}
		}
		
		return true; // Não achou nenhum divisor intermediário, logo é Primo!
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
