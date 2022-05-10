package integrantes.informacao;

public class ProfessorEfetivo {
    private String nome;
    private String telefone;
    private String email;
    private String departamento;
    private double salario;
    private String dataContrat;

    public ProfessorEfetivo(String nome, String telefone, String email, String departamento, double salario, String dataContrat) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.departamento = departamento;
        this.salario = salario;
        this.dataContrat = dataContrat;
    }

    public String getDesc() {
        String desc = "Prof(a): " + nome +
                " - Telefone: " + telefone +
                "\n(" + email + ")\nDepartamento de " + departamento + " - Dedicação exclusiva\n" +
                "Salario:R$" + salario + "\nContratado em " + dataContrat;
        return desc;
    }


}
