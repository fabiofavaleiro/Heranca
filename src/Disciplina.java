import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private double[] notaDisciplina = new double[3];



    public double mediaNotas(double notas[]){
        double somaNotas = 0;
        for (int i = 0; i < notaDisciplina.length; i++) {

            somaNotas += notaDisciplina[i];

        }


        return somaNotas / notaDisciplina.length;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public double[] getNotaDisciplina() {
        return notaDisciplina;
    }

    public void setNotaDisciplina(double[] notaDisciplina) {
        this.notaDisciplina = notaDisciplina;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nomeDisciplina='" + nomeDisciplina + '\'' +
                ", notaDisciplina=" + Arrays.toString(notaDisciplina) +
                '}';
    }
}
