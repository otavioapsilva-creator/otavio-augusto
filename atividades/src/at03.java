public class at03 {


   // A partir das representações abaixo dos objetos de uma classe Produto, escreva o código
    //necessário para suportar tais objetos.
    //Ou seja, o código necessário para criar a classe e instanciar os objetos de modo que fiquem
    //com o estado apresentado.
    //produto1: Produto
    //nome = “Caderno”
    //descricao = “Caderno em espiral tamanho médio”
    //precoUnitario = 4.50
    //desconto = 15
    //produto2: Produto
    //nome = “Caneta ESF”
    //descricao = “Caneta esferográfica 5mm”
    //precoUnitario = 1.20
    //desconto = 2
    //produto3: Produto
    //nome = “Esquadro”
    //descricao = “Esquadro de acrílico 20 cm”
    //precoUnitario = 2.35
    //desconto = 10
    public static void main(String[] args) {
      produto p1 = new produto();
      produto p2 = new produto();
      produto p3 = new produto();
      p1.nome = "Caderno";
      p1.descricao = "Caderno em espiral tamanho médio";
      p1.preco = 4.50;
      p1.desconto = 15;

      p2.nome = "Caneta ESF";
      p2.descricao = "Esquadro de acrílico 20 cm";
      p2.preco = 1.20;
      p2.desconto = 2;

      p2.nome ="Esquadro";
      p2.descricao = "Caneta esferográfica 5mm";
      p2.preco = 2.35;
      p2.desconto = 10;

        System.out.println(p1.nome + " "+p1.descricao + " " + p1.preco + " " + p1.desconto);
        System.out.println(p2.nome + " "+p2.descricao + " " + p2.preco + " " + p2.desconto);
        System.out.println(p3.nome + " "+p3.descricao + " " + p3.preco + " " + p3.desconto);

    }
}
