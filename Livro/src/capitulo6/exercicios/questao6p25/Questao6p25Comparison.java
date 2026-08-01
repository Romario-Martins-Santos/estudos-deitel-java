package capitulo6.exercicios.questao6p25;

public class Questao6p25Comparison {

	public static void main(String[] args) {

		int limit = 30000; // Testing primes below 30,000

		System.out.printf("Comparing performance for prime numbers below %d...%n%n", limit);

		// 1. Measure Standard Approach (i < number)
		long startTime1 = System.nanoTime();
		int count1 = 0;
		for (int i = 1; i < limit; i++) {
			if (isPrimeStandard(i)) {
				count1++;
			}
		}
		long endTime1 = System.nanoTime();
		double duration1InMs = (endTime1 - startTime1) / 1_000_000.0;

		// 2. Measure Optimized Approach (i <= Math.sqrt(number))
		long startTime2 = System.nanoTime();
		int count2 = 0;
		for (int i = 1; i < limit; i++) {
			if (isPrimeOptimized(i)) {
				count2++;
			}
		}
		long endTime2 = System.nanoTime();
		double duration2InMs = (endTime2 - startTime2) / 1_000_000.0;

		// 3. Print Results
		System.out.printf("Standard method (i < n):       %.2f ms (Primes found: %d)%n", duration1InMs, count1);
		System.out.printf("Optimized method (Math.sqrt):  %.2f ms (Primes found: %d)%n", duration2InMs, count2);

		double speedup = duration1InMs / duration2InMs;
		System.out.printf("%nThe Math.sqrt approach was %.1fx faster!%n", speedup);
	}

	// Standard approach: tests up to (number - 1)
	public static boolean isPrimeStandard(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

	// Optimized approach: tests only up to Math.sqrt(number)
	public static boolean isPrimeOptimized(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
}