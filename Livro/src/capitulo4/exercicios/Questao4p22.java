/*Escreva um aplicativo Java que utiliza um loop para imprimir a seguinte tabela de valores:
 *  N       10*N    100*N   1000*N 
	1       10      100      1000
	2       20      200      2000
	3       30      300      3000
	4       40      400      4000
	5       50      500      5000
 */
package capitulo4.exercicios;

public class Questao4p22 {
	
	public static void main(String[] args) {
		
		int n = 1; // Podemos usar apenas o "n" como contador e valor base
		
		// Usamoso \t (tabulação) ou espaços fixos para o cabeçalho
		System.out.println("N\t10*N\t100*N\t1000*N");
		
		while(n <= 5) {
			// %-10d significa: reserve 10 espaços e alinhe à esquerda
			System.out.printf("%d\t%d\t%d\t%d%n", n, n * 10, n * 100, n * 1000);
			n++; // Incrementa o valor de n
		}		
	}
}
