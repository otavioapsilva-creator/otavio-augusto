public class At05 {

    public static void main(String[] args) {
        Conta c1 = new Conta("otavio",10000);
        Conta c2 = new Conta("wendell ", 100000);
        System.out.println(c1.transferir(1000));
        System.out.println(c1);
        System.out.println(c2);