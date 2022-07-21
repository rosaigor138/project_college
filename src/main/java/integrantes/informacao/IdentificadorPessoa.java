package integrantes.informacao;

public abstract class IdentificadorPessoa{
    private IdentificadorPessoa(){}
    public static String IdentificarPessoa(Pessoa pessoa){
        return pessoa.getTratamento();
    }
}
