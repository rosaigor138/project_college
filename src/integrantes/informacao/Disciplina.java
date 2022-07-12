package integrantes.informacao;
import java.util.ArrayList;
public class Disciplina {
    private String descricaoDisciplina;
    private ArrayList<Avaliacao> avaliacoesDisciplina;
    private static int contadorId = 0;
    private int id=0;


    public Disciplina(String materia) {
        this.descricaoDisciplina = materia;
        avaliacoesDisciplina = new ArrayList<Avaliacao>();
        Disciplina.contadorId++;
        this.id = contadorId;
    }
    public void novaAvaliacao(Avaliacao avaliacao){
        this.avaliacoesDisciplina.add(avaliacao);
    }
    public boolean temouNaoAAvaliacao(Avaliacao avaliacao){
        if (this.avaliacoesDisciplina.indexOf(avaliacao)<0){
            return false;
        }return true;
    }
    public void apagarAvaliacao(Avaliacao avaliacao){
        avaliacoesDisciplina.remove(avaliacao);
    }

    public String getID(){
        String identificador;
        return identificador = "D"+this.id;
    }
    public double calculaMedia(){
        double media = 0;
        for (int i = 0; i< this.avaliacoesDisciplina.size(); i++){
            media += avaliacoesDisciplina.get(i).getValor();

        }return media/this.avaliacoesDisciplina.size();
    }
    public String getDescricaoDisciplina(){
        return this.descricaoDisciplina;
    }

    @Override
    public String toString() {
        String text = "A Disciplina e: "+getDescricaoDisciplina()+" de Id:"+getID()+"\n";
        for (int i=0;i<this.avaliacoesDisciplina.size();i++){
            text = text.concat(this.avaliacoesDisciplina.get(i).toString()+"\n");
        }
        return text;
    }

}