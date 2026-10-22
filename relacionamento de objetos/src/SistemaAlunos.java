import java.util.ArrayList;

public class SistemaAlunos {

    private ArrayList<Alunos> alunos;


    public SistemaAlunos() {
        alunos = new ArrayList<>();
    }

    // Adicionar aluno
    public void adicionarAluno(Alunos aluno) throws Exception {

        // Verifica se o e-mail já está cadastrado
        for (Alunos a : alunos) {

            if (a.getEmail().equalsIgnoreCase(aluno.getEmail())) {
                throw new Exception("E-mail já cadastrado!");
            }
        }

        alunos.add(aluno);
    }

    // Buscar alunos por curso, idade e média
    public ArrayList<Alunos> buscarAlunos(
            String curso,
            int idadeMinima,
            double mediaMinima) {

        ArrayList<Alunos> resultado = new ArrayList<>();

        for (Alunos aluno : alunos) {

            if (aluno.getCurso().equalsIgnoreCase(curso)
                    && aluno.getIdade() >= idadeMinima
                    && aluno.getMediaFinal() >= mediaMinima) {

                resultado.add(aluno);
            }
        }

        return resultado;
    }


    public Alunos buscarPorMatricula(int matricula) {

        for (Alunos aluno : alunos) {

            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }

        return null;
    }


    public void listarAlunos() {

        for (Alunos aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
