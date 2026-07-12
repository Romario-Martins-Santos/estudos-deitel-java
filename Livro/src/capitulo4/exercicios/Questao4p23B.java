package capitulo4.exercicios;

import java.util.Scanner;

public class Questao4p23B {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int counter = 0;
		int number;
					
		while (counter < 10) {
			System.out.printf("Enter the number %d: ", counter + 1);
			number = input.nextInt();
			
			if (number > largest) {
				secondLargest = largest;
			} else if (largest  > secondLargest) {
				largest = secondLargest;				
			}
			counter++;
		}
		 System.out.printf("The number largest is %d%n", largest);
		 System.out.printf("The runner up is %d", secondLargest);
	}
}
