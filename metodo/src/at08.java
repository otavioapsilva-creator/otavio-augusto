import java.util.Scanner;

public class at08 {


    public static double lerNota(Scanner sc, String mensagem) {
        System.out.print(mensagem);
        return sc.nextDouble();
    }


    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        double nota1 = lerNota(entrada, "Digite a primeira nota: ");
        double nota2 = lerNota(entrada, "Digite a segunda nota: ");
        double nota3 = lerNota(entrada, "Digite a terceira nota: ");


        double media = calcularMedia(nota1, nota2, nota3);

        System.out.println("A média é: " + media);

        entrada.close();
    }
}

