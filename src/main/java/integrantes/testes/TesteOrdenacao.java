package integrantes.testes;
import integrantes.informacao.*;
public class TesteOrdenacao {
    public static void main(String[] args) {
            //criação do aluno que tera os dados ordenados
        Aluno a1 = new Aluno("Igor Rosa",
                "3298800000",
                "igorrosa@igorrosa.com",false);
            //Criação das avaliações do aluno
        //avaliações para a primeira disciplina
        Avaliacao av1 = new Avaliacao("1 Prova Algoritmos",10);
        Avaliacao av2 = new Avaliacao("2 Prova Algoritmos",80);
        Avaliacao av3 = new Avaliacao("3 Prova Algoritmos", 13);
        Avaliacao av4 = new Avaliacao("4 Prova Algoritmos",75);
        //Avaliações para a segunda disciplina
        Avaliacao av5 = new Avaliacao("1 Prova matematica",82);
        Avaliacao av6 = new Avaliacao("2 Prova matematica",73);
        Avaliacao av7 = new Avaliacao("3 Prova matematica", 50);
        Avaliacao av8 = new Avaliacao("4 Prova matematica", 100);
            //Criação das disciplinas e inserção das avaliacoes
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
            //disciplina adicionada para testar a ordem alfabetica
        Disciplina ds3 = new Disciplina("B");
        ds3.novaAvaliacao(av1);
        ds3.novaAvaliacao(av2);
        ds3.novaAvaliacao(av3);
        ds3.novaAvaliacao(av4);
        //inserção das disciplinas no aluno
        a1.novaDisc(ds1);
        a1.novaDisc(ds2);


        System.out.println("\n--TESTE AVALIACOES ORDEM CRESCENTE--" + "\n");
        System.out.println(a1.ordenarAvaliacoesAlunoMaior());
        System.out.println("\n--TESTE AVALIACOES ORDEM DECRESCENTE--" + "\n");
        System.out.println(a1.ordenarAvaliacoesAlunoMenor());
        System.out.println("\n--TESTE DISCIPLINAS ORDEM ALFABETICA--" + "\n");
        a1.novaDisc(ds3);
        System.out.println(a1.emitirHistoricoAvalicoesOrdemAlfabetica());
    }
}
