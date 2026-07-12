package capitulo6.exercicio6p2.copy;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

public class Exercicio6p2 extends JPanel{

	@Override
	public void paintComponent(Graphics g) {

		// 1. Limpaa tela antes de desenhar
		super.paintComponent(g);

		// Gerador de números aleatórios
		SecureRandom random = new SecureRandom();

		// Captura a largura e  altura dinâmicas do painel
		int larguraPainel = getWidth();
		int alturaPainel = getHeight();

		// Loop para desenhar as 10 formas aleatórias
		for (int i =0; i < 10; i++) {

			// A. Cria uma cor aleatória (R, G, B entre 0 e 255)
			int r = random.nextInt(256);
			int gColor = random.nextInt(256);
			int b = random.nextInt(256);
			g.setColor(new Color (r, gColor, b));

			// B. Sorteia o tamanho: limitado à metade da largura/altura do painel
			int larguraForma = 1 + random.nextInt(larguraPainel / 2);
			int alturaForma = 1 + random.nextInt(alturaPainel / 2);

			// C. Sorteia a posição (coordenadas X e Y com base no painel)
			int x = random.nextInt(larguraPainel - larguraForma);
			int y = random.nextInt(alturaPainel - alturaForma);

			//D. Decide se  desenha Retângulo (0) ou Oval (1);
			int tipoForma = random.nextInt(2);

			if (tipoForma == 0) {
				g.fillRect(x, y, larguraForma, alturaForma);
			} else {
				g.fillRect(x, y, larguraForma, alturaForma);
			}
		}
	}
}