package integrantes.informacao;

public class ProfessorSubstituto extends Funcionario implements Descricoes {
    private String departamento;
    private int numAulas;
    private static double valorHoraAula;



    public ProfessorSubstituto(String nome, String telefone, String email,
                               String departamento, int numAulas,double valorHoraAula){
        super(nome,telefone,email,departamento);
        this.departamento = departamento;
        this.numAulas = numAulas;
        this.valorHoraAula = valorHoraAula;
    }
    public String getDesc(){
        String desc = "Prof(a): "+getNome()+" Telefone: "+getTelefone()+"\n("+getEmail()+")\n"+
                "departamento: "+getTelefone()+" - "+getNumAulas()+" aulas mensais.";
        return desc;
    }

    public static double getValorHoraAula() {
        return valorHoraAula;
    }

    public int getNumAulas() {
        return numAulas;
    }

    @Override
    public String toString(){
        return getDesc();
    }
}
