package capitulo5.exercicios;
/*
import java.util.Scanner;

public class Questao5p11 {
	
	public static void main(String[] args) {
		
		int menor = Integer.MAX_VALUE;	
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		
		int n = input.nextInt();
		
		for (int i = n; i >= 1; i--) {
			System.out.print("Enter the next number: ");
			int p = input.nextInt();	
						
			if (p < menor) {
				menor = p;						
			}					
		}
		
		System.out.printf("The smaller number is %d", menor);				
	}
}
*/
import java.util.Scanner;
public class Questao5p11 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// 1. Lê quantos números o usuário vai inserir no total
		System.out.print("Digite a quantidade de números: ");
		int quantidade = input.nextInt();
		
		// 2. Lê o primeiro número da lista e assume que ele é o menor (por enquanto)
		System.out.print("Digite um número: ");
		int primeiroNumero = input.nextInt();
		int menor = primeiroNumero; // <-- Aqui está o truque!
		
		// 3. O loop roda para os números que faltam (quantidade -1)
		for (int i = 1; i < quantidade; i++) {
			System.out.print("Digite o próximo número: ");
			int proximo = input.nextInt();
			
			if (proximo < menor ) {
				menor = proximo; // Atualiza se encontrar um menor de verdade
			}
		}
		
		System.out.printf("The smaller number is %d\n", menor);		
	}
}