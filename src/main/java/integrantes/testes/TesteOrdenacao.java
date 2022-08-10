package integrantes.testes;
import integrantes.informacao.*;
public class TesteOrdenacao {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Igor Rosa",
                "3298800000",
                "igorrosa@igorrosa.com",false);
        Avaliacao av1 = new Avaliacao("1 Prova Algoritmos",10);
        Avaliacao av2 = new Avaliacao("2 Prova Algoritmos",80);
        Avaliacao av3 = new Avaliacao("3 Prova Algoritmos", 13);
        Avaliacao av4 = new Avaliacao("4 Prova Algoritmos",75);
        //avaliacoes acima criadas para a primeira disciplina
        Avaliacao av5 = new Avaliacao("1 Prova matematica",82);
        Avaliacao av6 = new Avaliacao("2 Prova matematica",73);
        Avaliacao av7 = new Avaliacao("3 Prova matematica", 50);
        Avaliacao av8 = new Avaliacao("4 Prova matematica", 100);
        //avaliacoes acima criadas para a seg discplina

        Disciplina ds1 = new Disciplina("Algoritmos");
        ds1.novaAvaliacao(av1);
        ds1.novaAvaliacao(av2);
        ds1.novaAvaliacao(av3);
        ds1.novaAvaliacao(av4);
        Disciplina ds2 = new Disciplina("Matematica");
        ds2.novaAvaliacao(av5);
        ds2.novaAvaliacao(av6);
        ds2.novaAvaliacao(av7);
        ds2.novaAvaliacao(av8);

        Disciplina ds3 = new Disciplina("Portugues");
        ds3.novaAvaliacao(av1);
        ds3.novaAvaliacao(av2);
        ds3.novaAvaliacao(av3);
        ds3.novaAvaliacao(av4);
        a1.novaDisc(ds1);
        a1.novaDisc(ds2);
        a1.novaDisc(ds3);
        System.out.println("\n--TESTE AVALIACOES ORDEM CRESCENTE--" + "\n");
        System.out.println(a1.ordenarAvaliacoesAlunoMaior());
        System.out.println("\n--TESTE AVALIACOES ORDEM DECRESCENTE--" + "\n");
        System.out.println(a1.ordenarAvaliacoesAlunoMenor());
        System.out.println("\n--TESTE DISCIPLINAS ORDEM ALFABETICA--" + "\n");
        System.out.println(a1.emitirHistoricoAvalicoesOrdemAlfabetica());
        System.out.println(a1.temouNaoADisciplina(ds1));
    }
}
