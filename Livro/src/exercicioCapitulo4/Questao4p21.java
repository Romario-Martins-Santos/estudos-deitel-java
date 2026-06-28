// determina qual o maior número inteiro
package exercicioCapitulo4;

import java.util.Scanner;

public class Questao4p21 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);     
        
        int counter = 1; // Começamos em 1
        int number; 
        
        // Lemos o primeiro número fora do loop para ter uma base de comparação real
        System.out.print("Enter integer 1: ");
        int largest = input.nextInt(); 
        
        while (counter < 10) {
            System.out.printf("Enter integer %d: ", counter + 1);
            number = input.nextInt();   
            
            if (number > largest) {
                largest = number;           
            }
            counter++;                  
        }
        
        System.out.printf("%nThe largest number found was: %d%n", largest);
    }
}