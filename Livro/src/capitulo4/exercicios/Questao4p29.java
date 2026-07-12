/*(Quadrado de asteriscos) Escreva um aplicativo que solicita ao usuário que insira o tamanho do lado de um quadrado e, 
 * então, exibe um quadrado vazio desse tamanho com asteriscos. Seu programa deve trabalhar com quadrados de todos os 
 * comprimentos de lado possíveis entre 1 e 20. * 
 */
package capitulo4.exercicios;

import java.util.Scanner;

public class Questao4p29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entre o valor do lado do quadrado (1-20): ");
        int lado = input.nextInt();

        // Validação simples conforme o enunciado
        if (lado >= 1 && lado <= 20) {
            int row = 1;

            // Loop para as linhas
            while (row <= lado) {
                int column = 1;

                // Loop para as colunas
                while (column <= lado) {
                    // Lógica das bordas:
                    // Se for primeira linha, última linha, primeira coluna ou última coluna
                    if (row == 1 || row == lado || column == 1 || column == lado) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                    column++; // Incrementa coluna
                }

                System.out.println(); // Pula para a próxima linha
                row++; // Incrementa linha
            }
        } else {
            System.out.println("O lado deve estar entre 1 e 20.");
        }
        
        input.close();
    }
}