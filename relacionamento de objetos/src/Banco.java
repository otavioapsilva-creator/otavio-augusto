import java.util.ArrayList;

public class Banco {

    private ArrayList<Conta> contas;

    // Construtor
    public Banco() {
        contas = new ArrayList<>();
    }

    // Adicionar conta
    public void adicionarConta(Conta conta) {

        if (conta == null) {
            throw new IllegalArgumentException(
                    "A conta não pode ser nula."
            );
        }

        contas.add(conta);
    }

    // Listar contas
    public void listarContas() {

        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }
}
