// a) Escreva um aplicativo que lê um inteiro não negativo, calcula e imprime seu fatorial.

package capitulo4.exercicios;

import java.util.Scanner;

public class Questao4p37a {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite um número inteiro não negativo: ");
		int n = input.nextInt();

		// validação básica
		if (n < 0) {
			System.out.println("Erro: O número deve ser não negativo.");
		} else {
			// Guardamos o valor original de n para mostrar no final
			// pois o contador vai mudar durante o loop.
			int originalN = n;

			// Variável acumuladora: COMEÇA EM 1
			// Usamos "long" em vez de int porque o fatorial cresce muito rápido
			long factorial = 1;

			// O LOOP: Vamos multiplicando e diminuindo o n
			while (n > 0) {
				factorial = factorial * n; // Multiplica o resultado atual pelo número 
				n--; // Diminui o número para a próxima rodada (Ex: 5, 4, 3...)
				System.out.println(factorial);
			}

			System.out.printf("%d! = %d%n", originalN, factorial);
		}
		input.close();
	}

}
