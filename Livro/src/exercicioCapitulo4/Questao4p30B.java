/* (Palíndromos) Um palíndromo é uma sequência de caracteres que é lida da esquerda para a direita ou da direita para a 
 * esquerda. Por exemplo, cada um dos seguintes inteiros de cinco dígitos é um palíndromo: 12321, 55555, 45554 e 11611. 
 * Escreva um aplicativo que lê em um inteiro de cinco dígitos e determina se ele é ou não um palíndromo. 
 * Se o número não for de cinco dígitos, exiba uma mensagem de erro e permita que o usuário insira um novo valor.
 */

package exercicioCapitulo4;

import java.util.Scanner;

public class Questao4p30B {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numero = 0;
		boolean entradaValida = false;

		while(!entradaValida) {
			System.out.print("Digite um inteiro de 5 dígitos: ");
			numero = input.nextInt();

			// Um número de 5 dígitos é válido se estiver entre 10000 e 99999
			if (numero >= 10000 && numero <= 99999) {
				entradaValida = true;
			} else {
				System.out.printf("Numero inválido. O número deve ter 5 dígitos");
			}
		}

		int d1 = numero / 10000; // pega o primeiro dígito
		int d2 = (numero % 10000) / 1000; // pega o segundo dígito
		// O terceiro dígito (dígito central) não interfe na definição do palíndromo
		int d4 = (numero % 100) / 10; // pega o quarto dígito
		int d5 = numero % 10; // pega o quinto dígito

		if (d1 == d5 && d2 == d4) {
			System.out.printf("O número %d é um palíndromo!", numero);
		} else {
			System.out.printf("O número %d não é um palíndromo.", numero);
		}

		input.close();
	}
}















