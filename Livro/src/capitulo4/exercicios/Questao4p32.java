/*(Padrão de tabuleiro de damas de asteriscos) Escreva um aplicativo que utiliza apenas as instruções de saída
System.out.print("* ");   
System.out.print(" ");   
System.out.println();
para exibir o padrão de tabuleiro de damas a seguir. Uma chamada de método System.out.println sem argumentos faz com que o pro
grama gere saída de um único caractere de nova linha. [Dica: as instruções de repetição são requeridas.]
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
 */
		
package capitulo4.exercicios;

public class Questao4p32 {
	
	public static void main(String[] args) {
		
int row = 1; // 'asterisk' no seu código
        
        while (row <= 8) {
            int column = 1; // 'space' no seu código
            
            // Se a linha for par, imprime um espaço ANTES de começar os asteriscos
            if (row % 2 == 0) {
                System.out.print(" ");
            }
            
            while (column <= 8) {
                System.out.print("* "); // O comando solicitado
                column++;
            }
            
            System.out.println(); // Pula linha
            row++;
        }
		
	}
}
