import javax.swing.*;





public class Main {
    public static void main(String[] args) {


        Secretario secretario = new Secretario();
        secretario.setExperiencia("Administração");
        secretario.setCPF("999.999.999-00");
        secretario.setIdade(21);
        secretario.setNome("Beltrano");
        secretario.setLogin("");


        String login = JOptionPane.showInputDialog("Qual é o login?");
        String senha = JOptionPane.showInputDialog("Qual é a senha?");
        secretario.setLogin(login);
        secretario.setSenha(senha);

        if(secretario.autenticar()){





        Aluno aluno = new Aluno();
        aluno.setNome("Fulano");
        aluno.setNomeEscola("A minha");
        aluno.setIdade(17);

        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("98798456");
        diretor.setNome("Cicrano");
        diretor.setIdade(55);


        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);


        System.out.println(aluno.pessoaMaiorIdade());
        System.out.println(diretor.pessoaMaiorIdade());
        System.out.println(secretario.pessoaMaiorIdade());


        System.out.println("O salario do aluno é" + aluno.salario());
        System.out.println("O salario do diretor é" + diretor.salario());
        System.out.println("O salario do secretario é" + secretario.salario());


        teste(aluno);
        teste(diretor);
        teste(secretario);
}else {
            JOptionPane.showMessageDialog(null,"Acesso Negado!!!");
        }

    }

    public static void teste(Pessoa pessoa){
        System.out.println("Pessoa é "+ pessoa.getNome() + " e recebe " + pessoa.salario());
    }



}
