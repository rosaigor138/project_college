package integrantes.informacao;
import java.time.LocalDate;

public class Aluno {

    private String nome;

    private String telefone;
    private String email;
    private Disciplina[] historicoDisciplinas;
    private int contador = 0;
    private int numDis;
    private static int contadorMatricula = 1;
    private String matricula;
    public static LocalDate date;

    public Aluno(String nome, String telefone, String email, int numDisc) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.historicoDisciplinas = new Disciplina[numDisc];
        this.numDis = numDisc;
        if (date == null) {
            Aluno.date = LocalDate.now();
        } else if (Aluno.date.getYear() != LocalDate.now().getYear()) {
            Aluno.contadorMatricula = 1;
        }else Aluno.contadorMatricula++;
        this.matricula = LocalDate.now().getYear() +"-"+contadorMatricula;
    }


    public void novaDisc(Disciplina disciplina) {
        if (this.contador < this.numDis) {
            this.historicoDisciplinas[contador] = disciplina;
            contador++;
        }
    }
    public String getMatricula(){
        return this.matricula;
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
    public double calculaIRA(){
        double ira = 0;
        for(int i=0; i<contador;i++){
            ira += historicoDisciplinas[i].calculaMedia();
        }return ira/contador;
    }

    /*@Override
    public String toString() {
        String text = "";
        for (int i=0;i<this.contador;i++){
            text = text.concat(this.historicoDisciplinas[i].toString());
        }
        return text;
    }*/  //O mesmo do imprimirHistorico, porém através da sobreescrita do metodo toString
    public String imprimirHistorico(){
        String historico = "\n Historico de disciplinas do aluno "+this.nome +"\n";
        for (int i =0;i<this.contador;i++){
            historico = historico.concat(this.historicoDisciplinas[i].toString());
        }return historico; //Não foi pedida a impressão do historico no enunciado, porém achei justo adicionar
    }

    public int getNumDis() {
        return numDis;
    }
}
