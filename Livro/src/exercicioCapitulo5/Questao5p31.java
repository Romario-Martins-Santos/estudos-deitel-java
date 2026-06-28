package exercicioCapitulo5;

import java.util.Scanner;

public class Questao5p31 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int acertos = 0;
		int resposta;
		
		System.out.println("====================================================");
        System.out.println("   QUESTIONÁRIO SOBRE FATOS DO AQUECIMENTO GLOBAL   ");
        System.out.println("====================================================\n");
		
        // -----------------------------------------------------------------
        // PERGUNTA 1
        // -----------------------------------------------------------------
        
        System.out.println("Pergunta 1: Qual é a posição oficial do Painel Intergovernamental");
        System.out.println("sobre Mudanças Climáticas (IPCC) da ONU a respeito do aquecimento global?");
        System.out.println("1) É um fenômeno exclusivamente causado por ciclos solares e atividade vulcânica.");
        System.out.println("2) É impulsionado predominantemente pelas emissões humanas de gases de efeito estufa.");
        System.out.println("3) O planeta não passou por nenhuma alteração mensurável de temperatura nos últimos 150 anos.");
        System.out.println("4) O resfriamento global é a principal tendência climática observada atualmente.");
        System.out.print("Sua resposta (1-4): ");
        resposta = input.nextInt();
        
        if (resposta == 2) {
        	acertos++;
        }
        System.out.println(); // Linha em branco
        
        // -----------------------------------------------------------------
        // PERGUNTA 2
        // -----------------------------------------------------------------
        
        System.out.println("Pergunta 2: Qual é um dos principais argumentos técnicos utilizados");
        System.out.println("por cientistas céticos do clima (como os físicos Richard Lindzen e Roy Spencer)?");
        System.out.println("1) Os níveis de CO2 na atmosfera diminuíram drasticamente desde a Revolução Industrial.");
        System.out.println("2) O efeito estufa não existe e a atmosfera da Terra retém zero calor.");
        System.out.println("3) Os modelos climáticos computacionais superestimam a sensibilidade climática ao CO2.");
        System.out.println("4) A temperatura da Terra é controlada inteiramente pela distância exata da Lua.");
        System.out.print("Sua resposta (1-4): ");
        resposta = input.nextInt();
        
        if (resposta == 3) {
        	acertos++;
        }
        System.out.println(); // Linha em branco
        
        // -----------------------------------------------------------------
        // PERGUNTA 3
        // -----------------------------------------------------------------
        
        System.out.println("Pergunta 3: O que registros geológicos e de testemunhos de gelo (ice cores)");
        System.out.println("revelam sobre os níveis de CO2 e as temperaturas no passado profundo da Terra (milhões de anos atrás)?");
        System.out.println("1) A Terra sempre manteve uma temperatura fixa de 14°C e níveis constantes de CO2");
        System.out.println("2) O planeta já passou por períodos com concentrações de CO2 e temperaturas "
        		+ "significativamente maiores do que as atuais, muito antes do surgimento do homem. ");
        System.out.println("3) O CO2 apareceu na atmosfera da Terra pela primeira vez no século XX");
        System.out.println("4) Períodos glaciais (eras do gelo) apresentavam os maiores níveis de gases de efeito estufa da história.");
        resposta = input.nextInt();
        
        if (resposta == 2) {
        	acertos++;        	
        }
        System.out.println();
        
        // -----------------------------------------------------------------
        // PERGUNTA 4
        // -----------------------------------------------------------------
        
        System.out.println("Pergunta 4: Qual indicador físico é amplamente citado por defensores do consenso");
        System.out.println("científico como evidência empírica do aquecimento global nas últimas décadas?");
        System.out.println("1) A redução da extensão do gelo marinho no Ártico e o recuo geral de geleiras continentais.");
        System.out.println("2) O aumento maciço e generalizado da espessura das geleiras na Groenlândia Central.");
        System.out.println("3) A paralisação completa das marés e das correntes oceânicas globais.");
        System.out.println("4) A diminuição total do nível médio dos oceanos globalmente.");
        resposta = input.nextInt();
        
        if (resposta == 1) {
        	acertos++;
        }
        System.out.println();
        
        // -----------------------------------------------------------------
        // PERGUNTA 5
        // -----------------------------------------------------------------
        
        System.out.println("Pergunta 5: Como cientistas que propõem explicações alternativas avaliam a correlação");
        System.out.println("entre o aumento de temperatura do século XX e a atividade humana?");
        System.out.println("1) Eles afirmam que o século XX foi a era mais fria dos últimos 10 mil anos.");
        System.out.println("2) Eles defendem que variações na atividade solar (irradiância), nos raios cósmicos e em");
        System.out.println("ciclos oceânicos de longo prazo (como a Oscilação Decadal do Pacífico) desempenham");
        System.out.println("um papel muito maior do que o reconhecido.");
        System.out.println("3) Eles acreditam que as temperaturas mundiais são medidas apenas em cidades desérticas para forjar os dados.");
        System.out.println("4) Eles alegam que o calor é gerado puramente pelo atrito de satélites na órbita terrestre.");
        resposta = input.nextInt();
        
        if (resposta == 2) {
        	acertos++;
        }
        
        // -----------------------------------------------------------------
        // BLOCO DE AVALIAÇÃO FINAL (Feedback exigido pelo Deitel)
        // -----------------------------------------------------------------
        
        System.out.println("====================================================");
        System.out.printf("Fim do questionário! Você acertou %d de 5 perguntas.%n", acertos);
        System.out.println("====================================================\n");
        
        if (acertos == 5) {
        	System.out.println("Resultados: Excelente!");        	
        } else if (acertos == 4) {
        	System.out.println("Resultado: Muito bom!");
        } else {
        	System.out.println("Resultado: É o momento de aprimorar seu conhecimento sobre o aquecimento global.\n");
            System.out.println("Visite estes sites para estudar os fatos e visões de ambos os lados:");
            System.out.println("1) Consenso Científico (IPCC / ONU): https://www.ipcc.ch");
            System.out.println("2) Visão Cética e Dados de Satélite (Dr. Roy Spencer): https://www.drroyspencer.com");
            System.out.println("3) Monitoramento de Clima Global (UAH): https://www.nsstc.uah.edu/climate");
            System.out.println("4) Artigos de Revisão Científica (Climate Change Reconsidered): https://www.heartland.org");
        }
        
        input.close(); // Fecha o Scanner de forma segura
	} // Fim do método main
} // Fim da classe
