public class TestarArray {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        Disciplina disciplina = new Disciplina();
        double[] dis = {7.7,7.7,7.7};
        disciplina.setNotaDisciplina(dis);
        disciplina.setNomeDisciplina("java");


        Disciplina disciplina2 = new Disciplina();
        double[] dis2 = {7.7,7.7,7.7};
        disciplina2.setNotaDisciplina(dis2);
        disciplina2.setNomeDisciplina("Estrutura de dados");

        Disciplina disciplina3 = new Disciplina();
        double[] dis3 = {7.7,7.7,7.7};
        disciplina3.setNotaDisciplina(dis3);
        disciplina3.setNomeDisciplina("Logica");

        Disciplina[] disciplinas = new Disciplina[3];

        disciplinas[0]=disciplina;
        disciplinas[1]=disciplina2;
        disciplinas[2]=disciplina3;

        aluno.setNome("Bastião");
        aluno.setIdade(17);
        aluno.setDisciplina(disciplinas);

        System.out.println(aluno.toString());



    }


}
