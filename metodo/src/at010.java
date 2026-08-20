import java.util.Scanner;

public class at010 {


    public class VerificadorLimite {

        public static boolean estaNosLimites(int numero, int minimo, int maximo) {
            return numero >= minimo && numero <= maximo;
        }

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite o limite mínimo: ");
            int minimo = entrada.nextInt();

            System.out.print("Digite o limite máximo: ");
            int maximo = entrada.nextInt();

            System.out.print("Digite o número que deseja verificar: ");
            int numero = entrada.nextInt();

            if (estaNosLimites(numero, minimo, maximo)) {
                System.out.println(numero + " está nos limites impostos.");
            } else {
                System.out.println(numero + " NÃO está nos limites impostos.");
            }

            entrada.close();
        }
    }
}
