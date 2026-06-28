package exercicioCapitulo5;

import java.util.Scanner;

public class Questao5p25 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int numero;
		
		do {
			System.out.print("Informe um número ímpar no intervalor de 1 a 19: ");
			numero = input.nextInt(); 
		} while ((numero > 19 || numero < 1) || numero % 2 == 0);
		
		int metadeSuperior = (numero + 1) / 2;
		int metadeInferior = numero - metadeSuperior;
		
		for (int linhaMetade1 = 1; linhaMetade1 <= metadeSuperior; linhaMetade1++) {
			
			for (int espaco1 = metadeSuperior - 1; espaco1 >= linhaMetade1; espaco1--) {
				
				System.out.print(" ");
			}
			
			for (int asterisco1 = 1; asterisco1 <= (2 * linhaMetade1) - 1; asterisco1++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for (int linhaMetade2 = 1;  linhaMetade2 <= metadeInferior; linhaMetade2++) {
			
			for (int espaco2 = 1; espaco2 <= linhaMetade2; espaco2++) {
				
				System.out.print(" ");
			}
			
			for (int asterisco2 = 1; asterisco2 <= numero - (2 * linhaMetade2); asterisco2++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
