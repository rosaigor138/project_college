package integrantes.informacao;

public class ProfessorEfetivo extends Funcionario {
    private String nome;
    private String telefone;
    private String email;
    private String dataContrat;
    private Regime regime;
    public ProfessorEfetivo(String nome,
                            String telefone,
                            String email,
                            String dataContrat,
                            Regime regime,
                            String departamento) {
        super(nome,telefone,email,departamento);
        this.dataContrat = dataContrat;
        this.regime = regime;
    }

    public String getDesc() {
        String desc = "Prof(a): " + nome +
                " - Telefone: " + telefone +
                "\n(" + email + ")\nDepartamento de " + departamento +"\n" +
                "Salario:R$" + regime.getSalario() + "\nContratado em " + dataContrat;
        return desc;
    }


}
