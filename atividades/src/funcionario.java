public class funcionario {
   // Crie uma classe Funcionário que terá como atributos:
   // • Identificação
   //• Nome
//• Sobrenome
//• Salário (mensal)
  //  Crie métodos para:
    //Obter o salário anual do funcionário
    //Obter o nome completo do funcionário
    //Modificar o salário. O parâmetro do metodo deve ser o percentual de aumento

    String identificaçao ;
    String nome;
    String sobrenome;
    double salario;
    double salarioAnual;

    public double salarioanuais(){
    return    (salario *12);
    }

    public String obternome(){
        return  nome +" "+ sobrenome;

    }
    public Double obterpercentualaumento(){
        return salarioAnual*0.3;
    }
}

