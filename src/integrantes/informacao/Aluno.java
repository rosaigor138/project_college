package integrantes.informacao;
import java.time.LocalDate;
import java.util.ArrayList;
public class Aluno {

    private String nome;

    private String telefone;
    private String email;
    private ArrayList<Disciplina> historicoDisciplinas;
    private static int contadorMatricula = 1;
    private String matricula;
    public static LocalDate date;

    public Aluno(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        historicoDisciplinas = new ArrayList<Disciplina>();
        if (date == null) {
            Aluno.date = LocalDate.now();
        } else if (Aluno.date.getYear() != LocalDate.now().getYear()) {
            Aluno.contadorMatricula = 1;
        }else Aluno.contadorMatricula++;
        this.matricula = LocalDate.now().getYear() +"-"+contadorMatricula;
    }


    public void novaDisc(Disciplina disciplina) {
        this.historicoDisciplinas.add(disciplina);
    }

    public boolean temouNaoADisciplina(Disciplina disciplina){
        if (this.historicoDisciplinas.indexOf(disciplina)<0){
            return false;   
        }return true;
    }
    public void apagarDisciplina(Disciplina disciplina){
        historicoDisciplinas.remove(disciplina);
    }
    public String getMatricula(){
        return this.matricula;
    }
    public String getDesc() {
        String desc = "Aluno: " + nome + " Telefone: " + telefone + "\n(" + email + ")";
        return desc;
    }
    public double calculaIRA(){
        double ira = 0;
        for(int i=0; i<historicoDisciplinas.size();i++){
            ira += historicoDisciplinas.get(i).calculaMedia();
        }return ira/historicoDisciplinas.size();
    }
    public String imprimirHistorico(){
        String historico = "\n Historico de disciplinas do aluno :"+
                getNome()+" de matricula: "+
                getMatricula()+"\n";
        for (int i =0;i< historicoDisciplinas.size();i++){
            historico = historico.concat(historicoDisciplinas.get(i).toString());
        }return historico;
    }

    public String getNome() {
        return nome;
    }
}
