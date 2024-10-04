import java.util.Arrays;

public class Aluno extends Pessoa{
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;


    private  Disciplina[] disciplina = new Disciplina[3];





    @Override
    public double salario() {
        return 5000;
    }

    @Override
    public boolean pessoaMaiorIdade() {
        return idade>=16;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public Disciplina[] getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina[] disciplina) {
        this.disciplina = disciplina;
    }



    @Override
    public String toString() {
        return "Aluno{" +
                "dataMatricula='" + dataMatricula + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", serieMatriculado='" + serieMatriculado + '\'' +
                ", disciplina=" + Arrays.toString(disciplina) +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", cPF='" + cPF + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                '}';
    }
}


