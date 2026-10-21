import java.util.ArrayList;

public class MateriaisConstrucao {

    private ArrayList<Produto> produtos;

    // Construtor
    public MateriaisConstrucao() {
        produtos = new ArrayList<>();
    }

    // Adicionar produto
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // Obter o produto mais caro de uma determinada marca
    public Produto obterProdutoMaisCaro(String marca) {

        Produto produtoMaisCaro = null;

        for (Produto produto : produtos) {

            if (produto.getMarca().equalsIgnoreCase(marca)) {

                if (produtoMaisCaro == null ||
                        produto.getPreco() > produtoMaisCaro.getPreco()) {

                    produtoMaisCaro = produto;
                }
            }
        }

        return produtoMaisCaro;
    }

    // Obter produtos de uma marca dentro de um intervalo de preço
    public ArrayList<Produto> obterProdutosPorMarcaEPreco(
            String marca,
            double valorMinimo,
            double valorMaximo) {

        ArrayList<Produto> resultado = new ArrayList<>();

        for (Produto produto : produtos) {

            if (produto.getMarca().equalsIgnoreCase(marca)
                    && produto.getPreco() >= valorMinimo
                    && produto.getPreco() <= valorMaximo) {

                resultado.add(produto);
            }
        }

        return resultado;
    }

    // Listar todos os produtos
    public void listarProdutos() {

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
