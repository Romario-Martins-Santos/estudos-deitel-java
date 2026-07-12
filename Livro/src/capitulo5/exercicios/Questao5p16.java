package capitulo5.exercicios;

import java.util.Scanner;

public class Questao5p16 {
	
	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
        
        System.out.println("Digite 5 números entre 1 e 30:");

        // Loop externo: roda 5 vezes para pegar os 5 números
        for (int contador = 1; contador <= 5; contador++) {
            
            System.out.printf("Número %d: ", contador);
            int n = input.nextInt();
            
            // O SEU RASCUNHO ENTRA EXATAMENTE AQUI!
            // Imprime a quantidade de asteriscos do número digitado
            for (int i = n; i >= 1; i--) {
                System.out.print("*");
            }
            
            // Depois de imprimir os asteriscos do número atual, pula de linha
            System.out.println();
        }	
	}
}
