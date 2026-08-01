/* b) O método fahrenheit retorna o equivalente em Fahrenheit de uma temperatura em Celsius utilizando o cálculo
fahrenheit = 9.0 / 5.0 * celsius + 32;
 */
package capitulo6.exercicios.questao6p22;

import java.util.Scanner;

public class Questao6p22C {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("Escolha a opção: [1] Fahrenheit -> Celsius | "
					+ "[2] Celsius -> Fahrenheit | [sair] Encerrar: ");

			String entradaOpcao = input.next();

			// 1. Condição de parada flexível (aceita "sair", "SAIR", "Sair" ou apenas "s")
			if (entradaOpcao.equalsIgnoreCase("sair") || entradaOpcao.equalsIgnoreCase("s")) {
				System.out.println("Programa finalizado!");
				break;
			}

			// 2. Opção 1: Fahrenheit -> Celsius
			if (entradaOpcao.equals("1")) {
				System.out.print("Informe a temperatura em Fahrenheit (ex: 100, -1, -20): ");
				int fahrenheit = input.nextInt();
				
				System.out.printf("A temperatura de %d Fahrenheit equivale a %d° Celsius%n%n",
						fahrenheit, Questao6p22A.celsius(fahrenheit));
			
			// 3. Opção 2: Celsius -> Fahrenheit
			} else if (entradaOpcao.equals("2")) {
				System.out.print("Informe a temperatura em Celsius (ex: 37, -1, -15): ");
				int celsius = input.nextInt();
				
				System.out.printf("A temperatura de %d° Celsius equivale a %d Fahrenheit%n%n",
						celsius, Questao6p22B.fahrenheit(celsius));
			
			// 4. Tratamento de opção inválida
			} else {
				System.out.println("Opção inválida! Digite 1, 2 ou 'sair'.\n");
			}
		}

		input.close();
	}
}