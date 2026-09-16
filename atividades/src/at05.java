public class at05 {


        private int identificacao;
        private String nome;
        private String sobrenome;
        private double salarioMensal;

        public at05(int identificacao, String nome, String sobrenome, double salarioMensal) {
            this.identificacao = identificacao;
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.salarioMensal = salarioMensal;
        }


        public String obterNomeCompleto() {
            return this.nome + " " + this.sobrenome;
        }


        public double obterSalarioAnual() {
            return this.salarioMensal * 12;
        }


        public void modificarSalario(double percentualAumento) {
            this.salarioMensal += this.salarioMensal * (percentualAumento / 100);
        }


        public int getIdentificacao() { return identificacao; }
        public String getNome() { return nome; }
        public String getSobrenome() { return sobrenome; }
        public double getSalarioMensal() { return salarioMensal; }
    }
