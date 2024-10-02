public class ExcecaoCustom extends Exception{

    public ExcecaoCustom (String erro){
        super("Deu ruim!!! \n" + erro);

    }

}
