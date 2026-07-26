package capitulo6.exercicios.questao6p18;

import java.util.Scanner;

public class Questao6p18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Informe o tamanho do lado do quadradro: ");
		int lado = input.nextInt();

		System.out.println(); // Linha em branco para organizar a saída

		// Chamamos o método void para imprimir
		squareOfAsterisks(lado);

		input.close();		
	}

	public static void squareOfAsterisks(int side) {
		// Laço externo: controla o número de LINHAS
		for (int linha = 1;  linha <= side; linha++) {

			// Laço interno: imprime os  ASTERISCOS de uma  linha
			for (int coluna = 1; coluna <= side; coluna++) {
				System.out.print("* ");
			}

			// Pula para a próxima linha depois que a linha atual terminar
			System.out.println();			
		}
	}
}
