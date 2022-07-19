package integrantes.informacao;

public class Regime {
    private String descricao;
    private double salario;

    public Regime(String descricao,double salario){
        this.descricao = descricao;
        this.salario = salario;
    }
    public String getDescricao(){
        return descricao;
    }
    public double getSalario(){
        return salario;
    }
}
