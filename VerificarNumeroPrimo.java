package exercicios.funcoes.metodos.basico;

public class VerificarNumeroPrimo {
    public static boolean ehPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(ehPrimo(7));   // Saída: true
        System.out.println(ehPrimo(10));  // Saída: false
    }
}
