package capitulo6.exercicios.questao6p21;

import java.util.Scanner;

public class Questao6p21B {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("Informe o número divisor inteiro ou [-1] para finalizar: ");
			int divisor = input.nextInt();
			
			// 1. Condição de parada principal
			if (divisor == -1) {
				System.out.println("Programa finalizado!");
				break;
			}
			
			// 2. Trava para não permitir zero (usando 'while' para insistir até ser válido)
			while (divisor == 0) {
				System.out.println("Erro: o divisor não pode ser ZERO");
				System.out.print("Informe um divisor válido (diferente de 0) ou [-1] para sair: ");
				divisor = input.nextInt();
			}
			
			// Se o usuário digitou -1 durante a trava do zero, saímos do programa
			if (divisor == -1) {
				System.out.println("Programa finalizado!");
				break;
			}
			
			System.out.print("Informe o número dividendo inteiro: ");
			int dividendo = input.nextInt();
			
			// Ajuste no texto da mensagem
			System.out.printf("O resto da divisão inteira é %d%n%n", restoQuociente(dividendo, divisor));
		}
		
		input.close();
	}
	
	public static int restoQuociente(int a, int b) {
	    return a % b; 
	}
}
