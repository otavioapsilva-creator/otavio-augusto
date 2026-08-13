import javax.swing.*;
import java.util.Scanner;

public class at02 {
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
        System.out.println("wendell");
        System.out.println("4 anos");
    }
    public static void encontrando2(){
        System.out.println("cauan");
        System.out.println("18");
    }
    public static void encontrando3(){
        System.out.println("bruno");
        System.out.println("20");
    }
    public static void encontrando4(){
        System.out.println(" edi ");
        System.out.println("21");
    }
}
