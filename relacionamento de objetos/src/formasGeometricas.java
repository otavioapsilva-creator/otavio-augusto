import java.util.ArrayList;
import java.util.List;

public class formasGeometricas {
 private List<retangulo> retangulos;

 public formasGeometricas(){
     retangulos = new ArrayList<retangulo>();

 }
    public  void  adicionarRetangulo(retangulo r){
     retangulos.add(r);
    }

public  retangulo obterMaiorArea() {
 double maiorArea = Double.MIN_VALUE;
 retangulo MaisArea = null;

 for (retangulo r  : retangulos) {
     if (r.obterArea() > maiorArea){
         maiorArea = r.obterArea();
         MaisArea = r;
     }
 }

}


}
