public class Carro {

    private double velocidade;

    public Carro(double velocidade) {
      setVelocidade(velocidade);
    }
    public void  acelerar (double aceleracao){
        if (aceleracao < 0 || aceleracao >= 20){
            throw new IllegalArgumentException("Aceleração invalida");
        }

        setVelocidade(velocidade + aceleracao) ;
    }

    public void  reduzir (double reducao){
        if (reducao<0 || reducao >=30){
            throw  new IllegalArgumentException("redução invalida");
        }
        setVelocidade(velocidade - reducao);
    }
    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
       if (velocidade < 0){
           throw new IllegalArgumentException("Velocidade não pode ser negada"){

           }

       }
    }
}
