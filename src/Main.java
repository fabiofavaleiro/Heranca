import javax.swing.*;
import escola.interfaces.PermitirAcesso;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try {


            lerArquivo();







            String nome = JOptionPane.showInputDialog("Qual é o nome do aluno?");
            int idade = Integer.valueOf(JOptionPane.showInputDialog("Qual é o nome do aluno?"));
            Aluno aluno1 = new Aluno();
            aluno1.setNome(nome);
            aluno1.setIdade(idade);


            System.out.println(aluno1.toString());

            String login = JOptionPane.showInputDialog("Qual é o login?");
            String senha = JOptionPane.showInputDialog("Qual é a senha?");


            if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {

                JOptionPane.showMessageDialog(null, "Entrou!!!");

            } else {
                JOptionPane.showMessageDialog(null, "Acesso Negado!!!");
            }
        }catch (NumberFormatException e){

            StringBuilder saida = new StringBuilder();
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,e.getMessage());


            for (int i = 0; i < e.getStackTrace().length; i++) {

                saida.append("\n Classe erro: " + e.getStackTrace()[i].getClassName());
                saida.append("\n Metodo erro: " + e.getStackTrace()[i].getMethodName());
                saida.append("\n Linha erro: " + e.getStackTrace()[i].getLineNumber());
                saida.append("\n Classe: " + e.getClass().getName());

            }

            JOptionPane.showMessageDialog(null,saida.toString());

        }catch (NullPointerException e){

            JOptionPane.showMessageDialog(null,"Um Null Pointer Exception: " + e.getClass());

        }catch (ExcecaoCustom e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, " ExecucaoCuston Class: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "\n ExecucaoCuston: " + e.getClass());
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro Inesperado: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "\n Erro Inesperado: " + e.getClass());
        }
    }

    public static void lerArquivo() throws ExcecaoCustom {

        File fil = new File("xxt.txt");
        try {
            Scanner scan = new Scanner(fil);
        } catch (FileNotFoundException e) {
            throw new ExcecaoCustom(e.getMessage());
        }

    }

    public static void teste(Pessoa pessoa){
        System.out.println("Pessoa é "+ pessoa.getNome() + " e recebe " + pessoa.salario());
    }



}
