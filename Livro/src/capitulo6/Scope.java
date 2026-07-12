// Figura 6.9: Scope.java  // A classe Scope demonstra os escopos de campo e de variável local.
package capitulo6;

public class Scope 
{
	// campo acessível para todos os métodos dessa classe
	private static int x = 1;
	
	// O método main cria e inicializa a variável local x
	// e chama os métodos useLocalVariable e useField
	public static void main(String[] args) 
	{
		int x = 5; // variável local x do método sombreia o campo x
		
		System.out.printf("local x in main is %d%n", x);
		
		useLocalVariable(); // useLocalVariable tem uma variável local x
		useField(); // useField utiliza o campo x da classe Scope
		useLocalVariable(); // useLocalVariable reinicializa a variável local x
		useField(); //campo x da classe Scope retém seu valor
		
		System.out.printf("%nlocal x in main is %d%n", x);
		
		// SUA NOVA LINHA AQUI:
				System.out.printf("VALOR FINAL DO CAMPO DA CLASSE: Scope.x vale %d%n", Scope.x);
	}
	
	// cria e inicializa a variável local x durante cada chamada
	public static void useLocalVariable() 
	{
		int x = 25; // inicializada toda  vez que useLocalVariable é chamado
		
		System.out.printf(
				"%nlocal x on entering method useLocalVariable is %d%n", x);
		++x; //modifica a variável local x desse método
		System.out.printf(
				"local x before exiting method useLocalvariable is %d%n", x);		
	}
	
	// modifica o campo x da classe Scope durante cada chamada
	public static void useField() 
	{
		System.out.printf(
				"%nfield x on entering method useFiel is %d%n", x);
		x *= 10; // modifica o campo x da classe Scope
		System.out.printf(
				"fiel x before exiting method useFiel is %d%n", x);		
	}
} // fim da classe Scope
