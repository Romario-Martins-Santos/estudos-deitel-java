package capitulo6.exercicios.questao6p21;

import java.util.Scanner;

public class Questao6p21C {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("Informe  um número entre 1 e 99999 ou [-1] para sair: ");
			int numero = input.nextInt();
			
			if (numero == -1) {
				System.out.println("Programa finalizado!");
				break;
			}
			
			// Trava  para garantir que o número está dentro do intervalo solicitado
			while (numero < 1 || numero > 99999) {
				System.out.println("Erro: O número deve estar  entre 1 e 99999!");
				System.out.print("Informe um número válido ou [-1] para sair: ");
				numero = input.nextInt();
				
				if (numero == -1) {
					break;
				}
			}
			
			System.out.print("Dígitos separados: ");
			displayDigits(numero);
			System.out.println("\n");
		}
		
		input.close();
	}
	
	// Método solicitado no item c
	public static void displayDigits(int numero) {
		
		// Maior divisor para números até 5 dígitos (99999)
		int divisor  = 10000;
		boolean comecouImprimir = false;
		
		while (divisor >= 1) {
			// Usa o método da parte (a) para pegar o dígitos da esquerda
			int digito = Questao6p21A.inteiroQuociente(numero, divisor);
			
			// Evita imprimir zeros à esquerda (ex.: para 4562, o primeiro dígito dá 0 em 10000)
			if (digito != 0 || comecouImprimir || divisor == 1) {
				System.out.print(digito + "  "); // Imprime o dígito seguido de dois espaços
				comecouImprimir = true;
			}
			
			// Usa o método da parte (b) para obter o resto econtinuar com o próximo dígito
			numero = Questao6p21B.restoQuociente(numero, divisor);
			
			// Reduz o divisor de 10000 -> 1000 -> 100 -> 10 -> 1 usando ométodo da parte (a)
			divisor = Questao6p21A.inteiroQuociente(divisor, 10);
		}
	}

}
