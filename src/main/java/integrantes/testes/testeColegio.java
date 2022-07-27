package integrantes.testes;
import model.*;

public class testeColegio {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Igor Rosa",
                "3298800000",
                "igorrosa@igorrosa.com",false);
        System.out.println(a1.getDesc());
        //Aluno.date.plusYears(1);
        Aluno a2 = new Aluno("maria",
                "3298800000",
                "maria@maria.com",true);
        ProfessorEfetivo pe1 = new ProfessorEfetivo("Hilton martins",
                "329999999",
                "hiltonmartins@ifsudeste.com",
                "01/01/2001",
                new Regime(true),
                "Departamento de TI",false);
        System.out.println(pe1.toString());
        ProfessorSubstituto ps1 = new ProfessorSubstituto("maria",
                "329999999",
                "maria@ifsudeste.com",
                "ti",
                20,45.50,true);
        System.out.println(ps1.toString());
        Avaliacao av1 = new Avaliacao("Prim Prova",9.00);
        Avaliacao av2 = new Avaliacao("Segunda prova",4.00);
        Avaliacao av3 = new Avaliacao("Terceira prova", 6.00);
        Avaliacao av4 = new Avaliacao("Quarta Avaliacao",5.41);
        Avaliacao avt = new Avaliacao("Avaliacao teste",0.00);
        Disciplina ds1 = new Disciplina("Algoritmos");
        Disciplina ds2 = new Disciplina("Matematica");
        Disciplina ds3 = new Disciplina("Algoritmos");
        ds1.novaAvaliacao(av1);
        ds1.novaAvaliacao(av2);
        ds1.novaAvaliacao(av3);
        ds1.novaAvaliacao(av4);
        ds2.novaAvaliacao(av1);
        ds2.novaAvaliacao(av2);
        ds2.novaAvaliacao(av3);
        ds2.novaAvaliacao(av4);
        ds3.novaAvaliacao(av1);
        ds3.novaAvaliacao(av2);
        ds3.novaAvaliacao(av3);
        ds3.novaAvaliacao(av4);
        a1.novaDisc(ds1);
        a1.novaDisc(ds2);
        a2.novaDisc(ds3);
        a1.novaDisc(ds3);
        System.out.println(a1.emitirHistorico());
        System.out.println(a1.getMatricula());
        System.out.println(a2.getMatricula());
        System.out.println(ds1.getID());
        System.out.println(av1.getIdAv());
        System.out.println(av2.getIdAv());
        System.out.println(a2.emitirHistorico());
        System.out.println(ds1.calculaMedia());
        System.out.println(a1.calculaIRA());
        System.out.println(a1.temouNaoADisciplina(ds3));
        System.out.println(a1.temouNaoADisciplina(ds2));
        a1.apagarDisciplina(ds3);
        ds3.novaAvaliacao(avt);
        System.out.println(ds3.temouNaoAAvaliacao(avt));
        System.out.println(a1.temouNaoADisciplina(ds3));
        System.out.println(ds1.temouNaoAAvaliacao(av1));
        System.out.println(ds3.toString());
        ds3.apagarAvaliacao(avt);
        System.out.println(ds3.toString());
        System.out.println(IdentificadorPessoa.IdentificarPessoa(a1));
        System.out.println(IdentificadorPessoa.IdentificarPessoa(ps1));
        System.out.println(ps1.getSalarioMesAtual());
        System.out.println(IdentificadorPessoa.IdentificarPessoa(pe1));
        System.out.println(pe1.getSalario());
    }

}
