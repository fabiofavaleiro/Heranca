public class Aluno extends Pessoa{
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;
    private String diciplinas;


    @Override
    public double salario() {
        return 5000;
    }

    @Override
    public boolean pessoaMaiorIdade() {
        return idade>=16;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "dataMatricula='" + dataMatricula + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", serieMatriculado='" + serieMatriculado + '\'' +
                ", diciplinas='" + diciplinas + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", cPF='" + cPF + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                '}';
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

    public String getDiciplinas() {
        return diciplinas;
    }

    public void setDiciplinas(String diciplinas) {
        this.diciplinas = diciplinas;
    }


}


