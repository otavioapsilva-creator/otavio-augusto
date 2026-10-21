import java.util.ArrayList;

public class At03 {

    public static void main(String[] args) {

        SistemaAlunos sistema = new SistemaAlunos();

        try {

            // Criando os alunos
            Alunos aluno1 = new Alunos("João", 18, 1001, "Desenvolvimento de Sistemas", 8.5, "joao@email.com");

            Alunos aluno2 = new Alunos("Maria", 20, 1002, "Desenvolvimento de Sistemas", 9.0, "maria@email.com");

            Alunos aluno3 = new Alunos("Carlos", 17, 1003, "Desenvolvimento de Sistemas", 7.5, "carlos@email.com");

            Alunos aluno4 = new Alunos("Ana", 22, 1004, "Administração", 8.0, "ana@email.com");


            sistema.adicionarAluno(aluno1);
            sistema.adicionarAluno(aluno2);
            sistema.adicionarAluno(aluno3);
            sistema.adicionarAluno(aluno4);

            // Mostrar todos os alunos
            System.out.println("===== TODOS OS ALUNOS =====");

            sistema.listarAlunos();


            // Buscar alunos por curso, idade mínima e média mínima
            System.out.println("\n===== BUSCA POR CURSO, IDADE E MÉDIA =====");

            ArrayList<Alunos> resultado = sistema.buscarAlunos(
                    "Desenvolvimento de Sistemas",
                    18,
                    8.0
            );

            for (Alunos aluno : resultado) {
                System.out.println(aluno);
            }


            // Buscar aluno pela matrícula
            System.out.println("\n===== BUSCA POR MATRÍCULA =====");

            Alunos alunoEncontrado = sistema.buscarPorMatricula(1002);

            if (alunoEncontrado != null) {
                System.out.println("Aluno encontrado:");
                System.out.println(alunoEncontrado);
            } else {
                System.out.println("Aluno não encontrado.");
            }


            // Testando e-mail duplicado
            System.out.println("\n===== TESTE DE E-MAIL DUPLICADO =====");

            Alunos aluno5 = new Alunos("Pedro", 19, 1005, "Desenvolvimento de Sistemas", 8.0, "joao@email.com"
            );

            sistema.adicionarAluno(aluno5);

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());
        }
    }
}
