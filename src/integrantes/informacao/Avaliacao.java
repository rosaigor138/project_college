package integrantes.informacao;

public class Avaliacao{
    private String descricao;
    private double valor;
    private static int contadorId =0;
    private int id;

    public Avaliacao(String descricao, double valor){
        this.descricao = descricao;
        this.valor = valor;
        Avaliacao.contadorId++;
        this.id = contadorId;
    }
    public String getIdAv(){
        return  "A"+id;
    }
<<<<<<< Updated upstream
    public String getDesc() {
       return "Essa e a: "+descricao+" e ela vale: "+valor;
    }
=======
>>>>>>> Stashed changes
    public double getValor(){
        return this.valor;
    }

    @Override
    public String toString() {
        return "Essa e a: "+descricao+" e ela vale: "+valor;
    }
}
