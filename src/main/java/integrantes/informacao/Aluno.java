package integrantes.informacao;
import integrantes.api.interfaces.Tratamento;
import integrantes.api.ordenacao.OrdenarAvaliacaoMaiorPonto;
import integrantes.api.ordenacao.OrdenarAvaliacaoMenorPonto;
import integrantes.api.ordenacao.OrdenarDisciplinasOrdemAlfabetica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Aluno extends Pessoa implements Tratamento {

    private ArrayList<Disciplina> historicoDisciplinas;
    private static int contadorMatricula = 1;
    private String matricula;
    private static LocalDate anoDaMatricula;

    public Aluno(String nome, String telefone, String email,boolean sexo) {
        super(nome, telefone, email,sexo);
        historicoDisciplinas = new ArrayList<Disciplina>();
        if (anoDaMatricula == null) {
            Aluno.anoDaMatricula = LocalDate.now();
        } else if (Aluno.anoDaMatricula.getYear() != LocalDate.now().getYear()) {
            Aluno.contadorMatricula = 1;
        }else Aluno.contadorMatricula++;
        this.matricula = LocalDate.now().getYear() +"-"+contadorMatricula;
    }
    @Override
    public String getTratamento(){
        if(sexo){
            return "Prezada Aluna "+getNome();
        }else return "Prezado Aluno "+getNome();
    }
    public String identificacao(){
        return "E um aluno";
    }
    public void novaDisc(Disciplina disciplina) {
        this.historicoDisciplinas.add(disciplina);
    }

    public String ordenarAvaliacoesAlunoMaior(){
        ArrayList<Avaliacao> listaAvaliacoes = new ArrayList<>();
        OrdenarAvaliacaoMaiorPonto ord = new OrdenarAvaliacaoMaiorPonto();
        for (Disciplina count : historicoDisciplinas){
            for (Avaliacao avaliacoes: count.getAvaliacoesDisciplina()){
                listaAvaliacoes.add(avaliacoes);
            }
        }
        Collections.sort(listaAvaliacoes,ord);
        String retornodaOrdem="As avaliacoes do aluno em ordem descrescente são: \n";
        for (Avaliacao ordenada: listaAvaliacoes){
            retornodaOrdem = retornodaOrdem.concat(ordenada.toString()+"\n");
        }
        return retornodaOrdem;
    }
    public String ordenarAvaliacoesAlunoMenor(){
        ArrayList<Avaliacao> listaAvaliacoes = new ArrayList<>();
        OrdenarAvaliacaoMenorPonto ord = new OrdenarAvaliacaoMenorPonto();
        for (Disciplina count : historicoDisciplinas){
            for (Avaliacao avaliacoes: count.getAvaliacoesDisciplina()){
                listaAvaliacoes.add(avaliacoes);
            }
        }
        Collections.sort(listaAvaliacoes,ord);
        String retornodaOrdem="As avaliacoes do aluno em ordem crescente são: \n";
        for (Avaliacao ordenada: listaAvaliacoes){
            retornodaOrdem = retornodaOrdem.concat(ordenada.toString()+"\n");
        }
        return retornodaOrdem;
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
        String desc = getTratamento() + " Telefone: " + telefone    + "\n(" + email + ")";
        return desc;
    }
    public int calculaIRA(){
        int ira = 0;
        if (this.historicoDisciplinas.isEmpty()) {
            return -1;
        }else {for (int i = 0; i < historicoDisciplinas.size(); i++) {
            ira += historicoDisciplinas.get(i).calculaMedia();
        }
        return ira / historicoDisciplinas.size();}
    }
    public String emitirHistorico(){
        return toString();
    }
    public String emitirHistoricoAvalicoesOrdemAlfabetica(){
        ArrayList<Disciplina> disc = new ArrayList<>();
        OrdenarDisciplinasOrdemAlfabetica ord = new OrdenarDisciplinasOrdemAlfabetica();
        String historico = "\n Historico de disciplinas do(a) " +
                getTratamento()+" de matricula: "+
                getMatricula()+"\n";
        Collections.sort(historicoDisciplinas,ord);
        for (Disciplina di: historicoDisciplinas){
            historico = historico.concat(di.toString());
        }return historico;
    }

    @Override
    public String toString() {
        String historico = "\n Historico de disciplinas do(a) " +
                getTratamento()+" de matricula: "+
                getMatricula()+"\n";
        for (int i =0;i< historicoDisciplinas.size();i++){
            historico = historico.concat(historicoDisciplinas.get(i).toString());
        }return historico;
    }
}
