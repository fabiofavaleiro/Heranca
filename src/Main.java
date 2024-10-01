import javax.swing.*;
import escola.interfaces.PermitirAcesso;




public class Main {
    public static void main(String[] args) {


        String login = JOptionPane.showInputDialog("Qual é o login?");
        String senha = JOptionPane.showInputDialog("Qual é a senha?");

        PermitirAcesso permitirAcesso = new Secretario(login, senha);


        if(permitirAcesso.autenticar()){

            JOptionPane.showMessageDialog(null,"Entrou!!!");

        }else {
            JOptionPane.showMessageDialog(null,"Acesso Negado!!!");
        }

    }

    public static void teste(Pessoa pessoa){
        System.out.println("Pessoa é "+ pessoa.getNome() + " e recebe " + pessoa.salario());
    }



}
