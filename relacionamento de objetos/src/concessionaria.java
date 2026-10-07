import java.util.ArrayList;
import java.util.List;

public class concessionaria {

    private List<veiculo> veiculos;

    public concessionaria() {
        veiculos = new ArrayList<veiculo>();
    }

    public void adicionarVeiculo(veiculo v) {
        veiculos.add(v);

    }


    public veiculo obterVeiculoMaisBarato() {
        double menorPreco = Double.MAX_VALUE;
        veiculo veiculoMaisBarato = null;

        for (veiculo v : veiculos) {
            if (v.getPreco() < menorPreco) {
                menorPreco = v.getPreco();
                veiculoMaisBarato = v;
            }
        }


        return veiculoMaisBarato;
    }
}
