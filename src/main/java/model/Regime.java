package model;

public class Regime {
    private boolean dedicacao;//true para exclusiva e false para não
    private double salario;

    public Regime(boolean dedicacao){
        this.dedicacao = dedicacao;
        if (dedicacao){
            this.salario = 1800.00;
        }else this.salario = 1200.00;
    }
    public boolean getDedicacao(){
        return dedicacao;
    }
    public double getSalario(){
        return salario;
    }
}
