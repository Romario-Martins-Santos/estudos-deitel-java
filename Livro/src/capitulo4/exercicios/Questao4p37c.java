//Escreva um aplicativo que computa o valor de e x utilizando a fórmula a seguir. 
// Permita ao usuário inserir o número de termos a calcular
//                        e^x = 1 + x/1! + x^2/2! + x^3/3 + ...

package capitulo4.exercicios;

import java.util.Scanner;

public class Questao4p37c {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite o valor de x para e^x: ? ");
		double x = input.nextDouble();
		
		System.out.print("Quantos termos de precisão? ");
		int termos = input.nextInt();

		// validação básica
		if (termos <= 0) {
			System.out.println("Insira um número maior que zero.");
		} else {
			double ex= 1.0;        // O acumulador de soma
			double fatorial = 1.0; // O cumulador do fatorial
			double potencia = 1.0; // O acumulador da potência (x, x^2, x^3...)

			int i = 1; // Contador de termos
			
			while (i < termos) {
				fatorial *= i;              // Atualiza o fatorial (1!, 2!, 3!...)
				potencia *= x;              // Atualiza a potência (x^1, x^2, x^3...)
				
				ex += (potencia / fatorial); // A "Linha Mágica" atualizada
								
				i++;
			}

			System.out.printf("e^%.2f estimado: %.10f%n", x, ex);
			System.out.printf("Valor real (Math.exp):  %.10f%n", Math.exp(x));
		}
		input.close();
	}
}