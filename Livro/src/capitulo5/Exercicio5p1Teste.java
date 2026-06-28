package capitulo5;

import javax.swing.JFrame;

public class Exercicio5p1Teste {
    
    public static void main(String[] args) {
        
        // Instancia a sua classe de desenho corretamente
        Exercicio5p1 oval = new Exercicio5p1();
                
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        application.add(oval); // Adiciona o seu painel de círculos
                
        application.add(oval);
        application.pack(); // O JFrame olha o tamanho do seu JPanel e se molda perfeitamente em volta dele!
        application.setVisible(true); 
    }
}