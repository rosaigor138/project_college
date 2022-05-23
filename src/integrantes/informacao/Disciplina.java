package integrantes.informacao;

public class Disciplina {
    private String descricaoDisciplina;
    private Avaliacao[] avaliacoesDisciplina;
    private int numAv;
    private int contador = 0;

    private static int contadorId = 0;
    private int id=0;


    public Disciplina(String materia, int numAvaliacao) {
        this.descricaoDisciplina = materia;
        this.avaliacoesDisciplina = new Avaliacao[numAvaliacao];
        this.numAv = numAvaliacao;
        Disciplina.contadorId++;
        this.id = contadorId;
    }
    public  void novaAvaliacao(Avaliacao avaliacao){
        if (this.contador < this.numAv){
            this.avaliacoesDisciplina[contador++] = avaliacao;
        }
    }
    public String getID(){
        String identificador;
        return identificador = "D"+this.id;
    }
    public double calculaMedia(){
        double media = 0;
        for (int i = 0; i< this.contador; i++){
            media += avaliacoesDisciplina[i].getValor();

        }return media/contador;
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