
public class at06 {

    // Classe Mercado
    static class Mercado {
        String nome;
        double receitaMacas;
        double receitaLaranjas;

        // Construtor
        Mercado(String nome, double receitaMacas, double receitaLaranjas) {
            this.nome = nome;
            this.receitaMacas = receitaMacas;
            this.receitaLaranjas = receitaLaranjas;
        }

        // Calcula a receita total
        double receitaTotal() {
            return receitaMacas + receitaLaranjas;
        }
    }

    public at06() {
    }

    public static void main(String[] args) {


        Mercado mercado1 = new Mercado("Mercado A", 50000, 30700);
        Mercado mercado2 = new Mercado("Mercado B", 20000, 20000);
        Mercado mercado3 = new Mercado("Mercado C", 60900, 40000);


        Mercado[] mercados = {mercado1, mercado2, mercado3};


        Mercado maiorMacas = mercados[0];

        for (Mercado mercado : mercados) {
            if (mercado.receitaMacas > maiorMacas.receitaMacas) {
                maiorMacas = mercado;
            }
        }

        System.out.println("A) Maior receita vendendo maçãs:");
        System.out.println(maiorMacas.nome + " - R$ " + maiorMacas.receitaMacas);


        Mercado menorLaranjas = mercados[0];

        for (Mercado mercado : mercados) {
            if (mercado.receitaLaranjas < menorLaranjas.receitaLaranjas) {
                menorLaranjas = mercado;
            }
        }

        System.out.println("\nB) Menor receita vendendo laranjas:");
        System.out.println(menorLaranjas.nome + " - R$ " + menorLaranjas.receitaLaranjas);


        double maiorTotal = -1;

        for (Mercado mercado : mercados) {
            if (mercado.receitaTotal() > maiorTotal) {
                maiorTotal = mercado.receitaTotal();
            }
        }


        Mercado segundaMaior = null;
        double segundaMaiorTotal = -1;

        for (Mercado mercado : mercados) {
            double total = mercado.receitaTotal();

            if (total < maiorTotal && total > segundaMaiorTotal) {
                segundaMaiorTotal = total;
                segundaMaior = mercado;
            }
        }

        System.out.println("\nC) Segunda maior receita total:");
        System.out.println(segundaMaior.nome + " - R$ " + segundaMaiorTotal);


        double totalMacas = 0;
        double totalLaranjas = 0;

        for (Mercado mercado : mercados) {
            totalMacas += mercado.receitaMacas;
            totalLaranjas += mercado.receitaLaranjas;
        }




        System.out.println("\nD) Receita total da franquia:");
        System.out.println("Maçãs: R$ " + totalMacas);
        System.out.println("Laranjas: R$ " + totalLaranjas);

        if (totalMacas > totalLaranjas) {
            System.out.println("A franquia teve maior receita vendendo MAÇÃS.");
        } else if (totalLaranjas > totalMacas) {
            System.out.println("A franquia teve maior receita vendendo LARANJAS.");
        } else {
            System.out.println("A receita de maçãs e laranjas foi igual.");
        }

    }

}

