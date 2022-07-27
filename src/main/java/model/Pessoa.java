package model;

public abstract class Pessoa implements Tratamento {
    protected String nome;
    protected String telefone;
    protected String email;
    protected boolean sexo;//true para mulher ou false para homem

    public Pessoa(String nome, String telefone, String email, boolean sexo){
        this.nome = nome;
        this.telefone = telefone;
        this.email= email;
        this.sexo=sexo;
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
    public abstract String identificacao();
}
