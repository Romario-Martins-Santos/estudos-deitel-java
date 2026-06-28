package exercicioCapitulo5;

public class Questao5p21 {
    
    public static void main(String[] args) {
        
        int totalOcorrencias = 0;
        
        // ETAPA 1: Apenas conta (não imprime nada na tela ainda)
        for (int side1 = 1; side1 <= 500; side1++) {
            for (int side2 = side1; side2 <= 500; side2++) {                
                for (int hypotenuse = side2; hypotenuse <= 500; hypotenuse++) {
                    if (hypotenuse * hypotenuse == (side1 * side1) + (side2 * side2)) {                        
                        totalOcorrencias++; // Descobrimos uma!
                    }                    
                }
            }
        }       
        
        // ETAPA 2: Imprime o cabeçalho com o total descoberto
        System.out.printf("QUANTIDADE DE OCORRÊNCIAS ENCONTRADAS: %d%n", totalOcorrencias);
        System.out.printf("%s\t\t%s\t\t%s%n", "Side1", "Side2", "Hypotenuse");
        System.out.println("---------------------------------------------");
        
        // ETAPA 3: Roda de novo para mostrar os dados na tela
        for (int side1 = 1; side1 <= 500; side1++) {
            for (int side2 = side1; side2 <= 500; side2++) {                
                for (int hypotenuse = side2; hypotenuse <= 500; hypotenuse++) {
                    if (hypotenuse * hypotenuse == (side1 * side1) + (side2 * side2)) {                        
                        System.out.printf("%d\t\t%d\t\t%d%n", side1, side2, hypotenuse);                        
                    }                    
                }
            }
        }       
    }
}
