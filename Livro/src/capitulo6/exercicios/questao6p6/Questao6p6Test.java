package capitulo6.exercicios.questao6p6;

import java.util.Scanner;

public class Questao6p6Test {
    
    // O método main é a "porta de entrada" onde o código realmente roda
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);        
        
        Questao6p6 calculadora = new Questao6p6();        
        
        System.out.print("Enter the value radius sphere: ");
        double radius = input.nextDouble();
        
        // 2. Chamamos o método sphereVolume usando o objeto que criamos
        double resultado = calculadora.sphereVolume(radius);
        
        // 3. Exibimos o resultado
        System.out.printf("Volume of the sphere: %.2f%n", resultado);
        
        input.close(); // Boa prática fechar o scanner no final do main
    }
}