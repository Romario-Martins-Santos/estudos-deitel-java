package capitulo4;

// Figura 4.18: DrawPanel.java  // Utilizando DrawLine para conectar os cantos de um painel.
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel41 extends JPanel {
	// desenha um X a partir dos cantos do painel
	public void paintComponent(Graphics g) {
		// chama paintComponent para assegurar que o painel é exibido corretamente
		super.paintComponent(g);

		int width = getWidth(); // largura total
		int height = getHeight(); // altura total

		int steps = 15; // número de linhas/passos
		int i = 0; // contador

		// Variáveis para calcular o movimento dos pontos
		int widthStep = width / steps; // aqui estamos dividindo a largura por 15 (15 passos). É a distância (e o espaço entre cada marca)
		int heightStep = height / steps; 
		
		g.drawLine(0, height, width, 0);

		while (i < steps) {
			// A linha sempre começa em (0, 0)
			// O ponto final se move:
			// 
			// Y diminui a partir do fundo (height - (i * heightStep))

			g.drawLine(0, 0, i * widthStep, height - (i * heightStep));

			i++;
		}
	}
} // fim da classe DrawPanel
