import java.util.ArrayList;
import java.util.List;

public class Floricultura {

    private List<Flor>flores;

    public Floricultura(){
        flores = new ArrayList<Flor>();

    }
      public void adicionarFlor(Flor f){
        flores.add(f);

      }
      public List<Flor> pesquisarFlores(String nome_cliente){
        List<Flor> floresPesquisa = new ArrayList<Flor>();

        for (Flor f : flores){
            if (f.getNome_cliente().equals(nome_cliente)){
                floresPesquisa.add(f);

            }
        }



        return floresPesquisa;
      }
}
