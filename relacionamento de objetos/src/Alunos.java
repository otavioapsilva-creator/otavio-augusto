public class Alunos {
    private String nome;
    private int idade;
    private String matricula;
    private String curso;
    private double mediaFinal;

    public Alunos(String nome, int idade, String matricula, String curso,double mediaFinal) {
       setNome(nome);
        setIdade(idade);
      setMatricula(matricula);
        setCurso(curso);
        setMediaFinal(mediaFinal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("nome invalido");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0 ){
            throw new IllegalArgumentException("idade invalida");

        }
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula == null || matricula.isBlank()){
            throw new IllegalArgumentException("matricula invalida");
        }
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (curso == null || curso.isBlank()){
            throw new IllegalArgumentException("curso invalido");
        }
        this.curso = curso;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        if (mediaFinal < 0 ){
            throw new IllegalArgumentException("media invalida");
        }
        this.mediaFinal = mediaFinal;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                ", mediaFinal=" + mediaFinal +
                '}';
    }
}
