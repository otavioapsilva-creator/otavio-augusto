import javax.swing.text.DefaultEditorKit;

public class Pessoa {
     private String Nome;
     private Endereco endereco;


     public Pessoa(String nome, Endereco endereco) {
          Nome = nome;
          this.endereco = endereco;
     }

     public String getNome() {
          return Nome;
     }

     public void setNome(String nome) {
          if (nome == null || nome.isBlank()){
               throw new IllegalArgumentException("nome invalido");
          }
          Nome = nome;
     }

     public Endereco getEndereco() {
          return endereco;
     }

     public void setEndereco(Endereco endereco) {
          if (endereco == null ){
               throw new IllegalArgumentException("endereco invalido");
          }
          this.endereco = endereco;
     }

     @Override
     public String toString() {
          return "Pessoa{" +
                  "Nome='" + Nome + '\'' +
                  ", endereco=" + endereco +
                  '}';
     }
}
