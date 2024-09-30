
public class Main {
    public static void main(String[] args) {


        System.out.printf("Hello and welcome!");

        Aluno aluno = new Aluno;
        //aluno.setNome("Fulano");
        aluno.setNomeEcola("A minha");
        //aluno.setIdade(17);


        Diretor diretor = new Diretor;
        diretor.setRegistroGeral("48465468");
        //diretor.setNome("Cicrano");
        //diretor.setIdade(55);


        Secretario secretario = new Secretario;
        secretario.setExperiencia("Administração");
        //secretario.setNumeroCPF(999.999.999-00);
        //secretario.setIdade(18);


        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);


    }
}