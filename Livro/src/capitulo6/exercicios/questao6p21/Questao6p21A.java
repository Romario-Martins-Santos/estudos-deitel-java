package capitulo6.exercicios.questao6p21;

import java.util.Scanner;

public class Questao6p21A {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("Informe o número divisor inteiro ou [-1] para finalizar: ");
            int divisor = input.nextInt();
            
            // 1. Condição de parada principal
            if (divisor  == -1) {
            	System.out.println("Programa finalizado!");
            	break; //Encerra o laço while imediatamente
            }
            
            // 2. Trava para não permitir zero
            while(divisor == 0) {
            	System.out.println("Erro: O divisor não pode ser zero!");
                System.out.print("Informe um divisor válido (diferente de 0) ou [-1] para sair: ");
                divisor = input.nextInt();
            }
            
            // Se o usuário digitou -1 durante a trava do zero, saímos  do programa
            if (divisor == -1) {
            	System.out.println("Programa finalizado");
            	break;
            }
            
            // 3. Leitura do dividendo só se o divisor for válido
            System.out.print("Informe o número dividendo inteiro: ");
            int dividendo = input.nextInt();
            
            // 4. Executa o cáulculo
            System.out.printf("A parte inteira do quociente é %d%n%n", inteiroQuociente(dividendo, divisor));
		}
		
		input.close();
	}
	
	public static int inteiroQuociente(int a, int b) {
		return a / b;
	}
}
