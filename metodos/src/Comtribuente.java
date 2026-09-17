public class Comtribuente {

    private String nome;
    private String cpf;
    private String uf;
    private double renda;

    public Comtribuente(String nome, String cpf, String uf, double renda) {
        this.nome = nome;
        this.cpf = cpf;
        this.uf = uf;
        this.renda = renda;
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


    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
       if (renda<=0){
           System.out.println("erro  nao e invalido");
       }else {
           this.renda = renda;
       }
    }
}
