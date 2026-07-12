/*(Fatoriais) Fatoriais costumam ser utilizados em problemas de probabilidade. O fatorial de um inteiro positivo n 
 * (escrito como n! e pronunciado como “fatorial de n”) é igual ao produto dos números inteiros positivos de 1 a n. 
 * Escreva um aplicativo que calcula os fatoriais de 1 a 20. Utilize o tipo long. Exiba os resultados em formato tabular. 
 * Que dificuldade poderia impedir você de calcular o fatorial de 100?
 */

package capitulo5.exercicios;

public class Questao5p13 {

	public static void main(String[] args) {

		// Cabeçalho da tabela (\t serve para alinhar em colunas)
        System.out.printf("%s\t%s\n", "Número", "Fatorial");
        System.out.println("---------------------------");

        long fatorial = 1; // Elemento neutro da multiplicação, usando long!

        // O loop calcula do 1 até o 20
        for (int i = 1; i <= 20; i++) {
        	
            fatorial *= i; // Pega o fatorial anterior e multiplica pelo número atual
            
            // Exibe a linha atual da tabela
            System.out.printf("%d\t%,26d\n", i, fatorial); 
        }
	}
}
