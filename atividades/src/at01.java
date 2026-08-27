public class at01 {


    // Em uma classe denominada Usuario, deseja-se manter o nome, sexo, data de nascimento e
    //estado civil desse usuário.
    //O sexo deve ser definido como um caractere.
    //A data deve ser definida como String.
    //Crie 2 objetos de Usuario, atribua valores a esses objetos e mostre as informações na tela
    public static void main(String[] args) {
        usuario p1 = new usuario();
        p1.nome = "otávio";
        p1.data = "29/10/2009";
        p1.sexo = "M";
        p1.civil = "solteiro";

        usuario p2 = new usuario();
        p2.nome = "nicole";
        p2.data = "20/04/2007";
        p2.sexo = "F";
        p2.civil = "solteira";
        System.out.println(p1.nome + " "+ p1.data + " " + p1.sexo + " " + p1.civil);
        System.out.println(p2.nome + " "+ p2.data + " " + p2.sexo + " " + p2.civil);
    }


    }

