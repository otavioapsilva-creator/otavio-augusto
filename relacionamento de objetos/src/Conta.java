public class Conta {

    private String nomeTitular;
    private double saldo;

    public Conta(String nomeTitular, double saldo) {
        setNomeTitular(nomeTitular);
       setSaldo(saldo);
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        if (nomeTitular == null || nomeTitular.isBlank()) {
            throw new IllegalArgumentException("nome invalidao");
        }
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("saldo invalido");
        }
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nomeTitular='" + nomeTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public void sacar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("valor invalido");
        }
        if (valor > saldo) {
            throw new IllegalArgumentException("saldo insuficiente para realizar o saque");
        }
        saldo -= valor;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("o valor do deposito deve ser maoir que zero");
        }
        saldo += valor;

    }

    public void transferir(Conta contaDestino , double valor ) {
        if (contaDestino == null || valor <= 0 || valor > saldo ) {
            throw new IllegalArgumentException("a conta destino não podde ser nula");
        }

        saldo -= valor;
        contaDestino.saldo += valor;
    }

    public double simularInvestimento(double valor, int meses) {

        if (valor <= 0) {
            throw new IllegalArgumentException(
                    "O valor do investimento deve ser maior que zero.");
        }

        if (meses <= 0) {
            throw new IllegalArgumentException(
                    "A quantidade de meses deve ser maior que zero.");
        }


        double montante = valor * Math.pow(1.01, meses);

        return montante;

    }
}
