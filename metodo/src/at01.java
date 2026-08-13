import java.util.Scanner;

public class at01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("escolha um numero");
        int num = sc.nextInt();
        if (num ==1){
            encontrando1();

        }if (num == 2){
            encontrando2();
        }if (num == 3){
            encontrando3();
        }if (num == 4){
            encontrando4();
        }
    }
    public static void encontrando1(){
        System.out.println("é verão");
        System.out.println("esta quente");
    }
    public static void encontrando2(){
        System.out.println("é inverno");
        System.out.println("esta frio");
    }
    public static void encontrando3(){
        System.out.println("é outono");
        System.out.println("esta um tem fresco");
    }
    public static void encontrando4(){
        System.out.println(" é primavera ");
        System.out.println("o tempo esta perfeito");
    }
}
