package capitulo4;

import java.awt.Color;
// Figura 4.21B: DrawPanel.java  // Utilizando DrawLine para conectar os cantos de um painel.
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel421B extends JPanel {
	// desenha um X a partir dos cantos do painel
	public void paintComponent(Graphics g) {
		// chama paintComponent para assegurar que o painel é exibido corretamente
		super.paintComponent(g);

		int width = getWidth(); // largura total
		int height = getHeight(); // altura total

		int steps = 50; // número de linhas/passos
		int i = 0; // contador

		// Variáveis para calcular o movimento dos pontos
		int widthStep = width / steps; // aqui estamos dividindo a largura por 15 (15 passos). É a distância (e o espaço entre cada marca)
		int heightStep = height / steps; 
		
		// g.drawLine(0, height, width, 0);
		
		
		while (i < steps) {
			// A linha sempre começa em (0, 0)
			// O ponto final se move:
			// X aumenta a cada passo (i * widthStep)
			// Y diminui a partir do fundo (height - (i * heightStep))

			g.setColor(Color.BLUE);
			// Ponto 1: (0, i * heightStep) -> Desce a parede esquerda
			// Ponto 2: (i * widthStep, height) -> Corre pelo chão para a direita
			g.drawLine(0, i * heightStep, i * widthStep, height);
			g.setColor(Color.RED);
			// Ponto 1: ((i * widthStep), 0)
			// Ponto 2: (width, (i * heightStep));
			g.drawLine((i * widthStep), 0, width, (i * heightStep));
			g.setColor(Color.GRAY);
			// Ponto 1: ((width - (i * widthStep)
			// Ponto 2: ((i * weidthStep), (height - (i * heithStep))
			g.drawLine((i * widthStep), 0, 0, (height - (i * heightStep)));
			g.setColor(Color.GREEN);
			// Ponto 1: i * widghtStep, height
			// Ponto 2: width, height - (i * heightStep)
			g.drawLine(i * widthStep, height,  width, height - (i * heightStep));

			i++;
		}			
	}
} 
