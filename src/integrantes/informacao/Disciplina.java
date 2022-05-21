package integrantes.informacao;

public class Disciplina {
    private String descricaoDisciplina;
    private Avaliacao[] avaliacoesDisciplina;
    private int numAv;
    private int contador = 0;

    public Disciplina(String materia, int numAvaliacao) {
        this.descricaoDisciplina = materia;
        this.avaliacoesDisciplina = new Avaliacao[numAvaliacao];
        this.numAv = numAvaliacao;
    }

    /*public void novaAvaliacao(Avaliacao avaliacao){
        for (int i = 0; i < this.numAv; i++){
            if (this.avaliacoesDisciplina == null){
                this.avaliacoesDisciplina[i] = avaliacao;
            } else if (this.avaliacoesDisciplina != null ) {
            }
        }
    }*/
    public  void novaAvaliacao(Avaliacao avaliacao){
        if (this.contador < this.numAv){
            this.avaliacoesDisciplina[contador++] = avaliacao;
        }
    }

    public String getDescricaoDisciplina(){
        return this.descricaoDisciplina;
    }
    @Override
    public String toString() {
        String text = "A Disciplina e: "+this.descricaoDisciplina+"\n";
        for (int i=0;i<this.contador;i++){
            text = text.concat(this.avaliacoesDisciplina[i].toString()+"\n");
        }
        return text;
    }

}