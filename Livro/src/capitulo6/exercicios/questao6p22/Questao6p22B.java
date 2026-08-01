/*O método fahrenheit retorna o equivalente em Fahrenheit de uma temperatura em Celsius utilizando o cálculo
fahrenheit = 9.0 / 5.0 * celsius + 32;
*/

package capitulo6.exercicios.questao6p22;

import java.util.Scanner;

public class Questao6p22B {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("Informe o valor em graus Celsius ou [-1] para finalizar: ");
			int celsius = input.nextInt();
			
			if (celsius == -1) {
				break;
			}
			
			System.out.printf("%d° equivala a %d Fahrenheit%n%n", celsius, fahrenheit(celsius));
		}
		
		input.close();
	}
	
	public static int fahrenheit(int celsius) {
		return (int) (9.0 / 5.0 * celsius + 32);
	}
}
