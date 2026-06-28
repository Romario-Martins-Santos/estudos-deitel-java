package capitulo6;

public class ExemploStatic {

    // 1. Variável STATIC (Mundo da Classe - Global)
    public static int contadorStatic = 10;

    // 2. Variável de INSTÂNCIA (Mundo do Objeto - Comum)
    public int contadorComum = 20;

    // =================================================================
    // MÉTODO STATIC (O "main" é sempre static)
    // =================================================================
    public static void main(String[] args) {
        
        System.out.println("--- Executando no Mundo STATIC ---");

        // REGRA 1: static acessa static DIRETO
        contadorStatic = 15; // Funciona!
        metodoStatic();     // Funciona!

        // REGRA 2: static NÃO acessa o comum direto.
        // Se você remover as duas barras (//) da linha abaixo, o Eclipse vai dar ERRO:
        // contadorComum = 50; 
        // metodoComum();      
        
        // Para o static acessar o comum, ele é OBRIGADO a criar um objeto:
        ExemploStatic meuObjeto = new ExemploStatic();
        meuObjeto.contadorComum = 50; // Agora funciona através do objeto!
        meuObjeto.metodoComum();      // Agora funciona através do objeto!
    }

    // Outro método static
    public static void metodoStatic() {
        System.out.println("Acessando o método static direto! Variável static = " + contadorStatic);
    }

    // =================================================================
    // MÉTODO DE INSTÂNCIA (Mundo Comum / Do Objeto)
    // =================================================================
    public void metodoComum() {
        System.out.println("\n--- Executando no Mundo COMUM ---");
        
        // REGRA 3: O comum tem passe livre e acessa TUDO direto!
        contadorComum = 100; // Acessa variável comum direto
        contadorStatic = 200; // Acessa variável static direto!
        
        System.out.println("Método comum executado.");
        System.out.println("Variável Comum: " + contadorComum);
        System.out.println("Variável Static alterada pelo comum: " + contadorStatic);
        
        metodoStatic(); // Chama método static direto!
    }
}