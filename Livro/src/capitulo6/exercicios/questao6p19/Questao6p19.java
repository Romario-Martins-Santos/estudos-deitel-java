package capitulo6.exercicios.questao6p19;

import java.util.Scanner;

public class Questao6p19 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o temanho do lado do quadrado: ");
		int lado = input.nextInt();
		
		System.out.print("Informe o caracter que será utilizado para formar o quadrado: ");
		char fill = input.next().charAt(0);
		
		System.out.println(); // Apenas para dar um espaço visual na saída
		
		squareOfAsterisks(lado, fill);
		
		input.close();

	}
	
	public static void squareOfAsterisks(int side, char fill ) {
		// Laço externo: controla o número de LINHAS
		for (int linha = 1; linha <= side; linha++) {
			
			// Laço interno: imprime os CARACTERES de uma linha
			for (int coluna = 1; coluna <= side; coluna++) {
				System.out.print(fill + " ");
			}
			
			// Pula para a próxima linha depois que a linha atual terminar
			System.out.println();
		}
	}
}
