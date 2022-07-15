package integrantes.testes;
import integrantes.informacao.*;

public class testeColegio {
    public static void main(String[] args) {
        //Aluno.date = LocalDate.now();
        Aluno a1 = new Aluno("Igor Rosa",
                "3298800000",
                "igorrosa@igorrosa.com");
        System.out.println(a1.getDesc());
        //Aluno.date.plusYears(1);
        Aluno a2 = new Aluno("Igor Rosa",
                "3298800000",
                "igorrosa@igorrosa.com");
        ProfessorEfetivo pe1 = new ProfessorEfetivo("Hilton martins",
                "329999999",
                "hiltonmartins@ifsudeste.com",
                "01/01/2001",
                new Regime("Dedicacao Exclusiva",1800.00),
                "Departamento de TI");
        System.out.println(pe1.getDesc());
        ProfessorSubstituto ps1 = new ProfessorSubstituto("prof.igu",
                "329999999",
                "igor@ifsudeste.com",
                "ti",
                20,45.50);
        System.out.println(ps1.getDesc());
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
        //System.out.println((ds1.toString()));
        a1.novaDisc(ds1);
        a1.novaDisc(ds2);
        a2.novaDisc(ds3);
        a1.novaDisc(ds3);
        System.out.println(a1.imprimirHistorico());
        //System.out.println(a1.toString());
        System.out.println(a1.getMatricula());
        System.out.println(a2.getMatricula());
        System.out.println(ds1.getID());
        System.out.println(av1.getIdAv());
        System.out.println(av2.getIdAv());
        System.out.println(a2.imprimirHistorico());
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
    }

}
