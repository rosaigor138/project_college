package integrantes.informacao;
public class Aluno {
    String nome;
    String telefone;
    String email;

    public Aluno(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    public String getDesc(){
        String desc = "Aluno: "+nome+" Telefone: "+telefone+"\n("+email+")";
        return desc;
    }

}
