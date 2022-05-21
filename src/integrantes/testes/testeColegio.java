package integrantes.testes;
import integrantes.informacao.*;

public class testeColegio {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Igor Rosa",
                "3298800000",
                "igorrosa@igorrosa.com",
                2);
        System.out.println(a1.getDesc());
        ProfessorEfetivo pe1 = new ProfessorEfetivo("Hilton martins",
                "329999999",
                "hiltonmartins@ifsudeste.com",
                "ti",
                8000.00,
                "01/01/2001");
        System.out.println(pe1.getDesc());
        ProfessorSubstituto ps1 = new ProfessorSubstituto("prof.igu",
                "329999999",
                "igor@ifsudeste.com",
                "ti",
                20);
        System.out.println(ps1.getDesc());
        Avaliacao av1 = new Avaliacao("Prim Prova",9.00);
        Avaliacao av2 = new Avaliacao("Segunda prova",4.00);
        Avaliacao av3 = new Avaliacao("Terceira prova", 6.00);
        Avaliacao av4 = new Avaliacao("Quarta Avaliacao",5.41);
        Disciplina ds1 = new Disciplina("Algoritmos",4);
        ds1.novaAvaliacao(av1);
        ds1.novaAvaliacao(av2);
        ds1.novaAvaliacao(av3);
        ds1.novaAvaliacao(av4);
        System.out.println((ds1.toString()));
        a1.novaDisc(ds1);
        a1.novaDisc(ds1);
        a1.imprimirHistorico();
    }

}
