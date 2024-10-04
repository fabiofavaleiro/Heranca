public class TestarArray {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        Disciplina disciplina = new Disciplina();
        double[] dis = {9.5,7.7,9.0};
        disciplina.setNotaDisciplina(dis);
        disciplina.setNomeDisciplina("java");


        Disciplina disciplina2 = new Disciplina();
        double[] dis2 = {10.0,7.7,7.7};
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

        System.out.println("o aluno: " + aluno.getNome());




        for (int h = 0; h < 3; h++) {
            System.out.println("   ");
            System.out.println("Na materia: " + aluno.getDisciplina()[h].getNomeDisciplina());
            for (int i = 0; i < 3; i++) {
                System.out.println("Na materia: " + aluno.getDisciplina()[h].getNotaDisciplina()[i]);
            }

        }

        for (int j = 0; j < 3; j++) {

            double media = aluno.getDisciplina()[j].mediaNotas(disciplinas[j].getNotaDisciplina());
            System.out.println("A media da materia: "+ aluno.getDisciplina()[j].getNomeDisciplina() +" é " + media);

        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        for (Disciplina d : aluno.getDisciplina()){
            System.out.println(d.getNomeDisciplina());
        }


    }


}
