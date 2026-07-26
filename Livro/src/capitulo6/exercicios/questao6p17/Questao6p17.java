package capitulo6.exercicios.questao6p17;

import java.util.Scanner;

public class Questao6p17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Informe um número inteiro: ");
		int numero = input.nextInt();

		while (numero != -1) {
			if (isEven(numero))	{
				System.out.printf("O número %d é par%n", numero);
			} else {
				System.out.printf("O número %d é ímpar%n", numero);
			}	

			System.out.print("Informe um número inteiro ou [-1] para sair: ");
			numero = input.nextInt();
		}
		
		input.close();
	}

	public static boolean isEven(int numero) {
		return numero % 2 == 0;
	}
}
