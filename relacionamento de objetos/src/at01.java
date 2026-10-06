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
        idades.add(18);


        System.out.println(idades.contains(25));
        System.out.println(idades.contains(13));

        System.out.println(idades.indexOf(22));

        System.out.println(idades.size());
        System.out.println(idades.getLast());

        Collections.sort(idades);

        System.out.println("insira um numero ");
        int idade = sc.nextInt();
        idades.add (idade);
        
    }
}
