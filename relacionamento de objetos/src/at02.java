public class at02 {

    public static void main(String[] args) {
        Flor f1 = new Flor("Tulipa" , 60 , "Caio");
        Flor f2 = new Flor("margarida" , 50 , "joao");
        Flor f3 = new Flor("rosa", 40, "Ana");
        Flor f4 = new Flor( "lirio", 100, "caio");

        Floricultura floricultura = new Floricultura();
        floricultura.adicionarFlor(f1);
        floricultura.adicionarFlor(f2);
        floricultura.adicionarFlor(f3);
        floricultura.adicionarFlor(f4);
        System.out.println(floricultura.pesquisarFlores("Henrique"));
    }
}
