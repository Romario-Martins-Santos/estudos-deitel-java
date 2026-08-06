package capitulo6.exercicios.questao6p29;

import java.security.SecureRandom;
import java.util.Scanner;

public class Questao6p29 {

	// Enum representing the two sides of a coin
	private enum Coin {
		HEADS, TAILS
	}

	// Simulates tossing a coin and returns a Coin enum constant
	public static Coin flip() {
		SecureRandom randomNumbers = new SecureRandom();

		if (randomNumbers.nextInt(2) == 0) {
			return Coin.HEADS;
		} else {
			return Coin.TAILS;
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int headsCount = 0;
		int tailsCount = 0;

		while (true) {
			System.out.print("To flip the coin type \"Toss Coin\" or \"exit\" to exit: ");
			String entryOption = input.nextLine();

			if (entryOption.equalsIgnoreCase("exit")) {
				System.out.println("\n--- FINAL RESULTS ---");
				System.out.printf("Total HEADS: %d%n", headsCount);
				System.out.printf("Total TAILS: %d%n", tailsCount);
				System.out.println("Program Completed");
				break;

			} else if (entryOption.equalsIgnoreCase("Toss Coin")) {
				Coin result = flip();

				if (result == Coin.HEADS) {
					headsCount++;
				} else {
					tailsCount++;
				}

				System.out.printf("Result: %s | Current Totals -> Heads: %d, Tails: %d%n%n",
						result, headsCount, tailsCount);

			} else {
				System.out.println("Invalid option! Type \"Toss Coin\" to start or \"exit\" to exit.\n");
			}
		}

		input.close();
	}
}