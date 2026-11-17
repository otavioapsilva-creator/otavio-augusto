import java.time.LocalDate;
import java.time.Period;

public class exemplo {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        System.out.println(hoje);

        LocalDate dataNascimentoOtavio = LocalDate.of(2009,10,29);
        LocalDate dataNascimentodigo = LocalDate.of(2003,04,02);

        if (dataNascimentoOtavio.isAfter(dataNascimentodigo)){
            System.out.println("Diogo é mais novo");
        }else {
            System.out.println("Otavio é mais novo");
        }
        int idadeDiogo = Period.between(dataNascimentodigo, hoje).getYears();

        System.out.println("o Diogo tem " + idadeDiogo  + " anos ");


    }

}
