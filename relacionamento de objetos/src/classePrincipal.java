public class classePrincipal {

    public static void main(String[] args) {

        veiculo v1 = new veiculo("Honda", "Civic" , "XXX1X11", 2010 , 45000);
        veiculo v2 = new veiculo("Mazda" , "Mx3" , " aaaaaaa" , 1997 , 50000);

        concessionaria c1 = new concessionaria();
        c1.adicionarVeiculo(v1);
        c1.adicionarVeiculo(v2);
        System.out.println(c1.obterVeiculoMaisBarato());
    }
}
