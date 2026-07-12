/* (Palíndromos) Um palíndromo é uma sequência de caracteres que é lida da esquerda para a direita ou da direita para a 
 * esquerda. Por exemplo, cada um dos seguintes inteiros de cinco dígitos é um palíndromo: 12321, 55555, 45554 e 11611. 
 * Escreva um aplicativo que lê em um inteiro de cinco dígitos e determina se ele é ou não um palíndromo. 
 * Se o número não for de cinco dígitos, exiba uma mensagem de erro e permita que o usuário insira um novo valor.
 */

package capitulo4.exercicios;

import java.util.Scanner;

public class Questao4p30 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero = 0;
		boolean entradaValida = false;
		
		// 1. O "Porteiro": Garante que o usuário digite um número de 5 dígitos 
		while (!entradaValida) {
			System.out.print("Digite um inteiro de cinco dígitos:  ");
			numero = input.nextInt();
			
			// Um número de 5 dígitos está entre 10000 e 99999
			if (numero >= 10000 && numero <= 99999) {
				entradaValida  = true;
			} else {
				System.out.println("Erro: O número de ter exatamente 5 dígitos.");
			}
		}
		
	// 2. A "Cirurgia": Decompondo o número matematicamente
	// Exemplo: 12321
	int d1 = numero / 10000; 		   // Pega o 1
	int d2 = (numero % 10000) / 1000;  // Pega o 2
	// d3 = (numero % 1000) / 100;     // O dígito central não afeta o palíndromo
	int d4 = (numero % 100) / 10;      // Pega o 2
	int d5 = numero % 10; 			   // Pega o 1
	
	// 3. A Verificação: Comparando as extremidades
	if  (d1 == d5 && d2 == d4) {
		System.out.printf("%d  é um palíndromo!%n", numero);		
	} else {
		System.out.printf("%d não é um palíndromo.%n", numero);
		
		input.close();
	}
}
	

	
	
	
	
	
	
	
	
	
	
	

}
