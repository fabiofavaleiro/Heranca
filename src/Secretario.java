import escola.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

    private String registro;
    private String nivelCargo;
    private String experiencia;


    private String login;
    private String senha;


    public Secretario(String login, String senha){
        this.login = login;
        this.senha = senha;

    }



    public Secretario() {
    }



        @Override
        public boolean autenticar(String login, String senha){
            this.login = login;
            this.senha = senha;

           return autenticar();

        }

        @Override
        public boolean autenticar(){
        return login.equals("Admin") && senha.equals("Admin");
        }


        @Override
        public double salario() {
            return 4000;
        }

        @Override
        public String toString() {
            return "Secretario{" +
                    "registro='" + registro + '\'' +
                    ", nivelCargo='" + nivelCargo + '\'' +
                    ", experiencia='" + experiencia + '\'' +
                    '}';
        }

        public String getRegistro() {
            return registro;
        }

        public void setRegistro(String registro) {
            this.registro = registro;
        }

        public String getNivelCargo() {
            return nivelCargo;
        }

        public void setNivelCargo(String nivelCargo) {
            this.nivelCargo = nivelCargo;
        }

        public String getExperiencia() {
            return experiencia;
        }

        public void setExperiencia(String experiencia) {
            this.experiencia = experiencia;
        }


}