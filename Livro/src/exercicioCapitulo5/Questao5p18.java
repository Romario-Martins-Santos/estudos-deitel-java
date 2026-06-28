package exercicioCapitulo5;

public class Questao5p18 {
	
	public static void main(String[] args) {
		
		// R$ 1.000,00 transformados em centavos (1000 * 100)
	      long principalCentavos = 100000; 
	      long amountCentavos; // quantia acumulada em centavos	      

	      // Exibe cabeçalhos
	      System.out.printf("%s%20s%n", "Year", "Amount on deposit");

	      // Calcula a quantidade de depósito para cada um dos dez anos
	      for (int year = 1; year <= 10; ++year)                     
	      {                                                          
	         // Em vez de Math.pow, calculamos o juro do ano atual baseando-se no anterior.
	         // Multiplicar por 105 e dividir por 100 aplica um aumento de 5% de forma inteira!
	         principalCentavos = (principalCentavos * 105) / 100;
	         amountCentavos = principalCentavos;
	         
	         // O TRUQUE DO ENUNCIADO ENTRA AQUI:
	         long dolares = amountCentavos / 100;  // Pega a parte inteira (ex: 105)
	         long centavos = amountCentavos % 100; // Pega o resto (ex: 32)
	                                                                    
	         // Exibe o ano, a parte inteira, a vírgula e a parte dos centavos.
	         // O %02d garante que se os centavos forem "5", apareça "05" na tela.
	         System.out.printf("%4d%,17d,%02d%n", year, dolares, centavos);
		}
	}
}