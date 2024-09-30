
public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Fulano");
        aluno.setNomeEscola("A minha");
        aluno.setIdade(17);

        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("98798456");
        diretor.setNome("Cicrano");
        diretor.setIdade(55);


        Secretario secretario = new Secretario();
        secretario.setExperiencia("Administração");
        secretario.setCPF("999.999.999-00");
        secretario.setIdade(21);



        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);


        System.out.println(aluno.pessoaMaiorIdade());
        System.out.println(diretor.pessoaMaiorIdade());
        System.out.println(secretario.pessoaMaiorIdade());


    }
}
