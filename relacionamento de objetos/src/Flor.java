public class Flor {
    private String nome;
    private double preco;
    private String nome_cliente;


    public Flor(String nome, double preco, String nome_cliente) {
        setNome(nome);
       setPreco(preco);
        setNome_cliente(nome_cliente);
    }

    @Override
    public String toString() {
        return "Flor{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", nome_cliente='" + nome_cliente + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("nome invalido");
        }

        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0){
            throw new IllegalArgumentException("preço invalido");
        }
        this.preco = preco;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        if (nome_cliente == null || nome_cliente.isBlank()){
            throw new IllegalArgumentException("cliente invALIDO");
        }
        this.nome_cliente = nome_cliente;
    }
}
