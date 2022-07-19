package integrantes.informacao;

public abstract class Funcionario extends Pessoa{
    protected String departamento;

    public Funcionario(String nome,String telefone,String email, String departamento,boolean sexo){
        super(nome, telefone, email,sexo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
}
