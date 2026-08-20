public class at09 {
    public class Verificador {


        public static boolean ehPar(int numero) {
            return numero % 2 == 0;
        }

        public static void main(String[] args) {
            int numero1 = 4;
            int numero2 = 7;

            System.out.println(numero1 + " é par? " + ehPar(numero1)); // true
            System.out.println(numero2 + " é par? " + ehPar(numero2)); // false
        }
    }
}
