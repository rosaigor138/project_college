package integrantes.informacao;

public class Avaliacao {
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
        String idAv;
        return  idAv = "A"+id;
    }
    public String getDesc() {
       String desc = "Essa e a: "+descricao+" e ela vale: "+valor;
       return desc;
    }
    public double getValor(){
        return this.valor;
    }

    @Override
    public String toString() {
        return getDesc();
    }
}
