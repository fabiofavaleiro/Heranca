import escola.interfaces.PermitirAcesso;

public class FuncaoAutenticacao {

    private PermitirAcesso permitirAcesso;

    public boolean autenticar(){
        return permitirAcesso.autenticar();
    }

    public  FuncaoAutenticacao(PermitirAcesso acesso){
        permitirAcesso = acesso;
    }


}
