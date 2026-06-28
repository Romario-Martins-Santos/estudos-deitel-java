package exercicioCapitulo5;

import java.util.Scanner;

public class Prov {

    public static void main(String[] args) {
        
        // =========================================================================
        // PARTE 1: METADE SUPERIOR DO LOSANGO (Linhas 1 a 5)
        // =========================================================================
        // O loop externo controla quantas linhas serão impressas na parte de cima.
        for (int linhaMetade1 = 1; linhaMetade1 <= 5; linhaMetade1++) {
            
            // LOOP INTERNO 1 (Espaços de Cima):
            // Começa em 4 espaços na linha 1 e vai diminuindo a cada nova linha.
            // Condição: 'espaco >= linhaMetade1' garante o comportamento decrescente.
            for (int espaco = 4; espaco >= linhaMetade1; espaco--) {
                System.out.print(" "); // Imprime o espaço em branco sem pular linha
            }
            
            // LOOP INTERNO 2 (Asteriscos de Cima):
            // Começa em 1 e vai até o limite determinado pela fórmula ímpar crescente.
            // Fórmula: (2 * linha) - 1 -> Linha 1 = 1, Linha 2 = 3, Linha 3 = 5...
            // ATENÇÃO: Usamos '<=' para que o loop funcione como um contador contínuo.
            for (int asterisco = 1; asterisco <= (2 * linhaMetade1) - 1; asterisco++) {
                System.out.print("*"); // Imprime o asterisco sem pular linha
            }            
            
            // Após desenhar os espaços e os asteriscos da linha atual,
            // quebramos a linha para que a próxima iteração comece na linha de baixo.
            System.out.println();
        }
        
        // =========================================================================
        // PARTE 2: METADE INFERIOR DO LOSANGO (Linhas 1 a 4)
        // =========================================================================
        // O loop externo controla as 4 linhas restantes que fecham o losango.
        for (int linhaMetade2 = 1; linhaMetade2 <= 4; linhaMetade2++) {
            
            // LOOP INTERNO 1 (Espaços de Baixo):
            // Na parte inferior, os espaços começam a crescer (1, depois 2, 3, 4).
            // Condição: 'espaco2 <= linhaMetade2' faz a contagem acompanhar o número da linha.
            for (int espaco2 = 1; espaco2 <= linhaMetade2; espaco2++) {
                System.out.print(" "); // Imprime o espaço em branco sem pular linha
            }
            
            // LOOP INTERNO 2 (Asteriscos de Baixo):
            // Os asteriscos agora precisam diminuir de forma ímpar (7, 5, 3, 1).
            // Fórmula: 9 - (2 * linha) -> Linha 1 = 7, Linha 2 = 5, Linha 3 = 3, Linha 4 = 1.
            // Condição: '<=' garante que o contador comece em 1 e preencha a quantidade exata calculada.
            for (int asterisco2 = 1; asterisco2 <= 9 - (2 * linhaMetade2); asterisco2++) {
                System.out.print("*"); // Imprime o asterisco sem pular linha
            }
            
            // Quebra de linha essencial para separar as linhas da metade inferior.
            System.out.println();
        }        
    } 
}