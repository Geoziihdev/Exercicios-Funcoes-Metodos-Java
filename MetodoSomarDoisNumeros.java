package exercicios.funcoes.metodos.basico;

public class MetodoSomarDoisNumeros {

    public static void main(String[] args) {
        // Chama o método soma e imprime o resultado
        int resultado = soma(10, 20);
        System.out.println("A soma de 10 e 20 é: " + resultado);
    }

    // Método para somar dois números inteiros
    public static int soma(int a, int b) {
        return a + b;
    }
}

/* Explicação:
Classe MetodoSomarDoisNumeros: Essa é a classe principal onde o código será executado.
Método main: Esse é o ponto de entrada do programa. Dentro do método main, você chama o método soma passando dois números, 10 e 20, como argumentos e armazena o resultado em uma variável chamada resultado.
Método soma: Esse método recebe dois parâmetros inteiros (a e b), soma-os e retorna o resultado.
Execução:
Quando você rodar o programa, ele chamará o método soma(10, 20), que retornará 30, e esse valor será impresso no console com a mensagem: "A soma de 10 e 20 é: 30".
*/