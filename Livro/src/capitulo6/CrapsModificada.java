// Figura 6.8: Craps.java modificada para acrescenter as regras:
// Regra do Azarado: Se o jogador tirar um 12 (BOX_CARS) logo na primeira rodada, em
// vez de apenas perder, o jogo vai exibir uma mensagem zoando o azar dele.
// Regra da Segunda Chance (O "Milagre do 7"): Quando o jogador estiver no loop (while) 
// tentando atingir o seu ponto, se ele tirar a soma 7, no Craps original ele perde direto. 
// Vamos mudar isso! Se ele tirar 7 e o ponto dele for maior que 9, ele ganha uma segunda chance: 
// o jogo continua! Ele só perde no 7 se o ponto dele for menor ou igual a 9.

package capitulo6;
import java.security.SecureRandom;

public class CrapsModificada 
{
	private static final SecureRandom randomNumbers = new SecureRandom();
	private enum Status {CONTINUE, WON, LOST}
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	public static void main(String[] args) 
	{
		int myPoint = 0; 
		Status gameStatus; 
		
		int sumOfDice = rollDice(); 
		
		switch (sumOfDice) 
		{
		case SEVEN: 
		case YO_LEVEN: 
			gameStatus = Status.WON; 
			break;
		case SNAKE_EYES: 
		case TREY: 
			gameStatus = Status.LOST;
			break;
		case BOX_CARS: // MODIFICAÇÃO 1: Tratando o 12 de forma especial
			gameStatus = Status.LOST;
			System.out.println("Uau, que azar! Tirar 12 de primeira é para poucos.");
			break;
		default: 
			gameStatus = Status.CONTINUE; 
			myPoint = sumOfDice; 
			System.out.printf("Point is %d%n", myPoint);
			break;
		}
		
		while (gameStatus == Status.CONTINUE) 
		{
			sumOfDice = rollDice(); 
			
			if (sumOfDice == myPoint) 
			{
				gameStatus = Status.WON;
			}
			else if (sumOfDice == SEVEN) 
			{
				// MODIFICAÇÃO 2: Aplicando a lógica da Segunda Chance
				if (myPoint > 9) {
					System.out.printf("O 7 te eliminaria, mas seu ponto é %d (maior que 9). Segunda chance concedida!%n", myPoint);
					// Não mudamos o gameStatus, então ele continua como CONTINUE e o loop roda de novo!
				} else {
					gameStatus = Status.LOST; // Se for menor ou igual a 9, perde normalmente
				}
			}
		}
		
		if (gameStatus == Status.WON)
			System.out.println("Player wins");
		else
			System.out.println("Player loses");
	}
	
	public static int rollDice() 
	{
		int die1 = 1 + randomNumbers.nextInt(6); 
		int die2 = 1 + randomNumbers.nextInt(6); 
		int sum = die1 + die2; 
		
		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
		
		return sum;
	}	
}