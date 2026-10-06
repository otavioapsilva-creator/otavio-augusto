import com.sun.security.jgss.GSSUtil;
// Crie um programa que solicite ao usuário que insira um número.
// Se esse número estiver presente na lista, exiba o índice. Caso contrário, informe que não está presente
import java.util.*;

public class at01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> idades = new ArrayList<>();

        idades.add(22);
        idades.add(20);
        idades.add(25);
        idades.add(12);

        System.out.println("insira um numero ");
        int idade = sc.nextInt();
        int indice = idades.indexOf(idade);


        if (indice != -1){
            System.out.println(indice);
        }else {
            System.out.println("falho");
        }
    }
}