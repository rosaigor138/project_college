package integrantes.informacao;

public abstract class IdentificadorPessoa{
    public static String IdentificadorPessoa(Pessoa pessoa){
        return pessoa.getTratamento();
    }
}
