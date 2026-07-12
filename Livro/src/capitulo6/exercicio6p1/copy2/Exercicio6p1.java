package capitulo6.exercicio6p1.copy2;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class Exercicio6p1 extends JPanel {	
	
	@Override
	public void paintComponent(Graphics g) 
	{
		// 1. Limpa a tela antes de desenhar
		super.paintComponent(g);
		
		// Gerador de números aleatórios
		SecureRandom random = new SecureRandom();
		
		// ========================================================
        // 2. GERANDO A PRIMEIRA COR ALEATÓRIA (PASSO A PASSO)
        // ========================================================
		int r1 = random.nextInt(256); // Sorteia o Vermelho (0 a 255)
		int g1 = random.nextInt(256); // Sorteia o Verde (0 a 255)
		int b1 = random.nextInt(256); // Sorteia o Azul (0 a 255)
		
		// Chamada ao construtor para FABRICAR a Cor 1
		Color cor1 = new Color(r1, g1, b1);
		
		// ========================================================
        // 3. GERANDO A SEGUNDA COR ALEATÓRIA (PASSO A PASSO)
        // ========================================================
		int r2 = random.nextInt(256);
		int g2 = random.nextInt(256);
		int b2 = random.nextInt(256);
		
		// Chamada ao construtor para FABRICAR a Cor 2
		Color cor2 = new Color(r2, g2, b2);
		
		// ========================================================
        // 4. CONFIGURAÇÃO GEOMÉTRICA DO ALVO
        // ========================================================
		int tamanho = 200; // Tamanho do círculo maior (externo)
		int posicaoX = 10; // Posição X inicial
		int posicaoY = 10; // Posição Y inicial
		
		// ========================================================
        // 5. LOOP PARA DESENHAR AS CAMADAS DO ALVO
        // ========================================================
		for (int i = 0; i < 5; i++) 
		{
			// Alterna as cores usando o resto da divisão (%)
			if (i %2 == 0) {
				g.setColor(cor1); // Se i for par, usa a cor 1
			} else {
				g.setColor(cor2); // Se i for ímpar, usa a cor 2
			}
			
			// Desenha o círculo atual com a cor selecionada
			g.fillOval(posicaoX, posicaoY, tamanho, tamanho);
			
			// Reduz o tamanho do próximo círculo interno
			tamanho -= 40;
			
			// Desloca o X e o Y para manter o círculo centralizado
			posicaoX += 20;
			posicaoY += 20;			
		}		
	}
}
