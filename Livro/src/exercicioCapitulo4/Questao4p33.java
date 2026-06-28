/*(Múltiplos de 2 com um loop infinito) Escreva um aplicativo que continue exibindo na janela de comando os múltiplos 
 * do inteiro 2 — a saber, 2, 4, 8, 16, 32, 64 e assim por diante. Seu loop não deve terminar (isto é, deve criar um 
 * loop infinito). O que acontece quando você executa esse programa?
 */

package exercicioCapitulo4;

public class Questao4p33 {
	
	public static void main(String[] args) {
		
		int expoente = 1;

        // Loop infinito
        while (true) {
            // O operador '<<' desloca o bit 1 para a esquerda 'expoente' vezes
            // Isso é matematicamente idêntico a 2 elevado ao expoente
            int resultado = 1 << expoente;

            System.out.println(resultado);
            
            expoente++; // Aumenta a potência para a próxima volta
        }
		
	}
}
