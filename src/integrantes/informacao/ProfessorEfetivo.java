package integrantes.informacao;

public class ProfessorEfetivo {
    private String nome;
    private String telefone;
    private String email;
    private String dataContrat;
    private Regime regime;
    private String departamento;
    public ProfessorEfetivo(String nome,
                            String telefone,
                            String email,
                            String dataContrat,
                            Regime regime,
                            String departamento) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataContrat = dataContrat;
        this.regime = regime;
        this.departamento = departamento;
    }

    public String getDesc() {
        String desc = "Prof(a): " + nome +
                " - Telefone: " + telefone +
                "\n(" + email + ")\nDepartamento de " + departamento +"\n" +
                "Salario:R$" + regime.getSalario() + "\nContratado em " + dataContrat;
        return desc;
    }


}
