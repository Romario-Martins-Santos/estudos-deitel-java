// Figura 4.19: DrawPanelTest.java   // Criando JFrame para exibir um DrawPanel.
package capitulo4;
import javax.swing.JFrame;

public class ProvTest 
{
	public static void main(String[] args) 
	{
		// Você precisa criar o seu painel de desenho primeiro
		Prov prov = new Prov();
		
		// cria um novo quadro para armazenar o painel
		JFrame application = new JFrame();
		
		// configura o frame para ser encerrado quando ele é fechado
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(prov); // adiciona o painel ao frame
		application.setSize(250, 250); // configura o tamanho do frame
		application.setVisible(true); // torna o frame visível 
		
	}
}
