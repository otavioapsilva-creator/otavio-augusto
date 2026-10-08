public class retangulo {

    private double altura;
    private double largura;

    @Override
    public String toString() {
        return "retangulo{" +
                "altura=" + altura +
                ", largura=" + largura +
                '}';
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {

        if (altura< 0){
            throw new IllegalArgumentException("artura invalida");
        }
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura < 0 ){
            throw new IllegalArgumentException("largura invalida");
        }
        this.largura = largura;
    }

    public retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;

    }
    public double obterArea(){
        double area = altura * largura;
        return  area;
    }
    public double obterPerimetro(){
         double perimetro = 2*(altura + largura);
         return perimetro;
    }
}
