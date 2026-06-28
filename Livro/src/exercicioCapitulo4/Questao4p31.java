/*(Imprimindo o equivalente decimal de um número binário) Escreva um aplicativo que insere um número inteiro que contém 
 * somente 0s e 1s (isto é, um número inteiro binário) e imprime seu equivalente decimal. [Dica: utilize os operadores 
 * de resto e divisão para pegar os dígitos do número binário um de cada vez da direita para a esquerda. No sistema de 
 * números decimais, o dígito mais à direita tem um valor posicional de 1 e o próximo dígito à esquerda um valor 
 * posicional de 10, depois 100, depois 1.000 e assim por diante. O número decimal 234 pode ser interpretado como 
 * 4 * 1 + 3 * 10 + 2 * 100. No sistema de número binário, o dígito mais à direita tem um valor posicional de 1, o 
 * próximo dígito à esquerda um valor posicional de 2, depois 4, depois 8 e assim por diante. O equivalente decimal 
 * do binário 1.101 é 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8 ou 1 + 0 + 4 + 8 ou 13.]
*/

package exercicioCapitulo4;

import java.util.Scanner;

public class Questao4p31 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número binário (somente 0s e 1s): ");
		int binario = input.nextInt();
		
		int copiaBinario = binario; // Guardamos para exibir ao final
		int decimal = 0;           // Onde acumularemos o resultado
		int peso = 1;              // Representa 2^0, 2^1, 2^2...
		
		// O loop continua enquanto ainda houver dígitos para processar
		while (binario!= 0) {
			// 1. Pega o dígito mais à direita
			int digito = binario % 10;			
			
			// 2. Multiplica o dígito pelo peso e soma ao total
			decimal = decimal + (digito * peso);						
			
			// 3. Prepara para o próximo dígito à esquerda
			peso = peso * 2;        // O peso dobra (1, 2, 3, 4, 8...)
			binario = binario / 10; // "Remove" o último digito			
		}
		
		System.out.printf("O equivalente decimal de %d é %d%n", copiaBinario, decimal);
		
		input.close();
	}

}
