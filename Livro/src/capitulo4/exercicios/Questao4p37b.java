// b) Escreva um aplicativo que estima o valor da constante matemática e utilizando a fórmula a seguir. Permita ao 
//usuário inserir o número de termos a calcular.
//                        e = 1 + 1/1! + 1/2! + 1/3 + ...

package capitulo4.exercicios;

import java.util.Scanner;

public class Questao4p37b {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Quantos termos de precisão para o número e? ");
		int termos = input.nextInt();

		// validação básica
		if (termos <= 0) {
			System.out.println("Por favor, insira um número maior que zero.");
		} else {
			// e comaça em 1.0 (o primeiro termo da fórmula)
			double e = 1.0;

			// Fatorial começa em 1.0 para o primeiro termo (1!)
			double fatorial = 1.0;

			int i = 1; // Contador de termos
			
			while (i < termos) {
				// PASSO 1: Atualiza o fatorial para o valor atual de "i"
				// Se i = 2, e já tínhamos 1!, agora teremos 1! * 2 = 2!
				fatorial = fatorial * i;
				
				// PASSO 2: Soma a fração 1/i! ao valor de e
				e = e + (1.0 / fatorial);
				
				// PASSO 3: Avança para o próximo termo
				i++;
			}

			System.out.printf("Valor estimado de e com %d termos: %.10f%n", termos, e);
			System.out.println("Valor real de e (aproximado): 2.7182818284");
		}
		input.close();
	}
}