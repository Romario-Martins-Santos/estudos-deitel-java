package capitulo6;

import javax.swing.JFrame;

public class CriandoJanela {
	
	public static void main(String[] args) {
		
		// 1. Criamos a estrutura da janela na memória
		JFrame janela = new JFrame("Java é meu alvo");
		
		// 2. Dizemos o que acontece ao clicar no 'X' (fechar o programa de verdade)
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 3. Definimos o tamanho dela em pixels (Largura, Altura)
		janela.setSize(400, 300);
		
		// 4. A mágica! Porpadrão ela nasce invisível, aqui nós a tornamos visível
		janela.setVisible(true);
	}
}
