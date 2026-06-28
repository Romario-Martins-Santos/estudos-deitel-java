package capitulo3;
import java.time.LocalDate; // Importa a classe de data moderna

public class JavaModernoTest {
    public static void main(String[] args) {
        // Criando uma data (Ano, Mês, Dia)
        LocalDate data = LocalDate.of(1969, 9, 7);
        
        // Exibindo (o padrão é AAAA-MM-DD)
        System.out.println("Data padrão ISO: " + data);
        
        // Usando métodos "get" prontos:
        int ano = data.getYear();
        int mes = data.getMonthValue();
        
        System.out.println("Ano: " + ano + " | Mês: " + mes);
    }
}