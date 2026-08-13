import java.util.Scanner;

public class at04 {


    public static double encontrarMaior(double[] vetor) {
        double maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }


    public static double encontrarMenor(double[] vetor) {
        double menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }


    public static double calcularMedia(double[] vetor) {
        double soma = 0;
        for (double valor : vetor) {
            soma += valor;
        }
        return soma / vetor.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos terá o vetor? ");
        int tamanho = scanner.nextInt();

        if (tamanho <= 0) {
            System.out.println("O tamanho do vetor deve ser maior que zero.");
            scanner.close();
            return;
        }

        double[] numeros = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Digite o %dº elemento: ", i + 1);
            numeros[i] = scanner.nextDouble();
        }


        double maior = encontrarMaior(numeros);
        double menor = encontrarMenor(numeros);
        double media = calcularMedia(numeros);


        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("a) Maior elemento: %.2f\n", maior);
        System.out.printf("b) Menor elemento: %.2f\n", menor);
        System.out.printf("c) Média dos valores: %.2f\n", media);

        scanner.close();
    }
}