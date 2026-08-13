import java.util.Scanner;

public class at05 {

    // Método que calcula e imprime qual número está mais próximo da base
    public static void verificarMaisProximo(double base, double num1, double num2) {
        // Math.abs calcula a distância absoluta (sem sinal negativo)
        double distancia1 = Math.abs(base - num1);
        double distancia2 = Math.abs(base - num2);

        System.out.println("\n--- RESULTADO ---");
        if (distancia1 < distancia2) {
            System.out.printf("O número %.2f está mais próximo da base (%.2f).\n", num1, base);
        } else if (distancia2 < distancia1) {
            System.out.printf("O número %.2f está mais próximo da base (%.2f).\n", num2, base);
        } else {
            System.out.println("Ambos os números estão à mesma distância do número base.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número base: ");
        double base = scanner.nextDouble();

        System.out.print("Digite o primeiro número para comparação: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número para comparação: ");
        double num2 = scanner.nextDouble();

        // Chamada do metodo passando os três valores
        verificarMaisProximo(base, num1, num2);

        scanner.close();
    }
}