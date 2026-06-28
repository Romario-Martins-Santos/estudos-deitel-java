// 5.12 (Calculando o produto de números inteiros ímpares) Escreva um aplicativo que calcula o produto dos números inteiros ímpares de 1 a 15.

package exercicioCapitulo5;

public class Questao5p12 {
	
	public static void main(String[] args) {
		
		int prod = 1;
				
		for (int i = 1; i <= 15; i += 2) {
			
			prod = prod * i;		
			
			System.out.println(prod);
			
		}
		
		System.out.println();
		
		System.out.println(prod);
	}
}
