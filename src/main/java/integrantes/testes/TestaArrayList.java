package integrantes.testes;

import integrantes.informacao.Aluno;
import integrantes.informacao.Avaliacao;
import integrantes.informacao.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class TestaArrayList {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Igor Rosa",
                "3298800000",
                "igorrosa@igorrosa.com", false);
        Avaliacao av1 = new Avaliacao("1 Prova Algoritmos",10);
        Avaliacao av2 = new Avaliacao("2 Prova Algoritmos",80);
        Avaliacao av3 = new Avaliacao("3 Prova Algoritmos", 13);
        Avaliacao av4 = new Avaliacao("4 Prova Algoritmos",75);
        Disciplina ds1 = new Disciplina("Algoritmos");
        System.out.println(a1.estaVazia());
        System.out.println(a1.temouNaoADisciplina(ds1));
        a1.novaDisc(ds1);
        System.out.println(a1.temouNaoADisciplina(ds1));
        System.out.println(a1.estaVazia());

        System.out.println(ds1.estaVazia());
        List<Avaliacao> testaAddGrupo = new ArrayList<>();
        testaAddGrupo.add(av1);
        testaAddGrupo.add(av2);
        testaAddGrupo.add(av3);
        testaAddGrupo.add(av4);
        ds1.adicionaEmGrupo(testaAddGrupo);
        System.out.println(ds1.estaVazia());
        System.out.println(ds1.temouNaoAAvaliacao(av3));
        ds1.apagarAvaliacao(av3);
        System.out.println(ds1.temouNaoAAvaliacao(av3));
    }
}