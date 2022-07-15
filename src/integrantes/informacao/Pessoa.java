package integrantes.informacao;

public abstract class Pessoa {
    protected String nome;
    protected String telefone;
    protected String email;

    public Pessoa(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email= email;
    }
    public String getNome(){
        return this.nome;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public String getEmail(){
        return this.email;
    }
}
