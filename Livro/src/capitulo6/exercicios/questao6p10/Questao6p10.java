package capitulo6.exercicios.questao6p10;

public class Questao6p10 {    
    
    public double roundToInteger(double x) {
        return Math.floor(x + 0.5);        
    }
    
    public double roundToTenths(double x) {
        return Math.floor(x * 10 + 0.5) / 10;
    }    
    
    public double roundToHundredths(double x) {
        return Math.floor(x * 100 + 0.5) / 100; // Corrigido para 100
    }
    
    public double roundToThousandths(double x) {
        return Math.floor(x * 1000 + 0.5) / 1000; // Corrigido para 1000
    }
}