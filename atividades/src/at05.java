public class at05 {

        // Atributos privados (encapsulamento)
        private int identificacao;
        private String nome;
        private String sobrenome;
        private double salarioMensal;

        // Construtor para inicializar os atributos
        public at05(int identificacao, String nome, String sobrenome, double salarioMensal) {
            this.identificacao = identificacao;
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.salarioMensal = salarioMensal;
        }

        // Método para obter o nome completo do funcionário
        public String obterNomeCompleto() {
            return this.nome + " " + this.sobrenome;
        }

        // Método para obter o salário anual do funcionário
        public double obterSalarioAnual() {
            return this.salarioMensal * 12;
        }

        // Método para modificar o salário baseado no percentual de aumento
        public void modificarSalario(double percentualAumento) {
            this.salarioMensal += this.salarioMensal * (percentualAumento / 100);
        }

        // Getters e Setters básicos (caso precise acessar ou modificar atributos diretamente)
        public int getIdentificacao() { return identificacao; }
        public String getNome() { return nome; }
        public String getSobrenome() { return sobrenome; }
        public double getSalarioMensal() { return salarioMensal; }
    }
