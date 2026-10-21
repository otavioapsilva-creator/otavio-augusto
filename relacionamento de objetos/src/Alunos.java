public class Alunos {

    private String nome;
    private int idade;
    private int matricula;
    private String curso;
    private double mediaFinal;
    private String email;

    // Construtor
    public Alunos(String nome, int idade, int matricula, String curso, double mediaFinal, String email) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.curso = curso;
        this.mediaFinal = mediaFinal;
        this.email = email;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula=" + matricula +
                ", curso='" + curso + '\'' +
                ", mediaFinal=" + mediaFinal +
                ", email='" + email + '\'' +
                '}';
    }
}