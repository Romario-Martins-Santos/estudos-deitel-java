package exercicioCapitulo4;

import java.util.Scanner;
import java.util.stream.LongStream;

public class Questao4p37aComBibliotecaFatorial {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Entre o fatorial que quer calcular: ");
		int n = input.nextInt();
		
        long factorial = LongStream.rangeClosed(1, n)
                                   .reduce(1, (a, b) -> a * b);
        
        System.out.println(factorial);
	}

}
