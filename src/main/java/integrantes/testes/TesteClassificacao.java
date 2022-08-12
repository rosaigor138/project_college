package integrantes.testes;

import integrantes.api.exception.invalidValueException;
import integrantes.api.hashmap.ClassificacaoAluno;
import integrantes.informacao.*;

public class TesteClassificacao {
    public static void main(String[] args) throws invalidValueException {
    //Criação dos alunos
    Aluno a1 = new Aluno("Igor","880808090","igorrosa@",false);
    Aluno a2 = new Aluno("Maria","999999999","Maria@",true);
    Aluno a3 = new Aluno("NOta 0","sem tel","sem @",true);
    //Criação das disciplinas
    Disciplina matematica1 = new Disciplina("Matematica 1");
    Disciplina portugues1 = new Disciplina("Portugues 1");
    //Criação das avaliaçoes
    Avaliacao av1 = new Avaliacao("1 prova portugues",25);
    Avaliacao av2 = new Avaliacao("2 prova portugues",30);
    Avaliacao av3 = new Avaliacao("3 prova portugues",50);
    Avaliacao av4 = new Avaliacao("1 prova matematica",99);
    Avaliacao av5 = new Avaliacao("2 prova matematica",90);
    Avaliacao av6 = new Avaliacao("3 prova matematica",90);
    //Inserção das avaliaçoes nas matérias
    portugues1.novaAvaliacao(av1);
    portugues1.novaAvaliacao(av2);
    portugues1.novaAvaliacao(av3);
    matematica1.novaAvaliacao(av4);
    matematica1.novaAvaliacao(av5);
    matematica1.novaAvaliacao(av6);
    a1.novaDisc(portugues1);
    a2.novaDisc(matematica1);
        //Teste de se o map está vazio antes de inserir algo
    System.out.println(ClassificacaoAluno.estaVazia());
        //Atribuição dos alunos ao hashmap
    ClassificacaoAluno.atribuiAluno(a1);
    ClassificacaoAluno.atribuiAluno(a2);
    ClassificacaoAluno.atribuiAluno(a3);
        //teste de verificação se foi inserido
    System.out.println(ClassificacaoAluno.estaVazia());
        //teste para pegar classificações individuais
    System.out.println(ClassificacaoAluno.getClassificacaoAluno(a1));
    System.out.println(ClassificacaoAluno.getClassificacaoAluno(a2));
    System.out.println(ClassificacaoAluno.getClassificacaoAluno(a3));//deve dar null pois esse aluno nn possui ira
    String alunosclassificados ="";
        for (Aluno a:ClassificacaoAluno.getLista()) {
            alunosclassificados = alunosclassificados.concat
                    (a.getTratamento()+" "+ClassificacaoAluno.getClassificacaoAluno(a)+"\n");
        }

    System.out.println(alunosclassificados);
    }
}
