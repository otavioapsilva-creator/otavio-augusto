public class at08 {

    public static void main(String[] args) {

        Comtribuente c1 = new Comtribuente("João", "00000000000", "SC", 2800);
        Comtribuente c2 = new Comtribuente("Maria", "11111111111", "PR", 5000);
        Comtribuente c3 = new Comtribuente("Ana", "22222222222", "RS", 10000);
        Comtribuente c4 = new Comtribuente("Carlos", "33333333333", "PR", 27000);
        Comtribuente c5 = new Comtribuente("Jorge", "44444444444", "SC", 38000);

        Comtribuente[] contribuintes = { c1, c2, c3, c4, c5 };

        // Quem mais paga imposto
        double maiorImposto = 0;
        Comtribuente contribuinteMaiorImposto = null;

        for (int i = 0; i < contribuintes.length; i++) {
            if (contribuintes[i].calcularImposto() > maiorImposto) {
                maiorImposto = contribuintes[i].calcularImposto();
                contribuinteMaiorImposto = contribuintes[i];
            }
        }
        System.out.println(contribuinteMaiorImposto);

        // Qual o total de imposto pago entre os 5 contribuintes
        double totalImposto = 0;
        for (int i = 0; i < contribuintes.length; i++) {
            totalImposto += contribuintes[i].calcularImposto();
        }
        System.out.println("O total de imposto pago é de R$" + totalImposto);

    }

}