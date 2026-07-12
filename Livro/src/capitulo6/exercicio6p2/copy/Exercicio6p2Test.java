package capitulo6.exercicio6p2.copy;

import javax.swing.JFrame;

public class Exercicio6p2Test {
	
	public static void main(String[] args) {
		
		Exercicio6p2 panel = new Exercicio6p2();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(230, 250);
		application.setVisible(true);		
		
	}
}