package capitulo6.exercicios.questao6p28;

import java.util.Scanner;

public class Questao6p28 {

	public static int qualityPoint(int average) {
		// Validates bounds
		if (average > 100 || average < 0) {
			System.out.println("Invalid value! Enter a value between 0 and 100.");	
			return -1; // Interrompe o método e indica valor inválido
		}

		// Cheks grade thresholds using AND (&&)
		if (average >= 90 && average <= 100) {
			return 4;
		} else if (average >= 80 && average <= 89) {			 
			return 3;				
		} else if (average >= 70 && average <= 79) {
			return 2;			
		} else if (average >= 60 && average <= 69) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);			

		while(true) {
			System.out.print("Enter the average or [s] to exit: ");	

			String entryOption = input.next();

			if (entryOption.equalsIgnoreCase("s")) {
				System.out.println("Program Completed!");
				break;
			} else {	
				//  Converts the String Already read into and integer
				int average = Integer.parseInt(entryOption);

				int result = qualityPoint(average);		

				if (result != -1) {
					System.out.printf("The student's grade was %d%n%n", result);

				}
			}
		}
	}
}


