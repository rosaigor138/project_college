package integrantes.informacao;

import integrantes.interfaces.Tratamento;

public class ProfessorEfetivo extends Funcionario implements Tratamento {
    private String dataContrat;
    private Regime regime;
    public ProfessorEfetivo(String nome,
                            String telefone,
                            String email,
                            String dataContrat,
                            Regime regime,
                            String departamento,boolean sexo) {
        super(nome, telefone, email, departamento, sexo);
        this.dataContrat = dataContrat;
        this.regime = regime;
    }

    public String getTratamento(){
        if (sexo){
            return "Profa Efetiva "+getNome();
        }else return "Prof Efetivo "+getNome();
    }
    @Override
    public double calculaSalario(){
        return regime.getSalario();
    }
    public boolean getDedicacao(){
        return regime.getDedicacao();
    }
    @Override
    public String identificacao(){
        return "E um professor efetivo";
    }

    @Override
    public String toString(){
        String desc = getTratamento()+
                " - Telefone: " + telefone +
                "\n(" + email + ")\nDepartamento de " + departamento +"\n" +
                "Salario:R$" + regime.getSalario() + "\nContratado em " + dataContrat;
        return desc;
    }
}
