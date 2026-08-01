/*a) O método celsius retorna o equivalente em Celsius de uma temperatura em Fahrenheit utilizando o cálculo
celsius = 5.0 / 9.0 * (fahrenheit - 32);
 */
package capitulo6.exercicios.questao6p22;

import java.util.Scanner;

public class Questao6p22A {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("Informa a temperatura em Fahrenheit ou [-1] para finalizar: ");
			int fahrenheit = input.nextInt();

			if (fahrenheit == -1) {
				break;	
			}

			System.out.printf("A temperatura %d Fahrenheit equivale a %d° Celsius%n%n",
					fahrenheit, celsius(fahrenheit));
		}

		input.close();
	}

	public static int celsius(int fahrenheit) {
		// 1. (5.0 / 9.0) faz o Java usar 'double' -> dá 0.5555555555555556
		// 2. Multiplica por (100 - 32) -> dá 37.77777777777778 (double)
		// 3. O (int) entra em ação e corta os decimais -> vira 37 (int)

		return (int) (5.0 / 9.0 * (fahrenheit - 32));
	}
}