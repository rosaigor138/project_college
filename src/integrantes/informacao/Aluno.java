package integrantes.informacao;
import java.util.ArrayList;
public class Aluno {

    private String nome;

    private String telefone;
    private String email;
    private Disciplina[] historicoDisciplinas;
    private int contador = 0;
    private int numDis = 0;

    public Aluno(String nome, String telefone, String email, int numDisc) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.historicoDisciplinas = new Disciplina[numDisc];
    }

    public void novaDisc(Disciplina disciplina) {
        if (this.contador < this.numDis) {
            this.historicoDisciplinas[contador++] = disciplina;
        }
    }

    public String getDesc() {
        String desc = "Aluno: " + nome + " Telefone: " + telefone + "\n(" + email + ")";
        return desc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Disciplina[] getHistoricoDisciplinas() {
        return historicoDisciplinas;
    }
    /*@Override
    public String toString() {
        String text = "";
        for (int i=0;i<this.contador;i++){
            text = text.concat(this.historicoDisciplinas[i].toString()+"\n");
        }
        return text;
    }*/
    public void imprimirHistorico(){
        for (int i =0;i<this.contador;i++){
            System.out.println(this.historicoDisciplinas[i].toString());
        }
    }

    public int getContador() {
        return contador;
    }

    public int getNumDis() {
        return numDis;
    }
}
