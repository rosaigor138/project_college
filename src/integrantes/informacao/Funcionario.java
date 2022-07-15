package integrantes.informacao;

public abstract class Funcionario extends Pessoa{
    protected String departamento;

    public Funcionario(String nome,String telefone,String email, String departamento){
        super(nome, telefone, email);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
}
