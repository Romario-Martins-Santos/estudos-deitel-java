package capitulo3;
//Figura 3.9 
import java.util.Scanner;

public class NewAccountTest 
{
	public static void main(String[] args) 
	{
		NewAccount account1= new NewAccount("Jane Green", 50.00);
		NewAccount account2= new NewAccount("John Blue", -7.53);
		
		// exibe o saldo inicial de cada objeto
		// Agora chamamos o método diretamente, passando o objeto como argumento
        displayAccount(account1);
        displayAccount(account2);
		
		// cria um Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1: "); // prompt
		double depositAmount = input.nextDouble(); // obtém a entrada do usuário
		System.out.printf("%nadding %.2f to account1 balance%n%n",
				depositAmount);
		account1.deposit(depositAmount); //adiciona o saldo de account1
		
		// exibe os saldos
		// Agora chamamos o método diretamente, passando o objeto como argumento
        displayAccount(account1);
        displayAccount(account2);
		
		System.out.print("Enter deposit amount for account2: "); // prompt
		depositAmount = input.nextDouble(); // obtém a entrada do usuário
		System.out.printf("%nadding %.2f to account2 balance%n%n",
				depositAmount);
		account2.deposit(depositAmount); // adiciona ao saldo account2
		
		// exibe saldos
		// Agora chamamos o método diretamente, passando o objeto como argumento
        displayAccount(account1);
        displayAccount(account2);		
		
	} // fim de main
	
	// Um método static que pertence à classe de teste
    public static void displayAccount(NewAccount accountToDisplay) {
        System.out.printf("%s balance: $%.2f%n", 
            accountToDisplay.getName(), 
            accountToDisplay.getBalance());
    }
	
} 