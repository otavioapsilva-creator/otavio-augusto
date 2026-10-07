public class veiculo {

    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private double preco;

    @Override
    public String toString() {
        return "veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", ano=" + ano +
                ", preco=" + preco +
                '}';
    }

    public veiculo(String marca, String modelo, String placa, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.preco = preco;


    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null ||marca.isBlank()){

            throw  new IllegalArgumentException("erro");
        }
            this.marca = marca;



    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()){
            System.out.println();
        }else{
            this.modelo = modelo;
        }

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
     if (placa == null || placa.isBlank()){

     }else{
         this.placa = placa;
     }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
