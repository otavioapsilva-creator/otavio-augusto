public class Conta {

    private String nomeTitular;
    private double saldo;


    public Conta(String nomeTitular, double saldo) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }



    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void sacar(double valor) {

        if (valor <= 0) {
            throw new IllegalArgumentException(
                    "O valor do saque deve ser maior que zero."
            );
        }

        if (valor > saldo) {
            throw new IllegalArgumentException(
                    "Saldo insuficiente para realizar o saque."
            );
        }

        saldo -= valor;
    }


    public void depositar(double valor) {

        if (valor <= 0) {
            throw new IllegalArgumentException(
                    "O valor do depósito deve ser maior que zero."
            );
        }

        saldo += valor;
    }


    public void transferir(Conta contaDestino, double valor) {

        if (contaDestino == null) {
            throw new IllegalArgumentException(
                    "A conta de destino não pode ser nula."
            );
        }

        if (valor <= 0) {
            throw new IllegalArgumentException(
                    "O valor da transferência deve ser maior que zero."
            );
        }

        if (valor > saldo) {
            throw new IllegalArgumentException(
                    "Saldo insuficiente para realizar a transferência."
            );
        }

        saldo -= valor;
        contaDestino.saldo += valor;
    }


    public double simularInvestimento(double valor, int meses) {

        if (valor <= 0) {
            throw new IllegalArgumentException(
                    "O valor do investimento deve ser maior que zero."
            );
        }

        if (meses <= 0) {
            throw new IllegalArgumentException(
                    "A quantidade de meses deve ser maior que zero."
            );
        }


        double montante = valor * Math.pow(1.01, meses);

        return montante;
    }


    @Override
    public String toString() {
        return "Conta{" +
                "nomeTitular='" + nomeTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
