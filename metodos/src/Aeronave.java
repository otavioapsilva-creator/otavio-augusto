public class Aeronave {

    String modelo;

    int qtdPassageiros;

    double velMax;

    double capCombustivel;

    double queimaMinuto;


    public Aeronave(String modelo, int qtdPassageiros, double velMax, double capCombustivel, double queimaMinuto) {
        this.modelo = modelo;
        this.qtdPassageiros = qtdPassageiros;
        this.velMax = velMax;
        this.capCombustivel = capCombustivel;
        this.queimaMinuto = queimaMinuto;
    }


    public double calcularAutonomia() {
        return capCombustivel / queimaMinuto;
    }


    public double calcularDistanciaMaxima() {
        return calcularAutonomia() * velMax;
    }


    @Override
    public String toString() {
        return "Aeronave [modelo=" + modelo + ", qtdPassageiros=" + qtdPassageiros + ", velMax=" + velMax
                + ", capCombustivel=" + capCombustivel + ", queimaMinuto=" + queimaMinuto + "]";
    }

}