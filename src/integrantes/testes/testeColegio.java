package integrantes.testes;
import integrantes.informacao.ProfessorEfetivo;
import integrantes.informacao.ProfessorSubstituto;
import integrantes.informacao.Aluno;

public class testeColegio {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Igor Rosa","3298800000","igorrosa@igorrosa.com");
        ProfessorEfetivo pe1 = new ProfessorEfetivo("Hilton martins","329999999","hiltonmartins@ifsudeste.com","ti",8000.00,"01/01/2001");
        ProfessorSubstituto ps1 = new ProfessorSubstituto("profigu","329999999","igor@ifsudeste.com","ti",20);

        System.out.println(pe1.getDesc());
        System.out.println(a1.getDesc());
        System.out.println(ps1.getDesc());
    }

}
