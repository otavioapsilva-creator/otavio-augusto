public class at02 {
   // Crie uma classe denominada Mercado.
    //Essa classe terá 5 atributos, as informações que deverão ser guardadas são:
    // • Nome do mercado
    //• Número de maçãs vendidas por ano.
    //• Preço de venda das maçãs.
    //• Número de laranjas vendidas por ano.
    //• Preço de venda das laranjas.

    public static void main(String[] args) {
        Mercado m1 = new Mercado();
        Mercado m2 = new Mercado();
        Mercado m3 = new Mercado();

        m1.nome = "unidadeDeblumenau";
        m1.nMaca = 500;
        m1.preVmaca = 50000;
        m1.nLaranja = 700;
        m1.preVlaranja = 100000;

        m2.nome = "unidadeDejoinville";
        m2.nMaca = 501;
        m2.preVmaca = 50005;
        m2.nLaranja = 600;
        m2.preVlaranja = 90000;

        m3.nome = "unidadeDeflorianopolis";
        m3.nMaca = 500;
        m3.preVmaca = 50000;
        m3.nLaranja = 700;
        m3.preVlaranja = 100000;
        System.out.println(m1.nome + " " + m1.nMaca + " "+ m1.preVmaca + " " + m1.nLaranja + " " + m1.preVlaranja);
        System.out.println(m2.nome + " " + m2.nMaca + " "+ m2.preVmaca + " " + m2.nLaranja + " " + m2.preVlaranja);
        System.out.println(m3.nome + " " + m3.nMaca + " "+ m3.preVmaca + " " + m3.nLaranja + " " + m3.preVlaranja);
    }
}
