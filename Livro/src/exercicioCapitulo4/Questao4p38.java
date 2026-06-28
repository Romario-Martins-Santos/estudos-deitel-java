package exercicioCapitulo4;

import java.util.Scanner;

public class Questao4p38 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Integer of four digits: ");
		int number = input.nextInt();
		
		// Temos que "quebrar" os números em dígitos separados
		int d1 = number / 1000;
		int d2 = (number % 1000) / 100;
		int d3 = (number % 100) / 10;
		int d4 = number % 10;
		
		// substituir cada dígito pelo resultado da adição de 7 ao dígito, obtendo o restante depois da divisão do novo
		// valor  por 10
		
		int d1A = (d1 + 7) % 10;
		
		int d2A = (d2 + 7) % 10;
		
		int d3A = (d3 + 7) % 10;
	
		int d4A = (d4 + 7) % 10;
		
		
		// Trocar o primeiro dígito pelo terceiro
		// Trocar o segundo dígito pelo quarto
		// Imprimir o número criptografado (d3, d1, d4, d2)
		
		int encryptedNumber = (d3A * 1000) + (d4A * 100) + (d1A * 10) + d2A;
		System.out.println(encryptedNumber);
				
		System.out.println();			
	}
}
