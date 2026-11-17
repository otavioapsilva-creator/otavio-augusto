import java.time.LocalDate;
import java.time.Period;

public class exeP {

     private LocalDate dataNascimento;


    public exeP(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public boolean determinarMaiorIdade(){
        int idade =
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento == null || dataNascimento.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Data de nascimento invalida");
        }
        this.dataNascimento = dataNascimento;
    }
}
