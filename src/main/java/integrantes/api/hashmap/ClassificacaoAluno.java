package integrantes.api.hashmap;
import integrantes.informacao.Aluno;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ClassificacaoAluno {
    private static Map<Aluno,String> classificacao =  new HashMap<>();

    public static boolean estaVazia(){
        return classificacao.isEmpty();
    }
    public static void atribuiAluno(Aluno aluno){
         if (aluno.calculaIRA()>89){
            classificacao.put(aluno,"A");
        } else if (aluno.calculaIRA()>69 && aluno.calculaIRA()<90) {
            classificacao.put(aluno,"B");
        } else {
            classificacao.put(aluno,"C");
        }
    }
    public static String getClassificacaoAluno(Aluno al){
        ClassificacaoAluno.atualizaAluno(al);//atualizar para retornar um valor
        // atualizado a cada chamada
        return classificacao.get(al);
    }
    public static void atualizaAluno(Aluno aluno){
        ClassificacaoAluno.atribuiAluno(aluno);
    }
    public static Set<Aluno> getLista(){
        for (Aluno i:classificacao.keySet()){
            ClassificacaoAluno.atualizaAluno(i);
        }
        Set<Aluno> lista = classificacao.keySet();
        return lista;
    }
}
