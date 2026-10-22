public class Produto {
private String marca;
private String modelo;
private double preco;
private int qnt_estoque;

    @Override
    public String toString() {
        return "Produto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preço=" + preco +
                ", qnt_estoque=" + qnt_estoque +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()){
            throw new IllegalArgumentException("Marca invalida");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()){
            throw new IllegalArgumentException("modelo invalido");
        }
        this.modelo = modelo;
    }

    public double getPreço() {
        return preco;
    }

    public void setPreço(double preço) {
        if (preco < 0 ){
            throw new IllegalArgumentException("preco invalido");
        }
        this.preco = preço;
    }

    public int getQnt_estoque() {
        return qnt_estoque;
    }

    public void setQnt_estoque(int qnt_estoque) {
        if (qnt_estoque < 0 ){
            throw new IllegalArgumentException("quantidade invalida");
        }
        this.qnt_estoque = qnt_estoque;
    }

    public Produto(String marca, String modelo, double preço, int qnt_estoque) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preço;
        this.qnt_estoque = qnt_estoque;

    }
}
