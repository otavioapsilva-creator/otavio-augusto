public class ClassePrincipal {

    public static void main(String[] args) {

        veiculo v1 = new veiculo();
        v1.marca = "Honda";
        v1.modelo = "civic";
        v1.placa = "67";
        v1.ano = 2010 ;
        v1.preco = 50000;
        System.out.println(v1.marca + "" + v1.modelo );
        veiculo v2 = new veiculo();
        v2.marca = "volkswagen";
        v2.modelo = "Golf GTI";
        v2.placa = "x1x2x3x4";
        v2.ano = 2020;
        v2.preco = 4300000;
    }
}
