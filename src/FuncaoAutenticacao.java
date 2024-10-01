import escola.interfaces.PermitirAcesso;

public class FuncaoAutenticacao {

    public boolean autenticarCurso(PermitirAcesso acesso){


        return acesso.autenticar();
    }


}
