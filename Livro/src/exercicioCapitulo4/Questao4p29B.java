/*(Quadrado de asteriscos) Escreva um aplicativo que solicita ao usuário que insira o tamanho do lado de um quadrado e, 
 * então, exibe um quadrado vazio desse tamanho com asteriscos. Seu programa deve trabalhar com quadrados de todos os 
 * comprimentos de lado possíveis entre 1 e 20. * 
 */
package exercicioCapitulo4;

import java.util.Scanner;

public class Questao4p29B {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira o lado do quadrado [entre 1 e 20] "); 
		int lado = input.nextInt();
		
		// validar a entrada do usuário
		if (lado >= 1 && lado <= 20) {
			int row = 1;
			
			// Loop para as linhas
			while (row <= lado) {
				int column = 1;
					
				// Loop para as colunas
				while (column <= lado) {
					// Para imprimir "*", precisa que row igual a 1 ou row igual a lado, ou column igual a 1 ou row igual a lado
					if (row ==1 || row ==lado || column == 1 || column == lado) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
					column++;					
				}
				System.out.println();
				row++;
			}
		} else {
			System.out.println("O lado deve estar entre 1 e 20");
		}	
	
		input.close();		
	}
}

