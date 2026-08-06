/*(Invertendo dígitos) Escreva um método que recebe um valor inteiro e retorna o número com seus dígitos 
 * invertidos. Por exemplo, dado o número 7.631, o método deve retornar 1.367. 
 * Incorpore o método a um aplicativo que lê um valor a partir da entrada fornecida pelo 
 * usuário e exibe o resultado. 
 */
package capitulo6.exercicios.questao6p26;

import java.util.Scanner;

public class Questao6p26 {

	public static int reverseDigits(int number) {
		int reversed = 0;

		while (number > 0) {
			int digit = number % 10;
			reversed = (reversed * 10) + digit;
			number /= 10;
		}

		return reversed;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

		System.out.print("Enter an integer to reverse: ");
		int number = input.nextInt();

		int reversedNumber = reverseDigits(number);

		System.out.printf("The reversed number of %d is %d%n", number, reversedNumber);

		input.close();
	}
}