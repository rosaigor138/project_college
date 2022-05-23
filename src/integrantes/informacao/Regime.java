package integrantes.informacao;

public class Regime {
    private String descricao;//podendo ser coisas como, dedicação exclusiva,20hrs,10hrs
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
