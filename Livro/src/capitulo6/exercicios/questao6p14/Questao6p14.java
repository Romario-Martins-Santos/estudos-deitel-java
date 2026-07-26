package capitulo6.exercicios.questao6p14;

import java.util.Scanner;

public class Questao6p14 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor da base (inteiro): ");
		int base = input.nextInt();
		
		System.out.print("Digite o valor do expoente (inteiro positivo): ");
		int exponent = input.nextInt();
		
		// Chama o método e armazena o resultado
		int resultado = integerPower(base, exponent);
		
		System.out.printf("%d elevado a %d é: %d%n", base, exponent, resultado);
		
		input.close();
	}
	
	// Método que realiza o cálculo de exponenciação
	public static int integerPower(int base, int exponent) {
		int resultado =  1;
		
		// Multiplica a base por ela mesma "exponent" vezes
		for (int i = 1; i <= exponent; i++) {
			resultado *= base; // O mesmo que: resultado = resultado * base
		}
		
		return resultado;
	}
}