public class Produto {

    private String marca;
    private String modelo;
    private double preco;
    private int quantidadeEstoque;

    // Construtor
    public Produto(String marca, String modelo, double preco, int quantidadeEstoque) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Getters e Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Adicionar unidades ao estoque
    public void adicionarEstoque(int quantidade) {

        if (quantidade <= 0) {
            throw new IllegalArgumentException(
                    "A quantidade deve ser maior que zero."
            );
        }

        quantidadeEstoque += quantidade;
    }

    // Vender produto
    public void vender(int quantidade) {

        if (quantidade <= 0) {
            throw new IllegalArgumentException(
                    "A quantidade deve ser maior que zero."
            );
        }

        if (quantidade > quantidadeEstoque) {
            throw new IllegalArgumentException(
                    "Quantidade insuficiente em estoque."
            );
        }

        quantidadeEstoque -= quantidade;
    }

    // toString
    @Override
    public String toString() {
        return "Produto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }
}
