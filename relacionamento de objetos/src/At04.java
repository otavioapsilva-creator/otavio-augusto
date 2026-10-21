import java.util.ArrayList;

public class At04 {

    public static void main(String[] args) {

        MateriaisConstrucao materiais = new MateriaisConstrucao();

        try {

            // Criando os produtos
            Produto produto1 = new Produto("Bosch", "Furadeira", 350.00, 10);

            Produto produto2 = new Produto("Bosch", "Serra Circular", 600.00, 5);

            Produto produto3 = new Produto("Bosch", "Parafusadeira", 450.00, 8);

            Produto produto4 = new Produto("Makita", "Furadeira", 500.00, 7);

            Produto produto5 = new Produto("Makita", "Serra", 750.00, 4);


            // Adicionando os produtos
            materiais.adicionarProduto(produto1);
            materiais.adicionarProduto(produto2);
            materiais.adicionarProduto(produto3);
            materiais.adicionarProduto(produto4);
            materiais.adicionarProduto(produto5);


            // Mostrar todos os produtos
            System.out.println("===== TODOS OS PRODUTOS =====");

            materiais.listarProdutos();


            // Adicionar produtos ao estoque
            System.out.println("\n===== ADICIONANDO AO ESTOQUE =====");

            produto1.adicionarEstoque(5);

            System.out.println(
                    "Estoque da furadeira Bosch: "
                            + produto1.getQuantidadeEstoque()
            );


            // Vender produtos
            System.out.println("\n===== VENDENDO PRODUTO =====");

            produto1.vender(3);

            System.out.println(
                    "Estoque da furadeira Bosch após venda: "
                            + produto1.getQuantidadeEstoque()
            );


            // Produto mais caro de uma marca
            System.out.println("\n===== PRODUTO MAIS CARO DA BOSCH =====");

            Produto maisCaro = materiais.obterProdutoMaisCaro("Bosch");

            if (maisCaro != null) {
                System.out.println(maisCaro);
            } else {
                System.out.println("Marca não encontrada.");
            }


            // Produtos dentro de um intervalo de preço
            System.out.println("\n===== PRODUTOS BOSCH ENTRE R$ 300 E R$ 500 =====");

            ArrayList<Produto> resultado =
                    materiais.obterProdutosPorMarcaEPreco("Bosch", 300.00, 500.00);

            for (Produto produto : resultado) {
                System.out.println(produto);
            }


        } catch (IllegalArgumentException e) {

            System.out.println("Erro: " + e.getMessage());
        }
    }
}
