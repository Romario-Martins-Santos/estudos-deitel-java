package capitulo5.exercicios;

public class Questao5p29 {
	
	public static void main(String[] args) {
		
		for (int dia = 1; dia <= 12; dia++) {
			
			//---------------------------------------------------------
			// PRIMEIRO SWITCH: Imprime apenas a abertura do dia atual
			//---------------------------------------------------------
			System.out.print("No ");			
			switch (dia) {
				case 1:	 System.out.print("primeiro"); break;
				case 2:	 System.out.print("segundo"); break;
				case 3:	 System.out.print("terceiro"); break;
				case 4:	 System.out.print("quarto"); break;
				case 5:	 System.out.print("quinto"); break;
				case 6:	 System.out.print("sexto"); break;
				case 7:	 System.out.print("sétimo"); break;
				case 8:	 System.out.print("oitavo"); break;
				case 9:	 System.out.print("nono"); break;
				case 10: System.out.print("décimo"); break;				
				case 11: System.out.print("décimo primeiro"); break;
				case 12: System.out.print("décimo segundo"); break;
			}
			System.out.println(" dia de Natal, meu amor me deu:");
			
			//---------------------------------------------------------------
		    // SEGUNDO SWITCH: Os presentes cumulativos (Cascata!)
		    //---------------------------------------------------------------
		    // É aqui que a mágica acontece. Vamos colocar o case 12 no topo
		    // e o case 1 no fundo, SEM a instrução 'break'!
		    //---------------------------------------------------------------
			
			switch (dia) {
				case 12: System.out.println("- Doze tambores rufundo,");
				case 11: System.out.println("- Onze pifeiros tocando,");
				case 10: System.out.println("- Dez senhores saltando,");
				case  9: System.out.println("- Nove damas dançando,");
				case  8: System.out.println("- Oito criadas ordenhando,");
				case  7: System.out.println("- Sete cisnes nadando,");
				case  6: System.out.println("- Seis gansos chocando,");
				case  5: System.out.println("- Cinco anéis de ouro,");
				case  4: System.out.println("- Quatro pássaros cantando,");
				case  3: System.out.println("- Três galinhas francesas,");
				case  2: System.out.println("- Duas rolinhas,");
				case  1: 
					if (dia == 1) {
						System.out.println("- Uma perdiz em uma pereira");
					} else {
						System.out.println("- E uma perdiz em uma pereira");
					}
					break;
			}
			System.out.println();
		}
	}
}
