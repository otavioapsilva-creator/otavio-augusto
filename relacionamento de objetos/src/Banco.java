import java.util.ArrayList;

public class Banco {

    private ArrayList<Conta> contas;

    // Construtor
    public Banco() {
        contas = new ArrayList<>();
    }

    // Adicionar conta
    public void adicionarConta(Conta c) {

        if (c == null) {
            throw new IllegalArgumentException(
                    "A conta não pode ser nula.");
        }

        contas.add(c);
    }

    // Listar contas
    public void listarContas() {

        for (Conta c : contas) {
            System.out.println(c);
        }
    }
}
