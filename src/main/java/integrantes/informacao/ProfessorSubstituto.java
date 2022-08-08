package integrantes.informacao;

import integrantes.api.interfaces.Tratamento;

public class ProfessorSubstituto extends Funcionario implements Tratamento {
    private int numAulas;
    private static double valorHoraAula;
    public ProfessorSubstituto(String nome, String telefone, String email,
                               String departamento, int numAulas,double valorHoraAula,boolean sexo){
        super(nome,telefone,email,departamento,sexo);
        this.departamento = departamento;
        this.numAulas = numAulas;
        this.valorHoraAula = valorHoraAula;
    }
    public String getTratamento(){
        if (sexo){
            return "Profa Sub "+getNome();
        }else return "Prof Sub "+getNome();
    }
    public String identificacao(){
        return "E um professor substituto";
    }
    public static double getValorHoraAula() {
        return valorHoraAula;
    }
    public int getNumAulas() {
        return numAulas;
    }
    @Override
    public String toString(){
        return getTratamento() + " Telefone: " + getTelefone() + "\n(" + getEmail() + ")\n" +
                "departamento: " + getTelefone() + " - " + getNumAulas() + " aulas mensais.";
    }

    @Override
    public double calculaSalario() {
        return this.valorHoraAula * this.getNumAulas();
    }
}
