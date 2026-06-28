package capitulo2;

/*(Aritmética, menor e maior) Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a soma, média, produto e os 
números menores e maiores. Utilize as técnicas mostradas na Figura 2.15. [Observação: o cálculo da média neste exercício deve resultar 
em uma representação de inteiro. Assim, se a soma dos valores for 7, a média deverá ser 2, não 2,3333...]
*/
import java.util.Scanner;

public class AlgoritmoDeMininoEMaximo {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
		int soma;
		int media;
		int produto;
		
		System.out.print("Enter the first number: ");
		number1 = input.nextInt();
		
		System.out.print("Enter the second number: ");
		number2 = input.nextInt();
		
		System.out.print("Enter the third number: ");
		number3 = input.nextInt();
		
		soma = number1 + number2 + number3;
		media = (number1 + number2 + number3) / 3;
		produto = number1 * number2 * number3;
		
		System.out.printf("The sum of %d, %d end %d is %d%n", number1, number2, number3, soma);
		System.out.printf("The average between %d, %d end %d is %d%n", number1, number2, number3, media);
		System.out.printf("The product of %d, %d e %d is %d%n", number1, number2, number3, produto);
		
		int maior = number1;
		int menor = number1;
		
		if (number2 > maior)
			maior = number2;
		
		if (number3 > maior)
			maior = number3;
		
		if (number2 < menor)
			menor = number2;
		
		if (number3 < menor)
			menor = number3;
		
		System.out.printf("The biggest number is %d%n ", maior);
		System.out.printf("The small number is %d%n ", menor);
			
		
	} // fim do método main
} // fim da classe Prov
