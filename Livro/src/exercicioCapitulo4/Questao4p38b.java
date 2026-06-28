package exercicioCapitulo4;

import java.util.Scanner;

public class Questao4p38b {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number encrypted: ");
		
		int number = input.nextInt();
		
		// Temos que "quebrar" os números em dígitos separados
		int d1 = number / 1000;
		int d2 = (number % 1000) / 100;
		int d3 = (number % 100) / 10;
		int d4 = number % 10;
		
		// Fazer o retorno ao número original: Dígito Original = (Dígito criptografado + 3) % 10
		
		int do1 = (d1 + 3) % 10;
		int do2 = (d2 + 3) % 10;
		int do3 = (d3 + 3) % 10;
		int do4 = (d4 + 3) % 10;
				
		// Trocar o terceiro dígito pelo primeiro
		// Trocar o quarto dígito pelo segundo
		
		int originalNumber = (do3 * 1000) + (do4 * 100) + (do1 * 10) + do2;
		
		System.out.printf("Número original: %04d%n", originalNumber);		
	}
}
