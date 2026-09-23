public class Comtribuente {

    private String nome;
    private String cpf;
    private String uf;
    private double renda;

    public Comtribuente(String nome, String cpf, String uf, double renda) {
        setNome (nome);
        setCpf (cpf);
        setUf (uf);
        setRenda (renda);
    }
public double calcularImposto(){

}




    @Override
    public String toString() {
        return "Comtribuente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", uf='" + uf + '\'' +
                ", renda=" + renda +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
   if (nome == null || nome.isBlank()){
throw new IllegalArgumentException("nome invalido");
   } else {
       this.nome = nome;
   }

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank()){
            throw new IllegalArgumentException("cpf invalido");
        }else {
            this.cpf = cpf;
        }
        this.cpf = cpf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (uf == null || uf.isBlank()){
            throw new IllegalArgumentException("uf invalido");
        }else {
            this.uf = uf ;

        }

        this.uf = uf;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
       if (renda<=0){
           throw new IllegalArgumentException("renda invalido");
       }else {
           this.renda = renda;

       }

    }

}
