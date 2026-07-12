/* (Validando entrada de usuário) Modifique o programa na Figura 4.12 para validar suas entradas.  * Para qualquer entrada, 
 * se o valor entrado for diferente de 1 ou 2, continue o loop até o usuário inserir um valor correto.
 */
package capitulo4.exercicios;

import java.util.Scanner;

public class Questao4p24 {

	public static void main(String[] args) {

		// cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);

		// inicializando variáveis nas declarações
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;

		// processa 10 alunos utilizando o loop controlado por contador
		while (studentCounter <= 10) {
		    System.out.print("Enter result (1 = pass, 2 = fail): ");
		    int result = input.nextInt();

		    // Verificamos se o valor é válido (1 ou 2)
		    if (result == 1 || result == 2) {
		        
		        // Se for válido, processamos normalmente
		        if (result == 1) {
		            passes = passes + 1;
		        } else {
		            failures = failures + 1;
		        }

		        // SÓ incrementamos o contador se o valor foi 1 ou 2
		        studentCounter = studentCounter + 1;

		    } else {
		        // Se for inválido, avisamos e NÃO mexemos no studentCounter
		        // Assim, o while vai rodar de novo para o MESMO aluno
		        System.out.println("Invalid Value. Please try again.");
		    }
		}

		// fase de término; prepara e exibe os resultados
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

		// determina se mais de 8 alunos foram aprovados
		if (passes > 8)
			System.out.println("Bonus to instructor!");

	} 
}


