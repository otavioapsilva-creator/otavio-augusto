public class At05 {

    public static void main(String[] args) {

        try {

            // Criando o banco
            Banco banco = new Banco();

            // Criando as contas
            Conta contaJoao = new Conta(
                    "João",
                    1000.00
            );

            Conta contaMaria = new Conta(
                    "Maria",
                    500.00
            );

            Conta contaCarlos = new Conta(
                    "Carlos",
                    1500.00
            );

            // Adicionando as contas ao banco
            banco.adicionarConta(contaJoao);
            banco.adicionarConta(contaMaria);
            banco.adicionarConta(contaCarlos);


            // Mostrar contas
            System.out.println("===== CONTAS =====");

            banco.listarContas();


            // Depósito
            System.out.println("\n===== DEPÓSITO =====");

            contaJoao.depositar(500.00);

            System.out.println(
                    "Saldo do João: R$ "
                            + contaJoao.getSaldo()
            );


            // Saque
            System.out.println("\n===== SAQUE =====");

            contaJoao.sacar(200.00);

            System.out.println(
                    "Saldo do João: R$ "
                            + contaJoao.getSaldo()
            );


            // Transferência
            System.out.println("\n===== TRANSFERÊNCIA =====");

            contaJoao.transferir(
                    contaMaria,
                    300.00
            );

            System.out.println(
                    "Saldo do João: R$ "
                            + contaJoao.getSaldo()
            );

            System.out.println(
                    "Saldo da Maria: R$ "
                            + contaMaria.getSaldo()
            );


            // Simulação de investimento
            System.out.println("\n===== INVESTIMENTO =====");

            double resultado = contaJoao.simularInvestimento(
                    1000.00,
                    12
            );

            System.out.printf(
                    "Investindo R$ 1000 por 12 meses: R$ %.2f%n",
                    resultado
            );


            // Mostrar contas no final
            System.out.println("\n===== SALDOS FINAIS =====");

            banco.listarContas();

        } catch (IllegalArgumentException e) {

            System.out.println("Erro: " + e.getMessage());
        }
    }
}