/* (Outro problema do else oscilante) Modifique o código dado para produzir a saída mostrada em cada parte do problema. 
 * Utilize técnicas de recuo adequadas. Não faça nenhuma alteração além de inserir chaves e alterar o recuo do código. 
 * O compilador ignora recuo em um programa Java. Eliminamos o recuo do código fornecido para tornar o problema mais 
 * desafiador. [Observação: é possível que não seja necessária nenhuma modificação para algumas das partes.] * 
 */

package capitulo4.exercicios;

public class Questao4p28 {

	public static void main(String[] args) {
		// a)
		/*
		int x = 5;
		int y = 8;

		if (y == 8) {  
			if (x == 5) { 
				System.out.println("@@@@@");
			} else {  
				System.out.println("#####");  
			}
			System.out.println("$$$$$");  
			System.out.println("&&&&&");		
		}
		*/
		
		int x = 2;
		int y = 8;
		
		if (y == 8) { 
			if (x == 5)  
				System.out.println("@@@@@"); 
			}
		else { 
		System.out.println("#####");  
		System.out.println("$$$$$");  
		System.out.println("&&&&&");
		}
	}
}
