import java.util.Scanner;

public class at03 {


    public static void exibirSequencia(int numeroInicial) {
        System.out.println("Número digitado: " + numeroInicial);
        System.out.println("Os 20 números seguintes são:");

        for (int i = 1; i <= 20; i++) {
            System.out.println(numeroInicial + i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();


        exibirSequencia(numero);


    }
}
