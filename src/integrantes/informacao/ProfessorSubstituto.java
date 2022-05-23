package integrantes.informacao;

public class ProfessorSubstituto {
    private String nome;
    private String numero;
    private String email;
    private String departamento;
    private int numAulas;
    private static double valorHoraAula;



    public ProfessorSubstituto(String nome, String numero, String email, String departamento, int numAulas){
        this.nome = nome;
        this.numero = numero;
        this.email = email;
        this.departamento = departamento;
        this.numAulas = numAulas;
    }
    public ProfessorSubstituto(double valorHora){
        valorHoraAula = valorHora;
    }
    public String getDesc(){
        String desc = "Prof(a): "+nome+" Telefone: "+numero+"\n("+email+")\n"+"departamento: "+departamento+" - "+numAulas+" aulas mensais.";
        return desc;
    }
    @Override
    public String toString(){
        return getDesc();
    }
}
