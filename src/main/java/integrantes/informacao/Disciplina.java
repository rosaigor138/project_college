package integrantes.informacao;
import integrantes.api.genericsArray.TratamentoArraylist;

import java.util.List;

public class Disciplina{
    private String descricaoDisciplina;
    private TratamentoArraylist<Avaliacao> avaliacoesDisciplina;
    private static int contadorId = 0;
    private int id=0;


    public Disciplina(String materia) {
        this.descricaoDisciplina = materia;
        avaliacoesDisciplina = new TratamentoArraylist<>();
        Disciplina.contadorId++;
        this.id = contadorId;
    }
    public void novaAvaliacao(Avaliacao avaliacao){
        this.avaliacoesDisciplina.adiciona(avaliacao);
    }

    public List<Avaliacao> getAvaliacoesDisciplina() {
        return avaliacoesDisciplina.getArray();
    }
    public boolean estaVazia(){
        return this.avaliacoesDisciplina.estaVazia();
    }
    public boolean temouNaoAAvaliacao(Avaliacao avaliacao){
        return this.avaliacoesDisciplina.temOuNao(avaliacao);
    }
    public void adicionaEmGrupo(List<Avaliacao> l){
        this.avaliacoesDisciplina.adicionaEmGrupo(l);
    }
    public void apagarAvaliacao(Avaliacao avaliacao){
        avaliacoesDisciplina.retira(avaliacao);
    }

    public String getID(){
        return "D"+this.id;
    }
    public double calculaMedia(){
        double media = 0;
        for (int i = 0; i< this.avaliacoesDisciplina.tamanho(); i++){
            media += avaliacoesDisciplina.retornaObj(i).getValor();

        }return media/this.avaliacoesDisciplina.tamanho();
    }
    public String getDescricaoDisciplina(){
        return this.descricaoDisciplina;
    }
    @Override
    public String toString() {
        String text = "A Disciplina e: "+getDescricaoDisciplina()+" de Id:"+getID()+"\n";
        for (int i=0;i<this.avaliacoesDisciplina.tamanho();i++){
            text = text.concat(this.avaliacoesDisciplina.retornaObj(i).toString()+"\n");
        }
        return text;
    }
}