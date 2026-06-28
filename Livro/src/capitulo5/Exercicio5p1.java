package capitulo5;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import capitulo4.DrawPanel;

public class Exercicio5p1 extends JPanel {
	
	// 1. Dentro da sua classe Exercicio5p1 (o seu JPanel), adicione um construtor:
	public Exercicio5p1() {
	    // Define o tamanho ideal do painel para o desenho + uma margem
	    setPreferredSize(new java.awt.Dimension(300, 300));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // Limpa a tela antes de desenhar
		
		// 1. Encontra o centro do painel (fixo)
        int centroX = getWidth() / 2;
        int centroY = getHeight() / 2;

        // 2. O loop controla o crescimento do raio        
        for (int i = 1; i <= 12; i++) {
        	
        	// O raio aumenta 10 pixels a cada passo: 10, 20, 30...
        	int raioAtual = i * 10;
        	
        	// Recalcula a posição a partir do centro para o raio atual
        	int x = centroX - raioAtual;
        	int y = centroY - raioAtual;
        	
        	// O diâmetro é sempre o dobro do raio atual
        	int diametro = raioAtual * 2;
        	
        	// Desenha o círculo perfeitamente centralizado        	
        	g.drawOval(x, y, diametro, diametro);
        }	
	}	
}