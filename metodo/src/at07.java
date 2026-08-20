
    import java.util.Scanner;

public class at07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 4: ");
        int numero = entrada.nextInt();

        switch (numero) {
            case 1:
                System.out.println(aparecerVerao());
                return;

            case 2:
                System.out.println(aparecerOutono());
                return;

            case 3:
                System.out.println(aparecerInverno());
                return;

            case 4:
                System.out.println(aparecerPrimavera());
                return;

            default:
                System.out.println("Número inválido.");
                return;
        }
    }

    public static String aparecerVerao() {
        return "É verão\ne o tempo está quente.";
    }

    public static String aparecerOutono() {
        return "É outono\ne o tempo está bom.";
    }

    public static String aparecerInverno() {
        return "É inverno\ne o tempo está frio.";
    }

    public static String aparecerPrimavera() {
        return "É primavera\ne o tempo está maravilhoso.";
    }
}
