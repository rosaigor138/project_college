package integrantes.informacao;

public class Avaliacao {
    private String descricao;
    private double valor;

    public Avaliacao(String descricao, double valor){
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDesc() {
       String desc = "Essa e a: "+descricao+" e ela vale: "+valor;
       return desc;
    }


    @Override
    public String toString() {
        return getDesc();
    }
}
