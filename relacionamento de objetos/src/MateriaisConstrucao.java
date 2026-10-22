import java.util.ArrayList;
import java.util.List;

public class MateriaisConstrucao {

   private List<Produto>protutos;

   public MateriaisConstrucao(){
       protutos = new ArrayList<Produto>();

   }
   public void adicionaMaterialCostrucao(Produto p){
       protutos.add(p);

   }

}
