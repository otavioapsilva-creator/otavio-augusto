public class Endereco {
    private String uf;
    private String cidade;
    private String cep;
    private String logradouro;
    private double num_residencia;

    public Endereco(String uf, String cidade, String cep, String logradouro, double num_residencia) {
        setUf(uf);
        setCidade(cidade);
        setCep(cep);
        setLogradouro(logradouro);
        setNum_residencia(num_residencia);
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (uf == null  || uf.isBlank()){
            throw new IllegalArgumentException(" uf invalido");
        }
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if (cidade == null || cidade.isBlank()){
            throw new IllegalArgumentException("cidade invalida");
        }
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if (cep == null || cep.isBlank()){
            throw new IllegalArgumentException("cep invalido");
        }
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public double getNum_residencia() {
        return num_residencia;
    }

    public void setNum_residencia(double num_residencia) {
        if (num_residencia < 0 ){
            throw new IllegalArgumentException("numero invalido");
        }
        this.num_residencia = num_residencia;
    }
}