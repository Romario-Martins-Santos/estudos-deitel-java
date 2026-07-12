package capitulo6.exercicio6p1.copy2;

import javax.swing.JFrame;

public class Exercicio6p1Teste {
	
	public static void main(String[] args) {
		
		Exercicio6p1 panel = new Exercicio6p1();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(230, 250);
		application.setVisible(true);
	}
}
