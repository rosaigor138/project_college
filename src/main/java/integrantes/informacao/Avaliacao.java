package integrantes.informacao;

import integrantes.api.exception.invalidValueException;

public class Avaliacao{
    private String descricao;
    private int valor;
    private static int contadorId =0;
    private int id;
    public Avaliacao(String descricao, int valor){
        setDescricao(descricao);
        try {
            setValor(valor);
        }catch (invalidValueException ex){
            //this.valor = 0;
            System.out.println(ex);
        }
        Avaliacao.contadorId++;
        setId(contadorId);
    }
    public String getIdAv(){
        return  "A"+id;
    }
    public String getDesc() {
       return "Essa e a: "+descricao+" e ela vale: "+valor;
    }
    public int getValor(){
        return this.valor;
    }

    @Override
    public String toString() {
        return "Essa e a: "+descricao+" e ela vale: "+valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(int valor) throws invalidValueException {
        if (valor < 0 || valor > 100){
            throw new invalidValueException("Valor da avaliacao invalido. \n" +
                    "Favor chame o metodo novamente e insira um valor valido");
        }else {this.valor=valor;}
    }

    public static void setContadorId(int contadorId) {
        Avaliacao.contadorId = contadorId;
    }

    public void setId(int id) {
        this.id = id;
    }
}
